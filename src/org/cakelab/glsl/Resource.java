package org.cakelab.glsl;

import java.io.InputStream;

public class Resource {

	private final String path;
	private final String identifier;
	private final InputStream data;

	/**
	 * @param path A file path or user friendly identifier (reference to be used in #include directives)
	 * @param identifier a glsl source string identifier (i.e. an integer number)
	 * @param data
	 */
	public Resource(String path, String identifier, InputStream data) {
		this.path = path;
		this.identifier = identifier;
		this.data = data;
	}
	
	public String getPath() {
		return path;
	}

	public String getSourceIdentifier() {
		return identifier;
	}

	public InputStream getData() {
		return data;
	}

}
