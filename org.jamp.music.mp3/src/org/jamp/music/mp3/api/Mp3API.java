package org.jamp.music.mp3.api;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javazoom.jl.decoder.Bitstream;
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

public class Mp3API implements IMusicAPI, Runnable {

	private AdvancedPlayer _player;
	private AudioDevice _device;
	private AbstractID3 _mp3Info;
	protected boolean _isPaused = false;
	protected String _fileLocation;
	protected PlaybackEvent _playEvent;
	protected Bitstream _bitStream;

	private Thread _playMeThread;

	@Override
	public int getPosition() {
		return _device.getPosition();
	}

	private Thread createPlayerThread() {
		return new Thread(this, "This is the audio thread");
	}

	private synchronized void stopPlayerThread() {
		if (_player != null) {
			_player.stop();
			_player = null;
			_playMeThread = null;
		}
		notify();
	}

	@Override
	public void play() {
		stopPlayerThread();

		BufferedInputStream in = getInputStream(getURL());
		if (in != null && _device != null) {
			try {
				init();
				_player = new AdvancedPlayer(in, _device);

				_player.setPlayBackListener(new PlaybackListener() {
					@Override
					public void playbackStarted(PlaybackEvent pevt) {
						System.out.println("Playing " + getURL()
								+ " started...");
					}

					@Override
					public void playbackFinished(PlaybackEvent pevt) {
						System.out.println("Playback stopped...");
					}

				});

				try {
					MP3File tagFile = new MP3File(getURL());
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

				_playMeThread = createPlayerThread();
				_playMeThread.start();
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void pause() {
		if (_player != null) {
			if (!_isPaused) {
				System.out.println("Playback paused...");
				_playMeThread.suspend();
			} else {
				System.out.println("Playback resumed...");
				_playMeThread.resume();
			}
			_isPaused = !_isPaused;
		}
	}

	public void stop() {
		stopPlayerThread();
	}

	private BufferedInputStream getInputStream(String location) {
		try {
			return new BufferedInputStream(new FileInputStream(location));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void init() {
		_fileLocation = getURL();
		BufferedInputStream in = getInputStream(getURL());
		FactoryRegistry f = FactoryRegistry.systemRegistry();
		try {
			_device = f.createAudioDevice();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}

		try {
			MP3File tagFile = new MP3File(getURL());
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

	@Override
	public void setURL(String location) {
		_fileLocation = location;

	}

	@Override
	public String getURL() {
		return _fileLocation;
	}

	@Override
	public void run() {
		if (_player != null) {
			try {
				_player.play();
			} catch (JavaLayerException ex) {
				System.err.println("Problem playing audio: " + ex);
			}
		}

	}
}
