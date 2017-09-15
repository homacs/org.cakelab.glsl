package org.cakelab.glsl.versioning;

import java.io.InputStream;

public class LookupResource {
	private static final String DIRECTORY = LookupResource.class.getPackage().getName().replace('.', '/');
	private static final ClassLoader loader = LookupResource.class.getClassLoader();
	
	

	public static InputStream getInputStream(int version, String filename) {
		String url = getVersionPath(version) + "/" + filename;
		InputStream in = loader.getResourceAsStream(url);
		if (in == null) throw new Error("internal error: missing version specific file '" + url + "'");
		return in;
	}



	public static String getVersionPath(int version) {
		return DIRECTORY + "/V" + version;
	}

}
