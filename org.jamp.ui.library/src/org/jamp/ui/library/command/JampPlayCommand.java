package org.jamp.ui.library.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jamp.model.MediaObject;

public class JampPlayCommand extends AbstractHandler implements IHandler {

	public static final String ID = "play.command";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection selection = HandlerUtil.getActiveEditor(event)
				.getEditorSite().getSelectionProvider().getSelection();

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection playSelection = (IStructuredSelection) selection;
			MediaObject playMe = (MediaObject) playSelection.getFirstElement();
			playMe.play();
		}

		return null;
	}
}
