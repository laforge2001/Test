package org.jamp.ui.library.navigator;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.IDescriptionProvider;
import org.jamp.model.LibraryParent;
import org.jamp.model.NodeObject;

public class LibraryLabelProvider implements ILabelProvider,
		IDescriptionProvider {

	@Override
	public Image getImage(Object element) {
		if (element instanceof LibraryParent) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_FOLDER);
		} else if (element instanceof NodeObject) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_FILE);
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof LibraryParent) {
			return ((LibraryParent) element).getName() + " [ "
					+ ((LibraryParent) element).getChildren().size() + " ]";
		} else if (element instanceof NodeObject) {
			return ((NodeObject) element).getName();
		}
		return null;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDescription(Object anElement) {
		String text = getText(anElement);
		return "this is a description of " + text;
	}

}
