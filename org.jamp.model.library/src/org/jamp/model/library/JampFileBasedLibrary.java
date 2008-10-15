package org.jamp.model.library;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.jamp.model.MediaObject;

public class JampFileBasedLibrary implements IJampLibrary, Serializable {

	private final IPreferencesService _prefService = Platform
			.getPreferencesService();

	private final List<String> _locations = new ArrayList<String>();
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
		_locations.add(_prefService.get("libraryPaths", "test", null));
		for (String s : _locations) {
			System.out.println(s);
		}
		// TODO Auto-generated method stub

	}
}
