package org.jamp.model;

import org.eclipse.swt.graphics.Image;

public abstract class MediaObject {

	protected Image previewImage;

	public MediaObject() {
	}

	public abstract String getURL();

	public abstract void setURL(String location);

	public abstract void play();

	public abstract void stop();

	public abstract void pause();

	public abstract boolean isPaused();

	public abstract boolean isPlaying();

}
