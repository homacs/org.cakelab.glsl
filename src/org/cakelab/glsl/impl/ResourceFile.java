package org.cakelab.glsl.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.cakelab.glsl.Resource;

public class ResourceFile extends Resource {

	public ResourceFile(String path, String identifier) throws IOException {
		super(path, identifier);
		FileInputStream test = new FileInputStream(path);
		test.close();
	}

	@Override
	public InputStream openInputStream() {
		try {
			return new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// we tested it in constructor;
			throw new Error("internal error: cannot open input stream", e);
		}
	}

}
