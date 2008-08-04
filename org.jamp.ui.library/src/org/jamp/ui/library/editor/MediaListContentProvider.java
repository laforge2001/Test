package org.jamp.ui.library.editor;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.jamp.model.MediaObject;
import org.jamp.model.Playlist;
import org.jamp.model.viewer.IPlayListViewer;

public class MediaListContentProvider implements IStructuredContentProvider,
		IPlayListViewer {

	private Playlist _playList;
	private TableViewer _tableViewer;

	public MediaListContentProvider(Playlist playlist, TableViewer tv) {
		_playList = playlist;
		_tableViewer = tv;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return _playList.getList().toArray();
	}

	@Override
	public void dispose() {
		_playList.removeChangeListener(this);

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput != null)
			((Playlist) newInput).addChangeListener(this);
		if (oldInput != null)
			((Playlist) oldInput).removeChangeListener(this);

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
