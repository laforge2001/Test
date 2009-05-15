package org.jamp.ui.library.navigator;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.jamp.model.LibraryParent;
import org.jamp.model.NodeObject;
import org.jamp.model.music.Album;
import org.jamp.model.music.Artist;
import org.jamp.model.music.Genre;
import org.jamp.model.music.Rating;
import org.jamp.model.music.RecentlyAdded;
import org.jamp.model.music.Songs;
import org.jamp.model.music.Year;

public class LibraryContentProvider implements ITreeContentProvider {

	private static final Object[] EMPTY_ARRAY = new Object[0];
	private LibraryParent _library;

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Root) {
			if (_library == null) {
				initializeLibrary();
			}
			return _library.getChildren().toArray();
		} else if (parentElement instanceof NodeObject) {
			return ((NodeObject) parentElement).getChildren().toArray();
		} else {
			return EMPTY_ARRAY;
		}
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof LibraryParent) {
			return new Root();
		} else if (element instanceof NodeObject) {
			return ((NodeObject) element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof Root || element instanceof LibraryParent) {
			return true;
		} else if (element instanceof NodeObject) {
			return ((NodeObject) element).hasChildren();
		}
		return false;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public void dispose() {
		_library = null;
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	private void initializeLibrary() {
		_library = new LibraryParent("", null);
		NodeObject _musicParent = new NodeObject("Music", null);
		NodeObject _videoParent = new NodeObject("Videos", null);
		NodeObject _pictureParent = new NodeObject("Pictures", null);

		_library.addChild(_musicParent);
		_library.addChild(_videoParent);
		_library.addChild(_pictureParent);

		_musicParent.addChild(new RecentlyAdded(null));
		_musicParent.addChild(new Artist(null));
		_musicParent.addChild(new Album(null));
		_musicParent.addChild(new Songs(null));
		_musicParent.addChild(new Genre(null));
		_musicParent.addChild(new Year(null));
		_musicParent.addChild(new Rating(null));

	}

}
