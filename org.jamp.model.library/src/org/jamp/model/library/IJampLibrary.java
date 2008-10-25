package org.jamp.model.library;

import java.util.List;

import org.jamp.model.MediaObject;
import org.jamp.model.query.IJampQuery;
import org.jamp.model.viewer.IJampLibraryViewer;

public interface IJampLibrary {

	public void addChangeListener(IJampLibraryViewer listener);

	public void removeChangeListener(IJampLibraryViewer listener);

	// add this object to the library
	public void add(MediaObject addMe);

	// Remove this object from the library
	public void remove(MediaObject removeMe);

	// update the media object in the library
	public void update(MediaObject updateMe);

	// Retrieve a media object from the library
	// supplying a query
	public List<MediaObject> get(IJampQuery query);

	// Re-sync values between database and any updates
	// in the file system.
	public void refresh();

	// remove from datastore
	public void removeFromDatastore(MediaObject deleteMe);

	// uses the preferences to determine where to look
	// for media objects
	public void updateLibrary();

	public void updateLibrary(String paths);

}
