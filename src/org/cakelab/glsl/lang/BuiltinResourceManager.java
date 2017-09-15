package org.cakelab.glsl.lang;

import java.io.IOException;

import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.impl.JarResourceManager;

public class BuiltinResourceManager extends JarResourceManager implements ResourceManager {

	private static final String BUILTIN_URL_PROTOCOL = "builtin://";
	private String baseDir;

	public BuiltinResourceManager(String baseDir) {
		this.baseDir = baseDir;
		super.count = -1;
	}

	@Override
	protected String getNextId() {
		return Integer.toString(super.count--);
	}

	@Override
	protected String toUrl(String relpath) throws IOException {
		if (!relpath.startsWith(BUILTIN_URL_PROTOCOL)) {
			return BUILTIN_URL_PROTOCOL + toAbsolutePath(relpath);
		} else {
			return relpath;
		}
	}

	private String toAbsolutePath(String relpath) {
		// FIXME: This is not actually an absolute path yet
		if (!isAbsolutePath(relpath)) {
			relpath = baseDir + "/" + relpath;
		}
		return relpath;
	}

	protected String toJarPath(String url) {
		if (!url.startsWith(BUILTIN_URL_PROTOCOL)) {
			throw new Error("expected url but got '" + url + "'");
		} else {
			url = url.substring(BUILTIN_URL_PROTOCOL.length());
		}
		return toAbsolutePath(url);
	}

	private boolean isAbsolutePath(String relpath) {
		return relpath.startsWith(baseDir);
	}

	
	
	
}
