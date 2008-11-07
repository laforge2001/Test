package org.jamp.model.query;

import org.jamp.model.MediaObject;

public class JampMediaObjectQuery extends AbstractJampQuery {

	private final String _filter;

	public JampMediaObjectQuery(String filter) {
		_filter = filter;
	}

	@Override
	public boolean isSatisfiedBy(Object obj) {
		if (obj instanceof MediaObject) {
			MediaObject m = (MediaObject) obj;
			// ignores case and matches string anywhere in the word
			if (m.getLocation().matches("(?i).*" + _filter + ".*")) {
				return true;
			}
		}
		return false;
	}

}
