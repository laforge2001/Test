package org.jamp.model;

public abstract class MediaObject implements Runnable {

	protected String _location;

	protected boolean _isPaused = false;

	private volatile Thread _playThread;

	public MediaObject(String location) {
		_location = location;
	}

	public String getLocation() {
		return _location;
	}

	public abstract void play();

	public void start() {
		_playThread = new Thread(this);
		_playThread.start();
	}

	public void stop() {
		_playThread = null;
		System.out.println("Stopped");
	}

	public void pause() {
		_isPaused = !_isPaused;
		System.out.println("Paused..");
	}

	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();
		while (_playThread == thisThread) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			play();
		}
	}

}
