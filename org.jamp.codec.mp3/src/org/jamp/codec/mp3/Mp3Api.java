package org.jamp.codec.mp3;

import java.io.File;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.jlap;

import org.jamp.model.MediaPlayer.MediaObject;
import org.jamp.model.MediaPlayer.State;
import org.jamp.model.MediaPlayer.impl.MediaApiImpl;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

public class Mp3Api extends MediaApiImpl {

	private static AdvancedPlayer _player;
	private Tag _mp3Info;
	protected boolean _isPaused = false;
	private Mp3PlaybackListener _listener;

	@Override
	public void init() {

	}

	@Override
	public boolean canPlay(MediaObject media) {
		// _player.
		return true;
	}

	@Override
	public void dispose() {
		_player.close();
	}

	@Override
	public void pause(MediaObject pauseMe) {
		if (pauseMe.getState() == State.PLAYING) {
			stop(pauseMe);
			_isPaused = true;
		}

	}

	@Override
	public void play(MediaObject playMe) {
		try {
			if (!_isPaused) {
				_listener = new Mp3PlaybackListener(playMe.getState());
				_player = jlap.playMp3(new File(playMe.getLocation()),
						_listener);
			} else {
				_player = jlap.playMp3(new File(playMe.getLocation()),
						_listener.getCurrentFrame(), Integer.MAX_VALUE,
						_listener);
				_isPaused = false;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void stop(MediaObject stopMe) {
		if (!stopMe.getState().equals(State.STOPPED)) {
			_player.stop();
		}

	}

	@Override
	public void updateMediaObjectInfo(MediaObject updateMe) {
		MP3File tagFile;
		try {
			tagFile = new MP3File(updateMe.getLocation());
			if (tagFile.hasID3v2Tag())
				_mp3Info = tagFile.getID3v2Tag();
			else
				_mp3Info = tagFile.getID3v1Tag();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (TagException e) {
			e.printStackTrace();
		} catch (ReadOnlyFileException e) {
			e.printStackTrace();
		} catch (InvalidAudioFrameException e) {
			e.printStackTrace();
		}

		updateMe.setArtist(_mp3Info.getFirstArtist());
		updateMe.setTitle(_mp3Info.getFirstTitle());
		updateMe.setAlbum(_mp3Info.getFirstAlbum());
		updateMe.setYear(Integer.parseInt(_mp3Info.getFirstYear()));
	}
}
