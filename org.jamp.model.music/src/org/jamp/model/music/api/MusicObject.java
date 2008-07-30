package org.jamp.model.music.api;

import org.jamp.model.MediaObject;

public class MusicObject extends MediaObject {

	IMusicAPI _musicAPI;

	public MusicObject(String name, Object data) {
		super(name, data);
		_musicAPI = (IMusicAPI) data;
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
