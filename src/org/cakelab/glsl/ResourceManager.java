package org.cakelab.glsl;

import java.io.IOException;

public interface ResourceManager {
	// TODO: feel like we should use URL or URI to identify resources in general
	Resource resolve(String path) throws IOException;

	void add(Resource resource) throws IOException;
	
	Resource getResourceById(String id);

	public void reset();
}
