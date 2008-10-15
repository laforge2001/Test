package org.jamp.model.library;

public class JampLibraryFactory {

	private static IJampLibrary _instance;

	public static IJampLibrary getInstance() {
		if (_instance == null)
			_instance = new JampFileBasedLibrary();
		return _instance;
	}

}
