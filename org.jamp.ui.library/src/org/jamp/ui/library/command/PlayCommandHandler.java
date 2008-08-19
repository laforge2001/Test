package org.jamp.ui.library.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jamp.model.MediaObject;

public class PlayCommandHandler extends AbstractHandler implements IHandler {

	public static final String ID = "play.command";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(
		// event).getShell(), "Info", "Info for you");

		MediaObject selectedMedia = (MediaObject) HandlerUtil
				.getCurrentSelection(event);
		selectedMedia.play();
		return null;
	}

}
