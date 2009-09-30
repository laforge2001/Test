package org.jamp.codec.mp3;

import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;

import org.jamp.model.MediaPlayer.State;
import org.jamp.model.MediaPlayer.impl.MediaApiImpl;
import org.jaudiotagger.tag.Tag;

public class Mp3Api extends MediaApiImpl {

	private static Mp3Api _instance;
	private State _state;
	private static AdvancedPlayer _player;
	private AudioDevice _device;
	private Tag _mp3Info;
	protected boolean _isPaused = false;
	protected String _fileLocation;
	protected PlaybackEvent _playEvent;
	private int _currentFrame;
}
