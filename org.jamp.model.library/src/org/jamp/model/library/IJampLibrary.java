package org.jamp.model.library;

import org.jamp.model.MediaObject;

public interface IJampLibrary {

	// add this object to the library
	public void add(MediaObject addMe);

	// Remove this object from the library
	public void remove(MediaObject removeMe);

	// update the media object in the library
	public void update(MediaObject updateMe);

	// Retrieve a media object from the library
	// supplying a query
	public MediaObject get(IJampQuery query);

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
