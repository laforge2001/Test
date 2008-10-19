package org.jamp.ui.library.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;

public class JampContextHelper {

	private static IContextActivation _activeContext;

	// public static final String ID = "playEnabled.context";

	public static void enablePlayCommand(String id) {
		_activeContext = _contexts.get(id);

		_contexts.get(id) = _service.activateContext(id);
	}

	public static void disablePlayCommand() {
		_service.deactivateContext(_playButton);
	}
}
