package org.jamp.model.music;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.jamp.model.NodeObject;
import org.jamp.model.music.internal.ImageKeys;

public class RecentlyAdded extends NodeObject {

	public RecentlyAdded(Object data) {
		super("Recently Added", data);
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				ImageKeys.PLUGIN_ID, ImageKeys.RECENTLY_ADDED_ICON));
	}

}
