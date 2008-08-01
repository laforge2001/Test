package org.jamp.model;

public abstract class MediaObject {

	String _title;
	String _location;

	public MediaObject(String name, String location) {
		_title = name;
		_location = location;
	}

	public String getLocation() {
		return _location;
	}

	public String getName() {
		return _title;
	}

	public abstract void play();

	public abstract void stop();

	public abstract void pause();

}
