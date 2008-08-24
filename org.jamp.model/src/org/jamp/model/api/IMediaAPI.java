package org.jamp.model.api;

public interface IMediaAPI {

	public void init(String location);

	public void play();

	public boolean play(int frames);

	public void pause();

	public void stop();

	public void dispose();

}
