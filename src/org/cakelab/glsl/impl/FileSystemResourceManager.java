package org.cakelab.glsl.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.cakelab.glsl.Resource;

public class FileSystemResourceManager extends ResourceManagerBase {

	protected Resource load(String relpath) throws IOException {
		String uniquePath = toUrl(relpath);
		File file = new File(uniquePath);
		if (!file.exists()) throw new FileNotFoundException("resource '" + relpath + "' not found");
		if (!file.canRead()) throw new IOException("don't have read permissions on '" + uniquePath + "'");
		String id = getNextId();
		return new Resource(relpath, id, new FileInputStream(file));
	}


	protected String toUrl(String relpath) throws IOException {
		return new File(relpath).getCanonicalPath();
	}

}