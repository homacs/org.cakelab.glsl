package org.cakelab.glsl.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;





public class DelegatingResourceManager extends MemoryResourceManager {
	
	private ArrayList<ResourceManager> resourceManagers = new ArrayList<ResourceManager>();
	
	public DelegatingResourceManager() {
	}

	public DelegatingResourceManager(ResourceIdProvider idProvider) {
		super(idProvider);
	}
	
	
	public DelegatingResourceManager(ResourceManager ... resourceManagers) {
		registerAll(resourceManagers);
	}

	public void registerAll(ResourceManager ... resourceManagers) {
		for (ResourceManager rm : resourceManagers) {
			register(rm);
		}
	}

	public void register(ResourceManager rm) {
		ResourceIdProvider idp = rm.getIdProvider();
		if (idp != this.idProvider && idp.isUsed()) {
			throw new IllegalArgumentException("can only add unused resource managers");
		}
		rm.setIdProvider(getIdProvider());
		resourceManagers.add(rm);
	}
	
	@Override
	public Resource resolve(String relpath) throws IOException {
		
		try {
			return super.resolve(relpath);
		} catch (IOException e) {
			// try registered resource managers
		}
		
		for (ResourceManager rm : resourceManagers) {
			try {
				return rm.resolve(relpath);
			} catch (IOException e) {
				// try next resource manager
			}
		}
		
		throw new FileNotFoundException("cannot find resource '" + relpath + "'");
	}

	@Override
	public Resource getResourceById(String id) {
		Resource resource = super.getResourceById(id);
		if (resource == null) {
			for (ResourceManager rm : resourceManagers) {
				resource = rm.getResourceById(id);
				if (resource != null) return resource;
			}
		}
		return null;
	}

	
	@Override
	/**
	 * calls reset on all registered resource managers and removes all added in-memory resources.
	 */
	public void reset() {
		super.reset();
		for (ResourceManager rm : resourceManagers) {
			rm.reset();
		}
	}
	

}
