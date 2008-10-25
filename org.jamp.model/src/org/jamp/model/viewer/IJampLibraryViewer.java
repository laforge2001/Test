package org.jamp.model.viewer;

import org.jamp.model.MediaObject;

public interface IJampLibraryViewer {
	/**
	 * Update the view to reflect the fact that a task was added to the task
	 * list
	 * 
	 * @param task
	 */
	public void addMediaObject(MediaObject task);

	/**
	 * Update the view to reflect the fact that a task was removed from the task
	 * list
	 * 
	 * @param task
	 */
	public void removeMediaObject(MediaObject task);

	/**
	 * Update the view to reflect the fact that one of the tasks was modified
	 * 
	 * @param task
	 */
	public void updateMediaObject(MediaObject task);
}
