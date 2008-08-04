package org.jamp.model.music.api;

import org.jamp.model.MediaObject;

public class MusicObject extends MediaObject {

	private final IMusicAPI _musicAPI;

	private String title;
	private String artist;
	private String album;
	private int year;
	private String location;

	public MusicObject(String name, String location, IMusicAPI api) {
		super(name, location);
		_musicAPI = api;
		_musicAPI.init(super.getLocation());
		title = getName();
		artist = getAPI().getArtist();
		album = getAPI().getAlbum();
		year = getAPI().getYear();
		location = super.getLocation();
	}

	@Override
	public void pause() {
		_musicAPI.pause();

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
