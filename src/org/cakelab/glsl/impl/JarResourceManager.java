package org.cakelab.glsl.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.cakelab.glsl.Resource;

public class JarResourceManager extends ResourceManagerBase {
	private static final ClassLoader loader = JarResourceManager.class.getClassLoader();

	protected Resource load(String relpath) throws IOException {
		String url = toUrl(relpath);
		String absolutePath = toJarPath(url);
		InputStream data = loader.getResourceAsStream(absolutePath);
		if (data == null) throw new FileNotFoundException("resource '" + relpath + "' not found");
		String id = getNextId();
		return new Resource(relpath, id, data);
	}


	protected String toJarPath(String url) {
		return url;
	}


	protected String toUrl(String relpath) throws IOException {
		return relpath;
	}
	
	

}
