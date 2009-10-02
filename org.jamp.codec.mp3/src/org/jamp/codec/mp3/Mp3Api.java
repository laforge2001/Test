package org.jamp.codec.mp3;

import java.io.IOException;

import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;

import org.jamp.model.MediaPlayer.MediaObject;
import org.jamp.model.MediaPlayer.State;
import org.jamp.model.MediaPlayer.impl.MediaApiImpl;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

public class Mp3Api extends MediaApiImpl {

	private State _state;
	private static AdvancedPlayer _player;
	private AudioDevice _device;
	private Tag _mp3Info;
	protected boolean _isPaused = false;
	protected String _fileLocation;
	protected PlaybackEvent _playEvent;
	private int _currentFrame;

	@Override
	public void init() {

	}

	@Override
	public boolean canPlay(MediaObject media) {
		// _player.
		return false;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause(MediaObject pauseMe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void play(MediaObject playMe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop(MediaObject stopMe) {
		// TODO Auto-generated method stub

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TagException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ReadOnlyFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAudioFrameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		updateMe.setArtist(_mp3Info.getFirstArtist());
		updateMe.setTitle(_mp3Info.getFirstTitle());
		updateMe.setAlbum(_mp3Info.getFirstAlbum());
		updateMe.setYear(Integer.parseInt(_mp3Info.getFirstYear()));
	}
}
