package org.jamp.model.library;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jamp.model.MediaObject;
import org.jamp.model.viewer.IPlayListViewer;

public class Playlist implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4398528061055146208L;
	private final List<MediaObject> _playList = new ArrayList<MediaObject>();
	private MediaObject _currentlyPlaying = null;
	private String _name = new String();
	private final Set<IPlayListViewer> _changeListeners = new HashSet<IPlayListViewer>();

	public Playlist(String name, IJampLibrary library) {
		_name = name;
		// for (Iterator it = library.)
	}

	public Playlist(String name, List<MediaObject> testList) {
		_name = name;
		for (MediaObject m : testList) {
			_playList.add(m);
		}
	}

	public Playlist(Playlist copyMe) {
		this(copyMe._name, copyMe._playList);

	}

	public void add(MediaObject o) {
		_playList.add(o);
		Iterator<IPlayListViewer> next = _changeListeners.iterator();
		while (next.hasNext()) {
			next.next().addMediaObject(o);
		}
	}

	public void remove(MediaObject o) {
		if (_playList.contains(o)) {
			_playList.remove(o);
			Iterator<IPlayListViewer> iterator = _changeListeners.iterator();
			while (iterator.hasNext())
				iterator.next().removeMediaObject(o);
		}
	}

	public void update(MediaObject o) {
		if (_playList.contains(o)) {
			_playList.remove(o);
			Iterator<IPlayListViewer> iterator = _changeListeners.iterator();
			while (iterator.hasNext())
				iterator.next().updateMediaObject(o);
		}
	}

	public void play() {
		play(0);
	}

	public void play(int index) {
		for (int i = index; index < _playList.size(); ++i) {
			_currentlyPlaying = _playList.get(i);
			_currentlyPlaying.play();
		}
	}

	public void stop() {
		if (_currentlyPlaying != null)
			_currentlyPlaying.stop();
	}

	public void next() {
		if (_currentlyPlaying != null)
			play(_playList.indexOf(_currentlyPlaying) + 1);
	}

	public void pause() {
		if (_currentlyPlaying != null)
			_currentlyPlaying.pause();
	}

	public void save() {

	}

	public void load(String filename) {

	}

	/**
	 * @param viewer
	 */
	public void removeChangeListener(IPlayListViewer viewer) {
		_changeListeners.remove(viewer);
	}

	/**
	 * @param viewer
	 */
	public void addChangeListener(IPlayListViewer viewer) {
		_changeListeners.add(viewer);
	}

	public List<MediaObject> getList() {
		return _playList;
	}

}
