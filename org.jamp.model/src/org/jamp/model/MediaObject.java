package org.jamp.model;

public abstract class MediaObject extends NodeObject {

	public MediaObject(String name, Object data) {
		super(name, data);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void play();
	public abstract void stop();
	public abstract void pause();
	

}
