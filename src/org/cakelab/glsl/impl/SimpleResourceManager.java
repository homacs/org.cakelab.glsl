package org.cakelab.glsl.impl;

import java.io.IOException;

import org.cakelab.glsl.Resource;

public class SimpleResourceManager extends ResourceManagerBase {

	@Override
	protected Resource load(String relpath) throws IOException {
		throw new IOException("all string resources have to be registered before use");
	}

	@Override
	protected String toUrl(String path) throws IOException {
		return path;
	}
	
}
