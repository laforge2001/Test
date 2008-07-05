package org.jamp.ui.library.views;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;
import org.jamp.model.LibraryParent;
import org.jamp.model.MusicLibraryParent;
import org.jamp.model.NodeObject;
import org.jamp.model.PictureLibraryParent;
import org.jamp.model.VideoLibraryParent;
import org.jamp.model.music.Album;
import org.jamp.model.music.Artist;
import org.jamp.model.music.Genre;
import org.jamp.model.music.Rating;
import org.jamp.model.music.RecentlyAdded;
import org.jamp.model.music.Songs;
import org.jamp.model.music.Year;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class LibraryView extends ViewPart {

	public static final String ID = "org.jamp.ui.library.views.LibraryView";
	private TreeViewer _treeViewer;
	private LibraryParent _library;
	private IAdapterFactory _adapterFactory = new LibraryAdapterFactory();

	@Override
	public void createPartControl(Composite parent) {
		initializeLibrary();
		Platform.getAdapterManager().registerAdapters(_adapterFactory,
				NodeObject.class);
		_treeViewer = new TreeViewer(parent, SWT.BORDER | SWT.MULTI
				| SWT.V_SCROLL);
		getSite().setSelectionProvider(_treeViewer);
		_treeViewer.setLabelProvider(new WorkbenchLabelProvider());
		_treeViewer.setContentProvider(new BaseWorkbenchContentProvider());
		_treeViewer.setInput(_library);
	}

	@Override
	public void setFocus() {
		_treeViewer.getControl().setFocus();

	}

	public void dispose() {
		Platform.getAdapterManager().unregisterAdapters(_adapterFactory);
		super.dispose();
	}

	private void initializeLibrary() {
		_library = new LibraryParent("", null);
		MusicLibraryParent _musicParent = new MusicLibraryParent("Music", null);
		VideoLibraryParent _videoParent = new VideoLibraryParent("Videos", null);
		PictureLibraryParent _pictureParent = new PictureLibraryParent(
				"Pictures", null);

		_library.addChild(_musicParent);
		_library.addChild(_videoParent);
		_library.addChild(_pictureParent);

		_musicParent.addChild(new RecentlyAdded(null));
		_musicParent.addChild(new Artist(null));
		_musicParent.addChild(new Album(null));
		_musicParent.addChild(new Songs(null));
		_musicParent.addChild(new Genre(null));
		_musicParent.addChild(new Year(null));
		_musicParent.addChild(new Rating(null));

	}

}