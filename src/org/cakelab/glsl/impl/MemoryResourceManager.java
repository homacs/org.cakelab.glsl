package org.cakelab.glsl.impl;

import java.io.IOException;

import org.cakelab.glsl.Resource;

public class MemoryResourceManager extends ResourceManagerBase {

	
	
	public MemoryResourceManager() {
		super();
	}

	public MemoryResourceManager(ResourceIdProvider idProvider) {
		super(idProvider);
	}

	@Override
	protected Resource load(String relpath) throws IOException {
		throw new IOException("all string resources have to be registered before use");
	}

	@Override
	protected String toUrl(String path) throws IOException {
		return path;
	}
	
}
