package org.jamp.model.api;

public interface IMediaAPI {

	public void init();

	public void setURL(String location);

	public String getURL();

	public void play();

	public void pause();

	public void stop();

	public void dispose();

	public boolean isPlaying();

	public boolean isPaused();

}
