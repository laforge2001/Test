package org.jamp.ui.library.views;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.jamp.model.MediaObject;
import org.jamp.ui.library.editor.MediaListEditor;

public class PlayerView extends ViewPart implements ISelectionListener {

	public static final String ID = "org.jamp.ui.library.views.PlayerView";

	private MediaObject _playMe;

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
		getSite().getPage().addSelectionListener(MediaListEditor.ID, this);
		playButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void widgetSelected(SelectionEvent e) {

				try {
					if (_playMe != null)
						new Thread(_playMe).start();

				} catch (Exception ex) {

					throw new RuntimeException("Error playing file");

				}

			}

		});

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			MediaObject newPerson = (MediaObject) ((IStructuredSelection) selection)
					.getFirstElement();
			_playMe = newPerson;
		}
	}

}
