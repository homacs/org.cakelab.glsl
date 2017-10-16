package org.cakelab.glsl.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.cakelab.glsl.Resource;

public class JarResourceManager extends ResourceManagerBase {

	private static final ClassLoader loader = JarResourceManager.class.getClassLoader();
	private String basePath;

	public class ResourceInJar extends Resource {
	
		public ResourceInJar(String path, String identifier) {
			super(path, identifier);
		}
	
		@Override
		public InputStream openInputStream() {
			try {
				return open(super.path);
			} catch (IOException e) {
				throw new Error("internal error: Resource Manager has to check availability of resources before accepting the registration!");
			}
		}
	}

	
	public JarResourceManager() {
		super();
	}

	public JarResourceManager(ResourceIdProvider idProvider) {
		super(idProvider);
	}

	/** will interpret all add the given base path to all paths to be resolved. */
	public JarResourceManager(Package basePath) {
		this.basePath = basePath.getName().replace('.', '/');
	}

	private InputStream open(String relpath) throws IOException {
		String url = toUrl(relpath);
		String absolutePath = toJarPath(url);
		InputStream data = loader.getResourceAsStream(absolutePath);
		if (data == null) throw new FileNotFoundException("resource '" + relpath + "' not found");
		return data;
	}
	
	protected Resource load(String relpath) throws IOException {
		InputStream test = open(relpath);
		test.close();
		String id = idProvider.getNextId();
		return new ResourceInJar(relpath, id);
	}

	protected String toJarPath(String url) {
		return url;
	}


	protected String toUrl(String relpath) throws IOException {
		if (basePath != null) return basePath + '/' + relpath;
		else return relpath;
	}

}
