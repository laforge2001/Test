package org.jamp.ui.library.editor;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class MediaListEditorInput implements IEditorInput {

	private final String _playList;
	private final ImageDescriptor _imageDescr;

	public MediaListEditorInput(String playListName, ImageDescriptor imageDescr) {
		Assert.isNotNull(playListName);
		_playList = playListName;
		_imageDescr = imageDescr;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		
		return _imageDescr;
	}

	@Override
	public String getName() {
		return _playList;
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		return _playList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return true;
		}
		if (!(obj instanceof MediaListEditorInput)) {
			return false;
		}
		MediaListEditorInput other = (MediaListEditorInput) obj;
		return _playList.equals(other._playList);
	}

	@Override
	public int hashCode() {
		return _playList.hashCode();
	}

}
