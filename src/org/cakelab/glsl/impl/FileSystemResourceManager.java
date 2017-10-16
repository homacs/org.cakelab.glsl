package org.cakelab.glsl.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.cakelab.glsl.Resource;

public class FileSystemResourceManager extends ResourceManagerBase {

	public FileSystemResourceManager() {
		super();
	}

	public FileSystemResourceManager(ResourceIdProvider idProvider) {
		super(idProvider);
	}
	
	public void add(File file) throws IOException {
		add(new ResourceFile(file.getPath(), idProvider.getNextId()));
	}

	protected Resource load(String relpath) throws IOException {
		String uniquePath = toUrl(relpath);
		File file = new File(uniquePath);
		if (!file.exists()) throw new FileNotFoundException("resource '" + relpath + "' not found");
		if (!file.canRead()) throw new IOException("don't have read permissions on '" + uniquePath + "'");
		String id = idProvider.getNextId();
		return new ResourceFile(relpath, id);
	}


	protected String toUrl(String relpath) throws IOException {
		return new File(relpath).getCanonicalPath();
	}

}
