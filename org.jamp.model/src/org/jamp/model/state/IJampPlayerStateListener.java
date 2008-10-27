package org.jamp.model.state;

public interface IJampPlayerStateListener {

	public enum State {
		PLAYING, PAUSED, STOPPED
	};

	public void stateChange(State state);

}
