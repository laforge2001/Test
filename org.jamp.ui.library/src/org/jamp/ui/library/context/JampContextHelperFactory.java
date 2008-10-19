package org.jamp.ui.library.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;

public class JampContextHelperFactory {
	private static final IContextService _service = (IContextService) PlatformUI
			.getWorkbench().getService(IContextService.class);

	private static Map<String, JampContextHelper> _contexts = Collections
			.synchronizedMap(new HashMap<String, JampContextHelper>());

	private JampContextHelperFactory() {
	}

	public static void activateContext(String id) {
		IContextActivation returnMe = _contexts.get(id);
		if (returnMe == null) {
			returnMe = _service.activateContext(id);
			_contexts.put(id, returnMe);
		}
	}

	public static void deactivateContext(String id) {
		IContextActivation returnMe = _contexts.get(id);
		if (returnMe == null) {
			returnMe = _service.activateContext(id);
			_contexts.put(id, returnMe);
		}
	}
}
