package org.jamp.internal.model.MediaPlayer;

import org.jamp.model.MediaPlayer.MediaApi;
import org.osgi.service.component.ComponentContext;

public class ServiceComponent {

	private static MediaApi[] _apis;

	public static MediaApi[] getApis() {
		return _apis;
	}

	protected void activate(final ComponentContext context) {
		_apis = (MediaApi[]) context.locateServices("MediaApi");
	}

	protected void deactivate(final ComponentContext context) {
		_apis = null;
	}

}
