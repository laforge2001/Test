package org.jamp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.jamp.model.viewer.IPlayListViewer;

public class Playlist implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4398528061055146208L;
	private final Vector _playList = new Vector(10);
	private MediaObject _currentlyPlaying = null;
	private String _name = new String();
	private Set _changeListeners = new HashSet();

	public Playlist(String name, List<MediaObject> playList) {
		_name = name;
		for (MediaObject m : playList) {
			_playList.add(m);
		}
	}

	public Playlist(Playlist copyMe) {
		this(copyMe._name, copyMe._playList);

	}

	public void add(MediaObject o) {
		_playList.add(o);
		Iterator next = _changeListeners.iterator();
		while (next.hasNext()) {
			((IPlayListViewer) next.next()).addMediaObject(o);
		}
	}

	public void remove(MediaObject o) {
		if (_playList.contains(o)) {
			_playList.remove(o);
			Iterator iterator = _changeListeners.iterator();
			while (iterator.hasNext())
				((IPlayListViewer) iterator.next()).removeMediaObject(o);
		}
	}

	public void update(MediaObject o) {
		if (_playList.contains(o)) {
			_playList.remove(o);
			Iterator iterator = _changeListeners.iterator();
			while (iterator.hasNext())
				((IPlayListViewer) iterator.next()).updateMediaObject(o);
		}
	}

	public void play() {
		play(0);
	}

	public void play(int index) {
		for (int i = index; index < _playList.size(); ++i) {
			_currentlyPlaying = (MediaObject) _playList.get(i);
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

	public Vector getList() {
		return _playList;
	}

}
