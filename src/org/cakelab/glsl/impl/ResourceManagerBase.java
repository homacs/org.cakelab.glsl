package org.cakelab.glsl.impl;

import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;

public abstract class ResourceManagerBase implements ResourceManager {

	protected HashMap<String,Resource> resourceMap = new HashMap<String, Resource>();
	protected HashMap<String,Resource> idMap = new HashMap<String, Resource>();
	protected ResourceIdProvider idProvider;
	
	public ResourceManagerBase() {
		idProvider = new SimpleIdProvider();
	}
	public ResourceManagerBase(ResourceIdProvider idProvider) {
		this.idProvider = idProvider;
	}
	
	
	
	
	/** resets internal caches and unique id generator (counter) */
	@Override
	public void reset() {
		idMap.clear();
		resourceMap.clear();
		idProvider.reset();
	}
	
	
	@Override
	public Resource resolve(String relpath) throws IOException {
		String uniquePath = toUrl(relpath);
		Resource r = resourceMap.get(uniquePath);
		if (r == null) {
			r = load(relpath);
			resourceMap.put(uniquePath, r);
			idMap.put(r.getSourceIdentifier(), r);
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

	
	@Override
	public void add(Resource resource) throws IOException {
		String uniquePath = toUrl(resource.getPath());
		String id = resource.getSourceIdentifier();
		Resource occupied = idMap.get(id);
		if (occupied != null) {
			String oPath = toUrl(occupied.getPath());
			if (!oPath.equals(uniquePath)) throw new IOException("id " + id + " already occupied by " + occupied.getPath());
		}

		resourceMap.put(uniquePath, resource);
		idMap.put(resource.getSourceIdentifier(), resource);
	}


	@Override
	public Resource getResourceById(String id) {
		return idMap.get(id);
	}
	@Override
	public ResourceIdProvider getIdProvider() {
		return idProvider;
	}
	@Override
	public void setIdProvider(ResourceIdProvider idProvider) {
		this.idProvider = idProvider;
	}


}
