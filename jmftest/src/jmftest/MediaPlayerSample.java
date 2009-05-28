package jmftest;

import java.applet.Applet;

public class MediaPlayerSample extends Applet {
	@Override
	public void init() {

		// {{INIT_CONTROLS
		setLayout(null);
		setSize(518, 347);
		mediaPlayer1.setMediaLocation("file:/c:\\attention.wav");
		add(mediaPlayer1);
		mediaPlayer1.setBounds(36, 24, 324, 272);
		// }}

		// {{REGISTER_LISTENERS
		SymComponent aSymComponent = new SymComponent();
		this.addComponentListener(aSymComponent);
		SymContainer aSymContainer = new SymContainer();
		this.addContainerListener(aSymContainer);
		// }}
	}

	@Override
	public void stop() {
		if (mediaPlayer1 != null)
			mediaPlayer1.stop();

	}

	@Override
	public void destroy() {
		if (mediaPlayer1 != null)
			mediaPlayer1.deallocate();

	}

	// {{DECLARE_CONTROLS
	javax.media.bean.playerbean.MediaPlayer mediaPlayer1 = new javax.media.bean.playerbean.MediaPlayer();

	// }}

	class SymComponent extends java.awt.event.ComponentAdapter {
		@Override
		public void componentShown(java.awt.event.ComponentEvent event) {
			Object object = event.getSource();
			if (object == MediaPlayerSample.this)
				MediaPlayerSample_ComponentShown(event);
		}
	}

	void MediaPlayerSample_ComponentShown(java.awt.event.ComponentEvent event) {
		// to do: code goes here.

		MediaPlayerSample_ComponentShown_Interaction1(event);
	}

	class SymContainer extends java.awt.event.ContainerAdapter {
		@Override
		public void componentRemoved(java.awt.event.ContainerEvent event) {
			Object object = event.getSource();
			if (object == MediaPlayerSample.this)
				MediaPlayerSample_ComponentRemoved(event);
		}
	}

	void MediaPlayerSample_ComponentRemoved(java.awt.event.ContainerEvent event) {
		// to do: code goes here.

		MediaPlayerSample_ComponentRemoved_Interaction1(event);
	}

	void MediaPlayerSample_ComponentShown_Interaction1(
			java.awt.event.ComponentEvent event) {
		try {
			mediaPlayer1.start();
		} catch (Exception e) {
		}
	}

	void MediaPlayerSample_ComponentRemoved_Interaction1(
			java.awt.event.ContainerEvent event) {
		try {
			mediaPlayer1.stop();
			mediaPlayer1.deallocate();
		} catch (Exception e) {
		}
	}
}
