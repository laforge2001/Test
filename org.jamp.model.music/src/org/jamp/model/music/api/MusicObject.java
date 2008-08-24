package org.jamp.model.music.api;

import org.jamp.model.MediaObject;

public class MusicObject extends MediaObject {

	private final IMusicAPI _musicAPI;

	private String title;
	private String artist;
	private String album;
	private int year;
	private String location;

	private volatile Thread _playMe;

	private boolean threadSuspended = false;

	public MusicObject(String location, IMusicAPI api) {
		super(location);
		_musicAPI = api;
		_musicAPI.init(super.getLocation());
		title = getAPI().getSongTitle();
		artist = getAPI().getArtist();
		album = getAPI().getAlbum();
		year = getAPI().getYear();
		this.location = super.getLocation();
	}

	@Override
	public void play() {
		_musicAPI.play();
	}

	public boolean play(int frames) {
		return _musicAPI.play(frames);
	}

	@Override
	public void pause() {
		// _musicAPI.pause();
		threadSuspended = !threadSuspended;
	}

	@Override
	public synchronized void stop() {
		_musicAPI.stop();
		_playMe = null;
		notify();
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
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void start() {
		_playMe = new Thread(this);
		_playMe.start();
	}

	public void run() {
		Thread thisThread = Thread.currentThread();
		while (_playMe == thisThread) {
			try {
				thisThread.sleep(100);

				synchronized (this) {
					while (threadSuspended && thisThread == _playMe) {
						wait();
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (!_musicAPI.play(100)) {
				stop();
			}
		}
	}

}
