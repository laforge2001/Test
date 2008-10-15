package org.jamp.model.library;

import java.io.Serializable;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.jamp.model.MediaObject;

public class JampFileBasedLibrary implements IJampLibrary, Serializable {

	private final IPreferencesService _prefService = Platform
			.getPreferencesService();
	/**
	 * 
	 */
	private static final long serialVersionUID = -5679254328240338749L;

	@Override
	public void add(MediaObject addMe) {
		// TODO Auto-generated method stub

	}

	@Override
	public MediaObject get(IJampQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(MediaObject removeMe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFromDatastore(MediaObject deleteMe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(MediaObject updateMe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLibrary() {
		// TODO Auto-generated method stub

	}

}
