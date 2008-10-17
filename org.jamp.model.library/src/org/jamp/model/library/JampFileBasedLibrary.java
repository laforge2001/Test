package org.jamp.model.library;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.jamp.model.MediaObject;
import org.jamp.model.music.api.MusicObject;
import org.jamp.music.mp3.api.Mp3API;

public class JampFileBasedLibrary implements IJampLibrary, Serializable {

	private final IPreferencesService _prefService = Platform
			.getPreferencesService();

	private List<String> _locations = new ArrayList<String>();

	private final Collection<File> _names = new ArrayList<File>();

	private final HashMap<String, MediaObject> _library = new HashMap<String, MediaObject>();

	private static final long serialVersionUID = -5679254328240338749L;

	private List<String> parseString(String stringList) {
		StringTokenizer st = new StringTokenizer(stringList, File.pathSeparator
				+ "\n\r");//$NON-NLS-1$
		ArrayList<String> v = new ArrayList<String>();
		while (st.hasMoreElements()) {
			v.add((String) st.nextElement());
		}
		return v;
	}

	@Override
	public void add(MediaObject addMe) {
		// TODO Auto-generated method stub

	}

	@Override
	public MediaObject get(IJampQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

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

	@Override
	public void updateLibrary(String paths) {
		_locations = parseString(paths);

		for (String s : _locations) {
			File test = new File(s);
			_names.addAll(FileUtils.listFiles(test, new String[] { "mp3" },
					true));

		}
		for (File file : _names) {
			MusicObject addMe = new MusicObject(file.getAbsolutePath(),
					new Mp3API());
			_library.put(file.getAbsolutePath(), addMe);
			System.out.println(file.getAbsolutePath());
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLibrary() {
		// TODO Auto-generated method stub

	}
}
