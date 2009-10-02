package org.jamp.codec.mp3;

import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

import org.jamp.model.MediaPlayer.State;

public class Mp3PlaybackListener extends PlaybackListener {

	private State _state;

	private int _currentFrame;

	public Mp3PlaybackListener(State state) {
		_state = state;
	}

	@Override
	public void playbackFinished(PlaybackEvent evt) {
		_state = State.STOPPED;
		_currentFrame = evt.getFrame();
		System.out.println("Play started from frame " + evt.getFrame());
	}

	@Override
	public void playbackStarted(PlaybackEvent evt) {
		_state = State.PLAYING;
		System.out.println("Play completed at frame " + evt.getFrame());
	}

	public int getCurrentFrame() {
		return _currentFrame;
	}

	public State getState() {
		return _state;
	}
}
