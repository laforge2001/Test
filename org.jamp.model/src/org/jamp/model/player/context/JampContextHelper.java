package org.jamp.model.player.context;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;

public class JampContextHelper {

	private static IContextActivation _activeContext;
	private static IContextService _service = (IContextService) PlatformUI
			.getWorkbench().getService(IContextService.class);

	private final String _contextId;

	public JampContextHelper(String id) {
		_contextId = id;
		enableContext();
	}

	public void enableContext() {
		_activeContext = _service.activateContext(_contextId);
	}

	public void disableContext() {
		_service.deactivateContext(_activeContext);
	}
}
