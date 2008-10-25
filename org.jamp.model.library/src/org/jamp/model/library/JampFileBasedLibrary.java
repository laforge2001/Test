package org.jamp.model.library;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.ui.progress.UIJob;
import org.jamp.model.MediaObject;
import org.jamp.model.music.api.MusicObject;
import org.jamp.model.query.IJampQuery;
import org.jamp.model.viewer.IJampLibraryViewer;
import org.jamp.music.mp3.api.Mp3API;

public class JampFileBasedLibrary implements IJampLibrary, Serializable {

	private final IPreferencesService _prefService = Platform
			.getPreferencesService();

	private List<String> _locations = new ArrayList<String>();

	private final Collection<File> _names = new ArrayList<File>();

	private final Map<String, MediaObject> _library = Collections
			.synchronizedMap(new HashMap<String, MediaObject>());

	private final Set<IJampLibraryViewer> _listener = Collections
			.synchronizedSet(new HashSet<IJampLibraryViewer>());

	private static final long serialVersionUID = -5679254328240338749L;

	private void notifyListeners() {
		for (Iterator iterator = _listener.iterator(); iterator.hasNext();) {
			PropertyChangeListener name = (PropertyChangeListener) iterator
					.next();
			name.propertyChange(null);
		}
	}

	public void addChangeListener(IJampLibraryViewer newListener) {
		_listener.add(newListener);
	}

	public void removeChangeListener(IJampLibraryViewer listener) {
		_listener.remove(listener);
	}

	private List<String> parseString(String stringList) {
		StringTokenizer st = new StringTokenizer(stringList, File.pathSeparator
				+ "\n\r");//$NON-NLS-1$
		ArrayList<String> v = new ArrayList<String>();
		while (st.hasMoreElements()) {
			v.add((String) st.nextElement());
		}
		return v;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MediaObject> get(IJampQuery query) {
		List<MediaObject> result = new ArrayList<MediaObject>();
		List<Entry> entries = new ArrayList<Entry>();
		synchronized (_library) {
			entries.addAll(_library.entrySet());
		}

		for (Entry entry : entries) {
			if (query.isSatisfiedBy(entry.getValue())) {
				result.add((MediaObject) entry.getValue());
			}
		}

		return result;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public synchronized void add(MediaObject addMe) {
		_library.put(addMe.getURL(), addMe);
		System.out.println(addMe.getURL());

		Iterator<IJampLibraryViewer> next = _listener.iterator();
		while (next.hasNext()) {
			next.next().addMediaObject(addMe);
		}
	}

	@Override
	public void remove(MediaObject removeMe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFromDatastore(MediaObject deleteMe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(MediaObject updateMe) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public void updateLibrary(final String paths) {
		UIJob job = new UIJob("My First Job") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				_locations = parseString(paths);

				for (String s : _locations) {
					File test = new File(s);
					_names.addAll(FileUtils.listFiles(test,
							new String[] { "mp3" }, true));

					if (monitor.isCanceled())
						return Status.CANCEL_STATUS;

				}
				for (File file : _names) {
					MusicObject addMe = new MusicObject(file.getAbsolutePath(),
							new Mp3API());
					add(addMe);
					_library.put(file.getAbsolutePath(), addMe);
					System.out.println(file.getAbsolutePath());
					if (monitor.isCanceled())
						return Status.CANCEL_STATUS;
				}

				return Status.OK_STATUS;
			}

		};
		job.setUser(true);
		job.schedule();
		// notifyListeners();

	}

	@Override
	public void updateLibrary() {
		// TODO Auto-generated method stub

	}
}
