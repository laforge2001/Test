package org.jamp.ui.library.editor;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.jamp.model.music.api.MusicObject;

public class MediaListLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		String result = "";
		MusicObject task = (MusicObject) element;
		switch (columnIndex) {
		case 0:
			result = task.getAPI().getSongTitle();
			break;
		case 1:
			result = task.getAPI().getArtist();
			break;
		case 2:
			result = task.getAPI().getAlbum();
			break;
		case 3:
			result = task.getAPI().getYear().toString();
			break;
		case 4:
			result = task.getLocation();
		default:
			break;
		}
		return result;
	}
}
