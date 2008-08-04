package org.jamp.model;

public abstract class MediaObject {

	String _location;

	public MediaObject(String location) {
		_location = location;
	}

	public String getLocation() {
		return _location;
	}

	public abstract void play();

	public abstract void stop();

	public abstract void pause();

}
