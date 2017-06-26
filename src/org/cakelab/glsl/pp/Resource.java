package org.cakelab.glsl.pp;

import java.io.InputStream;

public class Resource {

	private final String path;
	private final String identifier;
	private final InputStream data;

	public Resource(String path, String identifier, InputStream data) {
		this.path = path;
		this.identifier = identifier;
		this.data = data;
	}
	
	public String getPath() {
		return path;
	}

	public String getIdentifier() {
		return identifier;
	}

	public InputStream getData() {
		return data;
	}

}
