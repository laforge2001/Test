package org.jamp.ui.library.context;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;

public class JampPlayContextHelper {

	private static final IContextService _service = (IContextService) PlatformUI
			.getWorkbench().getService(IContextService.class);

	private static IContextActivation _playButton;

	public static final String ID = "playEnabled.context";

	public static void enablePlayCommand() {
		_playButton = _service.activateContext(ID);
	}

	public static void disablePlayCommand() {
		_service.deactivateContext(_playButton);
	}

}
