package org.jamp.model.music.api;

import org.jamp.model.MediaObject;

public class MusicObject extends MediaObject {

	private final IMusicAPI _musicAPI;

	private String title;
	private String artist;
	private String album;
	private int year;

	public MusicObject(String location, IMusicAPI api) {
		_musicAPI = api;
		_musicAPI.setURL(location);
		_musicAPI.init();
		title = getAPI().getSongTitle();
		artist = getAPI().getArtist();
		album = getAPI().getAlbum();
		year = getAPI().getYear();
	}

	@Override
	public void play() {
		_musicAPI.play();
	}

	@Override
	public void stop() {
		_musicAPI.stop();
	}

	public IMusicAPI getAPI() {
		return _musicAPI;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String getURL() {
		return _musicAPI.getURL();
	}

	@Override
	public void setURL(String location) {
		_musicAPI.setURL(location);
	}

	public void run() {
		_musicAPI.play();
	}

	@Override
	public void pause() {
		_musicAPI.pause();
	}

	@Override
	public boolean isPaused() {
		return _musicAPI.isPaused();
	}

	@Override
	public boolean isPlaying() {
		return _musicAPI.isPlaying();
	}

}
