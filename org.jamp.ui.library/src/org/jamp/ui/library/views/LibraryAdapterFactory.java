package org.jamp.ui.library.views;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.jamp.model.NodeObject;

public class LibraryAdapterFactory implements IAdapterFactory {

	private final IWorkbenchAdapter _libraryAdapter = new IWorkbenchAdapter() {
		public Object getParent(Object o) {
			return ((NodeObject) o).getParent();
		}

		@Override
		public Object[] getChildren(Object o) {
			return ((NodeObject) o).getChildren().toArray();
		}

		@Override
		public ImageDescriptor getImageDescriptor(Object object) {
			String key = ((NodeObject) object).getIconLocation();
			return AbstractUIPlugin.imageDescriptorFromPlugin(
					IImageKeys.PLUGIN_ID, key);
		}

		@Override
		public String getLabel(Object o) {
			return ((NodeObject) o).getName();
		}

	};

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IWorkbenchAdapter.class
				&& adaptableObject instanceof NodeObject)
			return _libraryAdapter;
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class[] getAdapterList() {
		return new Class[] { IWorkbenchAdapter.class };
	}

}
