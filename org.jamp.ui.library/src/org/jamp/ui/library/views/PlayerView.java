package org.jamp.ui.library.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;
import org.jamp.ui.library.command.JampPauseCommand;
import org.jamp.ui.library.command.JampPlayCommand;
import org.jamp.ui.library.command.JampStopCommand;

public class PlayerView extends ViewPart {

	public static final String ID = "org.jamp.ui.library.views.PlayerView";

	public PlayerView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		FillLayout fillLayout = new FillLayout();
		fillLayout.type = SWT.HORIZONTAL;
		parent.setLayout(fillLayout);
		Button playButton = new Button(parent, SWT.PUSH);
		playButton.setText("Play");

		playButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				IHandlerService handlerService = (IHandlerService) getSite()
						.getService(IHandlerService.class);
				try {
					handlerService.executeCommand(JampPlayCommand.ID, null);
				} catch (Exception ex) {
					throw new RuntimeException(JampPlayCommand.ID
							+ " not found");
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}

		});

		Button pauseButton = new Button(parent, SWT.PUSH);
		pauseButton.setText("Pause");
		pauseButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				IHandlerService handlerService = (IHandlerService) getSite()
						.getService(IHandlerService.class);
				try {
					handlerService.executeCommand(JampPauseCommand.ID, null);
				} catch (Exception ex) {
					throw new RuntimeException(JampPauseCommand.ID
							+ " not found");
				}
			}
		});

		Button stopButton = new Button(parent, SWT.PUSH);
		stopButton.setText("Stop");
		stopButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				IHandlerService handlerService = (IHandlerService) getSite()
						.getService(IHandlerService.class);
				try {
					handlerService.executeCommand(JampStopCommand.ID, null);
				} catch (Exception ex) {
					throw new RuntimeException(JampStopCommand.ID
							+ " not found");
				}
			}

		});

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
}
