package org.jamp.model;

public abstract class MediaObject {

	String _name;
	String _location;

	public MediaObject(String name, String location) {
		_name = name;
		_location = location;
	}

	public String getLocation() {
		return _location;
	}

	public String getName() {
		return _name;
	}

	public abstract void play();

	public abstract void stop();

	public abstract void pause();

}
