package org.jamp.model.music;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.jamp.model.NodeObject;
import org.jamp.model.music.internal.ImageKeys;

public class Album extends NodeObject {

	public Album(Object data) {
		super("Album", data);
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				ImageKeys.PLUGIN_ID, ImageKeys.ALBUM_ICON));
	}

}
