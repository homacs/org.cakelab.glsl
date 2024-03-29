package org.cakelab.glsl.builtin.extensions.GL_ARB_shader_image_load_store;

import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.builtin.extensions.KeywordTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.pp.ast.Macro;

public class Loader extends GLSLExtensionLoader {

	@Override
	protected GLSLExtension createExtension(Properties properties, GLSLVersion version, ShaderType shaderType,
			HashMap<String, Macro> extensionMacros, KeywordTable extendedKeywords) {
		GLSLExtension e = super.createExtension(properties, version, shaderType, extensionMacros, extendedKeywords);
		assert (!version.profile.equals(GLSLVersion.Profile.es));
		// add built-in types
		if (version.number < 420) addBuiltinTypesForKeywords(e, extendedKeywords);
		return e;
	}


	
	
}
