package org.jamp.model.music;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.jamp.model.NodeObject;
import org.jamp.model.music.internal.ImageKeys;

public class Artist extends NodeObject {

	public Artist(Object data) {
		super("Artist", data);
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				ImageKeys.PLUGIN_ID, ImageKeys.ARTIST_ICON));
	}

}
