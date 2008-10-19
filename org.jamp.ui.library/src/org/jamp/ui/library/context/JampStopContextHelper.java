package org.jamp.ui.library.context;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;

public class JampStopContextHelper {
	private static final IContextService _service = (IContextService) PlatformUI
			.getWorkbench().getService(IContextService.class);

	private static IContextActivation _stopButton;

	public static final String ID = "stopEnabled.context";

	public static void enablePlayCommand() {
		_stopButton = _service.activateContext(ID);
	}

	public static void disablePlayCommand() {
		_service.deactivateContext(_stopButton);
	}
}
