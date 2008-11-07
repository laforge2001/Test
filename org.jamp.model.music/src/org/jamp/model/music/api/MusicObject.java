package org.jamp.model.music.api;

import org.jamp.model.MediaObject;

public class MusicObject extends MediaObject {

	private final IMusicAPI _musicAPI;

	private String title;
	private String artist;
	private String album;
	private int year;
	private String location;

	public static final String LOCATION = "location";
	public static final String TITLE = "title";
	public static final String ARTIST = "artist";
	public static final String ALBUM = "album";
	public static final String YEAR = "year";

	public MusicObject() {
		super();
		_musicAPI = null;
	}

	public MusicObject(String location, IMusicAPI api) {
		super(api);
		_musicAPI = api;
		setLocation(location);
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

	@Override
	public IMusicAPI getAPI() {
		return _musicAPI;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		firePropertyChange(TITLE, this.title, this.title = title);
	}

	@Override
	public String getArtist() {
		return artist;
	}

	@Override
	public void setArtist(String artist) {
		firePropertyChange(ARTIST, this.artist, this.artist = artist);
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		firePropertyChange(ALBUM, this.album, this.album = album);
	}

	@Override
	public int getYear() {
		return year;
	}

	@Override
	public void setYear(int year) {
		firePropertyChange(YEAR, this.year, this.year = year);
	}

	@Override
	public String getLocation() {
		return _musicAPI.getURL();
	}

	@Override
	public void setLocation(String location) {
		firePropertyChange(LOCATION, this.location, this.location = location);
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
