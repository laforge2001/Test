package org.jamp.model;

import org.eclipse.swt.graphics.Image;
import org.jamp.model.api.AbstractModelObject;
import org.jamp.model.api.IMediaAPI;

public abstract class MediaObject extends AbstractModelObject {

	protected IMediaAPI _mediaAPI;

	protected Image previewImage;

	public MediaObject(IMediaAPI mediaAPI) {
		_mediaAPI = mediaAPI;
	}

	public IMediaAPI getAPI() {
		return _mediaAPI;
	}

	public abstract String getURL();

	public abstract void setURL(String location);

	public abstract String getTitle();

	public abstract void setTitle(String title);

	public abstract String getArtist();

	public abstract void setArtist(String artist);

	public abstract int getYear();

	public abstract void setYear(int year);

	public abstract void play();

	public abstract void stop();

	public abstract void pause();

	public abstract boolean isPaused();

	public abstract boolean isPlaying();

}
