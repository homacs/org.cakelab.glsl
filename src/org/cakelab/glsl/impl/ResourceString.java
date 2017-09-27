package org.cakelab.glsl.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.cakelab.glsl.Resource;

public class ResourceString extends Resource {

	private String sourceCode;

	public ResourceString(String path, String identifier, String sourceCode) {
		super(path, identifier);
		this.sourceCode = sourceCode;
	}

	@Override
	public InputStream openInputStream() {
		return new ByteArrayInputStream(sourceCode.getBytes());
	}

}
