package org.jamp.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.handlers.IHandlerService;
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
		// configurer.setShowCoolBar(false);
		configurer.setShowStatusLine(true);
		configurer.setShowProgressIndicator(true);
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

			public void handleEvent(Event event) {
				Menu menu = new Menu(window.getShell(), SWT.POP_UP);

				// Creates a new menu item that plays media
				// when selected
				MenuItem play = new MenuItem(menu, SWT.NONE);
				play.setText("Play");
				play.setImage(AbstractUIPlugin.imageDescriptorFromPlugin(
						"org.jamp.ui", IImageKeys.ONLINE).createImage());
				play.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						// Lets call our command
						IHandlerService handlerService = (IHandlerService) window
								.getService(IHandlerService.class);
						try {
							handlerService.executeCommand("play.command", null);
						} catch (Exception ex) {
							throw new RuntimeException("play.command not found");
						}
					}
				});

				MenuItem pause = new MenuItem(menu, SWT.NONE);
				pause.setText("Pause");
				pause.setImage(AbstractUIPlugin.imageDescriptorFromPlugin(
						"org.jamp.ui", IImageKeys.ONLINE).createImage());
				pause.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						// Lets call our command
						IHandlerService handlerService = (IHandlerService) window
								.getService(IHandlerService.class);
						try {
							handlerService
									.executeCommand("pause.command", null);
						} catch (Exception ex) {
							throw new RuntimeException(
									"pause.command not found");
						}
					}
				});

				MenuItem stop = new MenuItem(menu, SWT.NONE);
				stop.setText("Stop");
				stop.setImage(AbstractUIPlugin.imageDescriptorFromPlugin(
						"org.jamp.ui", IImageKeys.ONLINE).createImage());
				stop.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						// Lets call our command
						IHandlerService handlerService = (IHandlerService) window
								.getService(IHandlerService.class);
						try {
							handlerService.executeCommand("stop.command", null);
						} catch (Exception ex) {
							throw new RuntimeException("stop.command not found");
						}
					}
				});

				MenuItem exit = new MenuItem(menu, SWT.NONE);
				exit.setText("Exit");
				exit.setImage(AbstractUIPlugin.imageDescriptorFromPlugin(
						"org.jamp.ui", IImageKeys.ONLINE).createImage());
				exit.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						// Lets call our command
						IHandlerService handlerService = (IHandlerService) window
								.getService(IHandlerService.class);
						try {
							handlerService.executeCommand(
									"org.eclipse.ui.file.exit", null);
						} catch (Exception ex) {
							throw new RuntimeException(
									"org.eclipse.ui.file.exit not found");
						}
					}
				});

				// We need to make the menu visible
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
