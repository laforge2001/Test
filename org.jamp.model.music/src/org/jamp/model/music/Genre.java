package org.jamp.model.music;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.jamp.model.NodeObject;
import org.jamp.model.music.internal.ImageKeys;

public class Genre extends NodeObject {

	public Genre(Object data) {
		super("Genre", data);
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				ImageKeys.PLUGIN_ID, ImageKeys.GENRE_ICON));
	}

}
