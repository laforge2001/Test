package org.jamp.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.jamp.ui.library.views.PlayerView;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.setFixed(true);

		IFolderLayout leftside = layout.createFolder("library",
				IPageLayout.LEFT, 0.3f, editorArea);
		leftside.addView("org.jamp.library.view");
		leftside.addView(PlayerView.ID);

		// layout.addStandaloneView("org.jamp.library.view", true,
		// IPageLayout.LEFT, 0.3f, editorArea);

		// layout.addStandaloneView(LibraryView.ID, true, IPageLayout.LEFT,
		// 0.3f,
		// editorArea);
		// layout.addStandaloneView(PlayerView.ID, false, IPageLayout.BOTTOM,
		// 0.8f, editorArea);
	}
}
