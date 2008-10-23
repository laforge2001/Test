package org.jamp.ui.library.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JampContextManager {
	private static Map<String, JampContextHelper> _contexts = Collections
			.synchronizedMap(new HashMap<String, JampContextHelper>());

	private JampContextManager() {
	}

	public static void activateContext(String id) {
		JampContextHelper returnMe = _contexts.get(id);
		if (returnMe == null) {
			returnMe = new JampContextHelper(id);
			_contexts.put(id, returnMe);
		}
	}

	public static void deactivateContext(String id) {
		JampContextHelper deactivateMe = _contexts.get(id);
		if (deactivateMe != null) {
			deactivateMe.disableContext();
		}
	}
}
