package org.cakelab.glsl;

import java.io.IOException;

public interface ResourceManager {

	Resource resolve(String path) throws IOException;

	void add(Resource resource) throws IOException;
	
	Resource getResourceById(String id);

}
