package org.jamp.ui.library.editor;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.jamp.model.MediaObject;
import org.jamp.model.library.IJampLibrary;
import org.jamp.model.library.Playlist;
import org.jamp.model.query.IJampQuery;
import org.jamp.model.viewer.IJampLibraryViewer;

public class MediaListContentProvider implements IStructuredContentProvider,
		IJampLibraryViewer {

	private final Playlist _playList;
	private IJampQuery _query;
	private IJampLibrary _library;
	private final TableViewer _tableViewer;

	public MediaListContentProvider(IJampLibrary library, IJampQuery query,
			TableViewer tv) {
		_playList = null;
		_library = library;
		_query = query;
		_tableViewer = tv;
	}

	public MediaListContentProvider(Playlist playlist, TableViewer tv) {
		_playList = playlist;
		_tableViewer = tv;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return _library.get(_query).toArray();
	}

	@Override
	public void dispose() {
		_library.removeChangeListener(this);

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput != null)
			((IJampLibrary) newInput).addChangeListener(this);
		if (oldInput != null)
			((IJampLibrary) oldInput).removeChangeListener(this);

	}

	@Override
	public void addMediaObject(MediaObject task) {
		_tableViewer.add(task);

	}

	@Override
	public void removeMediaObject(MediaObject task) {
		_tableViewer.remove(task);
	}

	@Override
	public void updateMediaObject(MediaObject task) {
		_tableViewer.update(task, null);
	}

}
