package org.jamp.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.setFixed(true);

		IFolderLayout leftside = layout.createFolder("library",
				IPageLayout.LEFT, 0.3f, editorArea);
		leftside.addView("org.jamp.library.music.view");
		leftside.addView("org.jamp.library.movies.view");
		leftside.addView("org.jamp.library.photos.view");

		// layout.addStandaloneView("org.jamp.library.view", true,
		// IPageLayout.LEFT, 0.3f, editorArea);

		// layout.addStandaloneView(LibraryView.ID, true, IPageLayout.LEFT,
		// 0.3f,
		// editorArea);
		// layout.addStandaloneView(PlayerView.ID, false, IPageLayout.BOTTOM,
		// 0.8f, editorArea);
	}
}
