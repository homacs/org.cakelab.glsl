package org.cakelab.glsl.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;

public class StandardFileManager implements ResourceManager {

	HashMap<String,Resource> resources = new HashMap<String, Resource>();
	int count;
	
	@Override
	public Resource resolve(String path) {
		try {
			path = new File(path).getCanonicalPath();
			Resource r = resources.get(path);
			if (r == null) {
				String id = Integer.toString(count++);
				resources.put(path, new Resource(path, id, new FileInputStream(path)));
			}
			return r;
		} catch (IOException e) {
			return null;
		}
	}

}