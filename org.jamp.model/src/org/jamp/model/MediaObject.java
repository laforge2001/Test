package org.jamp.model;

public abstract class MediaObject {

	String _name;
	String _fileLocation;

	public MediaObject(String name, String location) {
		_name = name;
		_fileLocation = location;
	}

	public String getLocation() {
		return _fileLocation;
	}

	public String getName() {
		return _name;
	}

	public abstract void play();

	public abstract void stop();

	public abstract void pause();

}
