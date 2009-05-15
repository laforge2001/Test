package org.jamp.ui.library.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.navigator.CommonNavigator;

public class LibraryView extends CommonNavigator {

	protected IAdaptable getInitialInput() {
		return new Root();
	}

}
