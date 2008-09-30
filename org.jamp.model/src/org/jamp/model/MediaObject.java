package org.jamp.model;

public abstract class MediaObject {

	protected boolean _isPaused = false;

	protected boolean isSuspended;

	public MediaObject() {
	}

	public abstract String getURL();

	public abstract void setURL(String location);

	public abstract void play();

	public abstract void stop();

	public abstract void pause();

}
