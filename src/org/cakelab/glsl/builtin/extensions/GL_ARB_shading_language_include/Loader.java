package org.cakelab.glsl.builtin.extensions.GL_ARB_shading_language_include;

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
		return new GLSLExtension_ARB_shading_language_include(properties, version, shaderType, extensionMacros, extendedKeywords);
	}

	
	
	
}
