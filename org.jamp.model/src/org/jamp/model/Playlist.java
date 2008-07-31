package org.jamp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4398528061055146208L;
	private final List<MediaObject> _playList = new ArrayList<MediaObject>();
	private MediaObject _currentlyPlaying = null;
	private String _name = new String();

	Playlist(String name, List<MediaObject> playList) {
		_name = name;
		for (MediaObject m : playList) {
			_playList.add(m);
		}
	}

	Playlist(Playlist copyMe) {
		this(copyMe._name, copyMe._playList);

	}

	public void add(MediaObject o) {
		_playList.add(o);
	}

	public void remove(MediaObject o) {
		if (_playList.contains(o)) {
			_playList.remove(o);
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

}
