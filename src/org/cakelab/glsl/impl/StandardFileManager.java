package org.cakelab.glsl.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;

public class StandardFileManager implements ResourceManager {

	HashMap<String,Resource> resources = new HashMap<String, Resource>();
	HashMap<String,Resource> ids = new HashMap<String, Resource>();
	int count;
	
	
	/** resets internal caches and unique id generator (counter) */
	public void reset() {
		ids.clear();
		resources.clear();
		count = 0;
	}
	
	
	@Override
	public Resource resolve(String relpath) throws IOException {
		String uniquePath = uniquePath(relpath);
		Resource r = resources.get(uniquePath);
		if (r == null) {
			File file = new File(uniquePath);
			if (!file.exists()) throw new FileNotFoundException("resource '" + relpath + "' not found");
			if (!file.canRead()) throw new IOException("don't have read permissions on '" + uniquePath + "'");
			String id = nextId();
			r = new Resource(relpath, id, new FileInputStream(file));
			resources.put(uniquePath, r);
			ids.put(id, r);
		}
		
		
		return r;
	}

	public void add(File file) throws IOException {
		add(new Resource(file.getPath(), nextId(), new FileInputStream(file)));
	}
	
	@Override
	public void add(Resource resource) throws IOException {
		String uniquePath = uniquePath(resource.getPath());
		String id = resource.getIdentifier();
		Resource occupied = ids.get(id);
		if (occupied != null) {
			String oPath = uniquePath(occupied.getPath());
			if (!oPath.equals(uniquePath)) throw new IOException("id " + id + " already occupied by " + occupied.getPath());
		}

		resources.put(uniquePath, resource);
		ids.put(resource.getIdentifier(), resource);
	}

	@Override
	public Resource getResourceById(String id) {
		return ids.get(id);
	}

	private String uniquePath(String relpath) throws IOException {
		return new File(relpath).getCanonicalPath();
	}

	private String nextId() {
		return Integer.toString(count++);
	}


}
