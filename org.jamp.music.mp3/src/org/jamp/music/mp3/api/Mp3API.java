package org.jamp.music.mp3.api;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;

import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3;
import org.jamp.model.music.api.IMusicAPI;

public class Mp3API implements IMusicAPI {

	// public Mp3API(InputStream stream) {
	// super(stream);
	// }

	private AdvancedPlayer _player;
	private AudioDevice _device;
	private AbstractID3 _mp3Info;
	private int _currentFrame = 0;
	protected boolean _isStopped = true;
	protected String _fileLocation;
	protected PlaybackEvent _playEvent;
	protected Bitstream _bitStream;
	private Decoder _decoder;

	@Override
	public int getPosition() {
		return _device.getPosition();
	}

	private void resetPosition() {
		_currentFrame = 0;
	}

	@Override
	public void play() {
		try {
			if (_isStopped) {
				_playEvent.getSource().play(_currentFrame, Integer.MAX_VALUE);
			}
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}

	// @Override
	// public boolean play(int frames) {
	// try {
	// _playEvent.setFrame(_currentFrame);
	// return _playEvent.getSource().play(_currentFrame,
	// _currentFrame += frames);
	// } catch (JavaLayerException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// return true;
	// }
	// }

	public void pause() {
		if (!_isStopped) {
			_currentFrame = _playEvent.getFrame();
			_playEvent.getSource().stop();
		}
	}

	public void stop() {
		if (!_isStopped) {
			_player.stop();
		}
		resetPosition();
	}

	public void init(String fileLocation) {
		_fileLocation = fileLocation;
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
		// try {
		_bitStream = new Bitstream(in);
		_decoder = new Decoder();
		try {
			_device.open(_decoder);
		} catch (JavaLayerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// _player = new AdvancedPlayer(in, _device);
		// _playEvent = new PlaybackEvent(_player, 1, 0);
		// _player.setPlayBackListener(new PlaybackListener() {
		// @Override
		// public void playbackStarted(PlaybackEvent pevt) {
		// _isStopped = false;
		// System.out.println("Playing started...");
		// }
		//
		// @Override
		// public void playbackFinished(PlaybackEvent pevt) {
		// _isStopped = true;
		// System.out.println("Playback stopped...");
		// }
		//
		// });
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
		// } catch (JavaLayerException e) {
		// e.printStackTrace();
		// }
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

	/**
	 * Decodes a single frame.
	 * 
	 * @return true if there are no more frames to decode, false otherwise.
	 */
	protected boolean decodeFrame() throws JavaLayerException {
		try {
			AudioDevice out = _device;
			if (out == null)
				return false;

			Header h = _bitStream.readFrame();
			if (h == null)
				return false;

			// sample buffer set when decoder constructed
			SampleBuffer output = (SampleBuffer) _decoder.decodeFrame(h,
					_bitStream);

			synchronized (this) {
				out = _device;
				if (out != null) {
					out.write(output.getBuffer(), 0, output.getBufferLength());
				}
			}

			_bitStream.closeFrame();
		} catch (RuntimeException ex) {
			throw new JavaLayerException("Exception decoding audio frame", ex);
		}
		return true;
	}

	public boolean play(int frames) {
		boolean ret = true;

		// report to listener
		// if (listener != null)
		// listener.playbackStarted(createEvent(PlaybackEvent.STARTED));

		while (frames-- > 0 && ret) {
			try {
				ret = decodeFrame();
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// if (!ret)
		{
			// last frame, ensure all data flushed to the audio device.
			AudioDevice out = _device;
			if (out != null) {
				// System.out.println(audio.getPosition());
				out.flush();
				// System.out.println(audio.getPosition());
				// synchronized (this) {
				// complete = (!closed);
				// close();
				// }

				// report to listener
				// if (listener != null)
				// listener.playbackFinished(createEvent(out,
				// PlaybackEvent.STOPPED));
			}
		}
		return ret;
	}
}
