package org.jamp.model;

public abstract class MediaObject implements Runnable {

	protected String _location;

	protected boolean _isPaused = false;
	
	protected volatile Thread _playMe;
	
	protected boolean isSuspended;

	public MediaObject(String location) {
		_location = location;
	}

	public String getLocation() {
		return _location;
	}

	public abstract void play();

	public void pause() {
		if (_playMe != null) {
			if (!isSuspended) {
				_playMe.suspend();
			} else {
				_playMe.resume();
			}
			isSuspended = !isSuspended;
		}
	}

	public abstract void stop();

	public void start() {
		_playMe = new Thread(this);
		_playMe.start();
	}

}
