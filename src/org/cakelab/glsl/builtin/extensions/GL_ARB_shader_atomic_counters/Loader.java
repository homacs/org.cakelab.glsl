package org.cakelab.glsl.builtin.extensions.GL_ARB_shader_atomic_counters;

import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.builtin.extensions.KeywordTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.pp.ast.Macro;

public class Loader extends GLSLExtensionLoader {

	@Override
	protected KeywordTable loadKeywordTable(String extension) throws IOException {
		return KeywordTable.create(vocabulary.builtintype(), Type._atomic_uint.getName());
	}

	@Override
	protected GLSLExtension createExtension(Properties properties, GLSLVersion version, ShaderType shaderType,
			HashMap<String, Macro> extensionMacros, KeywordTable extendedKeywords) {
		GLSLExtension e = super.createExtension(properties, version, shaderType, extensionMacros, extendedKeywords);
		e.addType(Type._atomic_uint);
		return e;
	}

	
	
}
