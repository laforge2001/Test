package org.jamp.music.mp3.api;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

import org.jamp.model.music.api.IMusicAPI;
import org.jamp.model.player.context.JampContextConstants;
import org.jamp.model.player.context.JampContextManager;
import org.jamp.model.state.IJampPlayerStateListener;
import org.jamp.model.state.IJampPlayerStateListener.State;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

public class Mp3API implements IMusicAPI, Runnable {

	private static Mp3API _instance;
	private State _state;
	private static AdvancedPlayer _player;
	private AudioDevice _device;
	private Tag _mp3Info;
	protected boolean _isPaused = false;
	protected String _fileLocation;
	protected PlaybackEvent _playEvent;
	private int _currentFrame;

	private final List<IJampPlayerStateListener> _listeners;

	private static Thread _playMeThread;

	private Mp3API() {
		_state = State.STOPPED;
		_listeners = new ArrayList<IJampPlayerStateListener>();

	}

	public static Mp3API getInstance() {
		if (_instance == null) {
			_instance = new Mp3API();
		}
		return _instance;
	}

	@Override
	public int getPosition() {
		return _device.getPosition();
	}

	// private Thread createPlayerThread() {
	// return new Thread(this, "This is the audio thread");
	// }
	//
	// private synchronized void stopPlayerThread() {
	// if (_player != null) {
	// _player.stop();
	// _player = null;
	// if (_isPaused) {
	// _playMeThread.resume();
	// }
	// _playMeThread = null;
	// _isPaused = false;
	// }
	// notify();
	// }

	@Override
	public synchronized void play() {
		// if (_isPaused) {
		// _playMeThread.resume();
		// _isPaused = !_isPaused;
		// } else {
		// stopPlayerThread();
		//
		// BufferedInputStream in = getInputStream(getURL());
		// if (in != null && _device != null) {
		// try {
		// init();
		// _player = new AdvancedPlayer(in, _device);
		//
		// _player.setPlayBackListener(new PlaybackListener() {
		// @Override
		// public void playbackFinished(PlaybackEvent evt) {
		// _currentFrame = evt.getFrame();
		// if (_state == State.PLAYING) {
		// setState(State.STOPPED);
		// }
		// }
		//
		// @Override
		// public void playbackStarted(PlaybackEvent evt) {
		// setState(State.PLAYING);
		// }
		// });
		//
		// MP3File tagFile;
		// try {
		// tagFile = new MP3File(getURL());
		// if (tagFile.hasID3v2Tag())
		// _mp3Info = tagFile.getID3v2Tag();
		// else
		// _mp3Info = tagFile.getID3v1Tag();
		// } catch (ReadOnlyFileException e) {
		// e.printStackTrace();
		// } catch (InvalidAudioFrameException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// } catch (TagException e) {
		// e.printStackTrace();
		// }
		//
		// _playMeThread = createPlayerThread();
		// _playMeThread.start();
		// } catch (JavaLayerException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// }

		if (_state == State.PLAYING) {
			_player.stop();
			while (_state != State.STOPPED) {
				// wait until stopped
			}
		}

		_playMeThread = new Thread(this);
		_playMeThread.start();

	}

	public synchronized void pause() {
		// if (_player != null) {
		// if (!_isPaused) {
		// System.out.println("Playback paused...");
		// _playMeThread.suspend();
		// } else {
		// System.out.println("Playback resumed...");
		// _playMeThread.resume();
		// }
		// _isPaused = !_isPaused;
		// }

		if (_state != State.PAUSED) {
			_player.stop();
			setState(State.PAUSED);
		} else {
			_playMeThread = new Thread(this);
			_playMeThread.start();
		}
	}

	public void stop() {
		if (_state == State.PAUSED) {
			_player.close();
		} else {
			_player.stop();
		}
		_playMeThread = null;

		// stopPlayerThread();
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
		MP3File tagFile;
		try {
			tagFile = new MP3File(getURL());
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
		// _fileLocation = getURL();
		// FactoryRegistry f = FactoryRegistry.systemRegistry();
		// try {
		// _device = f.createAudioDevice();
		// } catch (JavaLayerException e) {
		// e.printStackTrace();
		// }
		//
		// try {
		// MP3File tagFile = new MP3File(getURL());
		// if (tagFile.hasID3v2Tag())
		// _mp3Info = tagFile.getID3v2Tag();
		// else
		// _mp3Info = tagFile.getID3v1Tag();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (TagException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (ReadOnlyFileException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (InvalidAudioFrameException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	public String getSongTitle() {
		return _mp3Info.getFirstTitle();
	}

	@Override
	public String getAlbum() {
		return _mp3Info.getFirstAlbum();
	}

	@Override
	public String getArtist() {
		return _mp3Info.getFirstArtist();
	}

	@Override
	public Integer getSongLength() {
		return 0; // TODO: implement me
	}

	@Override
	public Integer getYear() {
		String year = _mp3Info.getFirstYear();

		try {
			if (year != "")
				return Integer.valueOf(year);
			else
				return 9999;
		} catch (NumberFormatException e) {
			return 9999;
		}
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
		// if (_player != null) {
		// try {
		// _player.play();
		// } catch (JavaLayerException ex) {
		// System.err.println("Problem playing audio: " + ex);
		// }
		// }

		try {
			BufferedInputStream in = getInputStream(getURL());

			_player = new AdvancedPlayer(in);

			_player.setPlayBackListener(new PlaybackListener() {
				@Override
				public void playbackFinished(PlaybackEvent evt) {
					_currentFrame = evt.getFrame();
					if (getState() == State.PLAYING) {
						setState(State.STOPPED);
						JampContextManager
								.deactivateContext(JampContextConstants.STOP_CONTEXT);
					}
				}

				@Override
				public void playbackStarted(PlaybackEvent evt) {
					setState(State.PLAYING);
					JampContextManager
							.activateContext(JampContextConstants.STOP_CONTEXT);
				}
			});

			MP3File tagFile = new MP3File(getURL());

			if (tagFile.hasID3v2Tag())
				_mp3Info = tagFile.getID3v2Tag();
			else
				_mp3Info = tagFile.getID3v1Tag();

			if (getState() == State.PAUSED) {
				_player.play(_currentFrame, Integer.MAX_VALUE);
			} else {
				_player.play();
			}
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	}

	private State getState() {
		return _state;
	}

	@Override
	public boolean isPaused() {
		return _isPaused;
	}

	@Override
	public boolean isPlaying() {
		return (_playMeThread != null);
	}

	public void addMediaPlayerListner(IJampPlayerStateListener l) {
		_listeners.add(l);
	}

	public void removeMediaPlayerListener(IJampPlayerStateListener l) {
		_listeners.remove(l);
	}

	private void setState(State state) {
		_state = state;
		for (IJampPlayerStateListener listener : _listeners) {
			listener.stateChange(_state);
		}

	}

}
