package org.cakelab.glsl;

import java.io.InputStream;


public abstract class Resource {

	protected final String path;
	private final String identifier;

	/**
	 * @param path A file path or user friendly identifier (reference to be used in #include directives)
	 * @param identifier a glsl source string identifier (i.e. an integer number)
	 * @param data
	 */
	public Resource(String path, String identifier) {
		this.path = path;
		this.identifier = identifier;
	}
	
	public String getPath() {
		return path;
	}
	

	public String getSourceIdentifier() {
		return identifier;
	}

	public abstract InputStream openInputStream();

}
