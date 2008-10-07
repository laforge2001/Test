package org.jamp.ui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.jamp.ui.library.views.LibraryView;
import org.jamp.ui.library.views.PlayerView;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.setFixed(true);

		layout.addStandaloneView(LibraryView.ID, true, IPageLayout.LEFT, 0.3f,
				editorArea);
		layout.addStandaloneView(PlayerView.ID, false, IPageLayout.BOTTOM,
				0.8f, editorArea);
	}
}
