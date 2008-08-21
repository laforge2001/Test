package org.jamp.model;

public abstract class MediaObject implements Runnable {

	protected String _location;

	protected boolean isPaused = false;

	public MediaObject(String location) {
		_location = location;
	}

	public String getLocation() {
		return _location;
	}

	public abstract void play();

	public abstract void stop();

	public abstract void pause();

	public void run() {
		this.play();
	}

}
