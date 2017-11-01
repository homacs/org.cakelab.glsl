package org.cakelab.glsl.builtin;

import java.io.InputStream;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.NodeList;
import org.cakelab.glsl.pp.tokens.Token;



public class BuiltinLoaderHelper {
	
	static final String DIRECTORY;
	static final ClassLoader CLASSLOADER;
	static BuiltinResourceManager BUILTIN_RESOURCE_MANAGER;


	
	static {
		DIRECTORY = BuiltinLoaderHelper.class.getPackage().getName().replace('.', '/');
		CLASSLOADER = BuiltinLoaderHelper.class.getClassLoader();
		BUILTIN_RESOURCE_MANAGER = new BuiltinResourceManager(BuiltinLoaderHelper.getBaseDirectory());
	}
	
	
	
	

	public static InputStream getInputStream(GLSLVersion version, String filename) {
		return getInputStream(version.number, version.profile, filename);
	}

	public static InputStream getInputStream(int version, GLSLVersion.Profile profile, String filename) {
		String url = getResourceDirectory(version, profile) + "/" + filename;
		InputStream in = CLASSLOADER.getResourceAsStream(url);
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


	public static Macro createMacro(String name, Token v) {
		Macro macro = new Macro(name, Interval.NONE);
		NodeList<Node> nodes = new NodeList<Node>();
		nodes.add(v);
		macro.setReplacementList(nodes);
		return macro;
	}


}
