package org.jamp.ui;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor
		implements IImageKeys {

	private TrayItem _trayItem;
	private Image _trayImage;
	private ApplicationActionBarAdvisor _actionBarAdvisor;

	public ApplicationWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	@Override
	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		_actionBarAdvisor = new ApplicationActionBarAdvisor(configurer);
		return _actionBarAdvisor;
	}

	@Override
	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(900, 600));
		configurer.setShowCoolBar(false);
		configurer.setShowStatusLine(false);
	}

	@Override
	public void postWindowOpen() {
		final IWorkbenchWindow window = getWindowConfigurer().getWindow();
		_trayItem = initTaskItem(window);
		if (_trayItem != null) {
			hookPopupMenu(window);
			hookMinimize(window);
		}
	}

	private void hookMinimize(final IWorkbenchWindow window) {
		window.getShell().addShellListener(new ShellAdapter() {
			@Override
			public void shellIconified(ShellEvent e) {
				window.getShell().setVisible(false);
			}
		});

		_trayItem.addListener(SWT.DefaultSelection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				Shell shell = window.getShell();
				if (!shell.isVisible()) {
					shell.setVisible(true);
					window.getShell().setMinimized(false);
				}

			}
		});

	}

	private void hookPopupMenu(final IWorkbenchWindow window) {
		_trayItem.addListener(SWT.MenuDetect, new Listener() {

			@Override
			public void handleEvent(Event event) {
				MenuManager trayMenu = new MenuManager();
				Menu menu = trayMenu.createContextMenu(window.getShell());
				_actionBarAdvisor.fillTrayItem(trayMenu);
				menu.setVisible(true);
			}

		});

	}

	private TrayItem initTaskItem(IWorkbenchWindow window) {
		final Tray tray = window.getShell().getDisplay().getSystemTray();
		if (tray == null)
			return null;

		TrayItem trayItem = new TrayItem(tray, SWT.NONE);
		_trayImage = AbstractUIPlugin.imageDescriptorFromPlugin("org.jamp.ui",
				IImageKeys.ONLINE).createImage();
		trayItem.setImage(_trayImage);
		trayItem.setToolTipText("JAMP");
		return trayItem;
	}

	@Override
	public void dispose() {
		if (_trayImage != null) {
			_trayImage.dispose();
			_trayItem.dispose();
		}
	}
}
