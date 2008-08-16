package org.jamp.ui.library.views;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;
import org.jamp.ui.library.command.PlayCommandHandler;
import org.jamp.ui.library.editor.MediaListEditor;

public class PlayerView extends ViewPart implements ISelectionListener {

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
		playButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				IHandlerService handlerService = (IHandlerService) getSite()
						.getService(IHandlerService.class);

				try {

					handlerService.executeCommand(PlayCommandHandler.ID, null);

				} catch (Exception ex) {

					throw new RuntimeException("play.command not found");

				}

			}

		});

		getSite().getPage().addSelectionListener(MediaListEditor.ID, this);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
