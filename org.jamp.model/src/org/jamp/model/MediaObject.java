package org.jamp.model;

public abstract class MediaObject implements Runnable {

	protected String _location;

	protected boolean _isPaused = false;

	public MediaObject(String location) {
		_location = location;
	}

	public String getLocation() {
		return _location;
	}

	public abstract void play();

	public abstract boolean play(int frames);

	public abstract void pause();

	public abstract void stop();

	public abstract void start();

	// @Override
	// public void run() {
	// play();
	// }
}
