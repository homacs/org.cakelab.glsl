package org.cakelab.glsl.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;

public abstract class ResourceManagerBase implements ResourceManager {

	protected HashMap<String,Resource> resources = new HashMap<String, Resource>();
	protected HashMap<String,Resource> ids = new HashMap<String, Resource>();
	protected int count;
	
	
	/** resets internal caches and unique id generator (counter) */
	public void reset() {
		ids.clear();
		resources.clear();
		count = 0;
	}
	
	
	@Override
	public Resource resolve(String relpath) throws IOException {
		String uniquePath = toUrl(relpath);
		Resource r = resources.get(uniquePath);
		if (r == null) {
			r = load(relpath);
			resources.put(uniquePath, r);
			ids.put(r.getSourceIdentifier(), r);
		}
		return r;
	}



	protected abstract Resource load(String relpath) throws IOException;

	/**
	 * URL is supposed to be unique. URL does not have to have a 
	 * protocol identifier, but it can have one.
	 * 
	 * The given URL is translated in an absolute resource path before
	 * any attempt to load its data.
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	protected abstract String toUrl(String path) throws IOException;


	public void add(File file) throws IOException {
		add(new Resource(file.getPath(), getNextId(), new FileInputStream(file)));
	}
	
	@Override
	public void add(Resource resource) throws IOException {
		String uniquePath = toUrl(resource.getPath());
		String id = resource.getSourceIdentifier();
		Resource occupied = ids.get(id);
		if (occupied != null) {
			String oPath = toUrl(occupied.getPath());
			if (!oPath.equals(uniquePath)) throw new IOException("id " + id + " already occupied by " + occupied.getPath());
		}

		resources.put(uniquePath, resource);
		ids.put(resource.getSourceIdentifier(), resource);
	}


	@Override
	public Resource getResourceById(String id) {
		return ids.get(id);
	}

	protected String getNextId() {
		return Integer.toString(count++);
	}


}
