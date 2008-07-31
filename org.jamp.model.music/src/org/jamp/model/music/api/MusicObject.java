package org.jamp.model.music.api;

import org.jamp.model.MediaObject;

public class MusicObject extends MediaObject {

	private final IMusicAPI _musicAPI;

	public MusicObject(String name, String location, IMusicAPI api) {
		super(name, location);
		_musicAPI = api;
		_musicAPI.init(getLocation());
	}

	@Override
	public void pause() {
		_musicAPI.pause();

	}

	@Override
	public void play() {
		_musicAPI.play();

	}

	@Override
	public void stop() {
		_musicAPI.stop();

	}

}
