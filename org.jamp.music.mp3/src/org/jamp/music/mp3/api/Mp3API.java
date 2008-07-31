package org.jamp.music.mp3.api;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import org.jamp.model.music.api.IMusicAPI;

public class Mp3API implements IMusicAPI {

	private Player _player;
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
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}

}
