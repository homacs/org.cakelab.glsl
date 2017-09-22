package org.cakelab.glsl.builtin;

import java.io.InputStream;

import org.cakelab.glsl.GLSLVersion;

public class BuiltinResources {
	private static final String DIRECTORY = BuiltinResources.class.getPackage().getName().replace('.', '/');
	private static final ClassLoader loader = BuiltinResources.class.getClassLoader();
	
	

	public static InputStream getInputStream(GLSLVersion version, String filename) {
		return getInputStream(version.number, version.profile, filename);
	}

	public static InputStream getInputStream(int version, GLSLVersion.Profile profile, String filename) {
		String url = getResourceDirectory(version, profile) + "/" + filename;
		InputStream in = loader.getResourceAsStream(url);
		if (in == null) throw new Error("internal error: missing version specific file '" + url + "'. Preprocessor is supposed to prevent this from happening.");
		return in;
	}

	public static String getResourceDirectory(int version, GLSLVersion.Profile profile) {
		return DIRECTORY + "/" + profile.name() + "/V" + version;
	}

	public static String getResourceDirectory(GLSLVersion version) {
		return getResourceDirectory(version.number, version.profile);
	}

	public static String getBaseDirectory() {
		return DIRECTORY;
	}

	public static String getExtensionDirectory(String extension) {
		return DIRECTORY + "/extensions/" + extension;
	}





}
