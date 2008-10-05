package org.jamp.ui.library.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.jamp.model.MediaObject;
import org.jamp.ui.library.image.IImageKeys;

public class JampPlayAction extends Action implements ISelectionListener,
		IWorkbenchAction {

	private final IWorkbenchWindow _window;
	public final static String ID = "org.jamp.ui.library.action.JampPlayAction";
	private IStructuredSelection _selection;

	public JampPlayAction(IWorkbenchWindow window) {
		_window = window;
		setId(ID);
		setText("&Play Media");
		setToolTipText("Play the Media File");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				IImageKeys.PLUGIN_ID, IImageKeys.SAMPLE_ICON));
		_window.getSelectionService().addSelectionListener(this);
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {

		if (selection instanceof IStructuredSelection) {
			_selection = (IStructuredSelection) selection;
			setEnabled(_selection.getFirstElement() instanceof MediaObject);
		} else {
			setEnabled(false);
		}

	}

	@Override
	public void dispose() {
		_window.getSelectionService().removePostSelectionListener(this);
	}

	@Override
	public void run() {
		Object item = _selection.getFirstElement();
		MediaObject playMe = (MediaObject) item;
		playMe.play();
	}

}
