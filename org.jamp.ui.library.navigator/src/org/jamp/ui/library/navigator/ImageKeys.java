package org.jamp.ui.library.navigator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ImageKeys {

	public static final String PLUGIN_ID = "org.jamp.ui.library.navigator";

	public static final String PLAYLIST_ICON = "icon/playlist_22x22.png";

	public static ImageDescriptor getImage(String pluginId, String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(pluginId, path);
	}
}
