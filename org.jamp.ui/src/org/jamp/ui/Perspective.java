package org.jamp.ui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.jamp.ui.library.views.LibraryView;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.setFixed(false);

		layout.addStandaloneView(LibraryView.ID, false, IPageLayout.LEFT, 0.5f,
				editorArea);
	}

}
