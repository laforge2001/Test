package org.jamp.music.mp3.api;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3;
import org.jamp.model.music.api.IMusicAPI;

public class Mp3API implements IMusicAPI {

	private AdvancedPlayer _player;
	private AudioDevice _device;
	private AbstractID3 _mp3Info;
	private int _currentPosition = 0;

	@Override
	public int getPosition() {
		return _device.getPosition();
	}

	private void resetPosition() {
		_currentPosition = 0;
	}

	@Override
	public void play() {
		try {
			_player.play(_currentPosition, Integer.MAX_VALUE);
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}

	public void pause() {
		_player.stop();
		_currentPosition = getPosition();
	}

	public void stop() {
		_player.stop();
		resetPosition();
	}

	public void init(String fileLocation) {
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(fileLocation));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		FactoryRegistry f = FactoryRegistry.systemRegistry();
		try {
			_device = f.createAudioDevice();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
		try {
			_player = new AdvancedPlayer(in, _device);
			_player.setPlayBackListener(new PlaybackListener() {
				@Override
				public void playbackStarted(PlaybackEvent pevt) {
					System.out.println("Playback started...");
				}

				@Override
				public void playbackFinished(PlaybackEvent pevt) {
					System.out.println("Playback finished...");
				}

			});
			try {
				MP3File tagFile = new MP3File(fileLocation);
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
			}
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}

	public String getSongTitle() {
		return _mp3Info.getSongTitle();
	}

	@Override
	public String getAlbum() {
		return _mp3Info.getAlbumTitle();
	}

	@Override
	public String getArtist() {
		return _mp3Info.getLeadArtist();
	}

	@Override
	public Integer getSongLength() {
		return _mp3Info.getSize();
	}

	@Override
	public Integer getYear() {
		String year = _mp3Info.getYearReleased();
		if (year != "")
			return Integer.valueOf(_mp3Info.getYearReleased());
		else
			return 9999;
	}

	@Override
	public void dispose() {
		if (_player != null) {
			_player.close();
		}

	}

}
