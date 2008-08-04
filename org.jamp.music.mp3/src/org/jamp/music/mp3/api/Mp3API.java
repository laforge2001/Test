package org.jamp.music.mp3.api;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3;
import org.jamp.model.music.api.IMusicAPI;

public class Mp3API implements IMusicAPI {

	private Player _player;
	private AbstractID3 _mp3Info;
	private int _currentPosition;

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		_player.close();

	}

	@Override
	public int getPosition() {
		return _player.getPosition();
	}

	@Override
	public void play() {
		try {
			_player.play();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}

	public void init(String fileLocation) {
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(fileLocation));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			_player = new Player(in);
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

}
