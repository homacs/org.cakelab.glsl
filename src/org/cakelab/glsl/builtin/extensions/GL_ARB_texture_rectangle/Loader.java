package org.cakelab.glsl.builtin.extensions.GL_ARB_texture_rectangle;

import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.builtin.extensions.KeywordTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.lexer.tokens.GLSLKeywords;
import org.cakelab.glsl.pp.ast.Macro;

public class Loader extends GLSLExtensionLoader {

	@Override
	protected KeywordTable loadKeywordTable(String extension) throws IOException {
		return KeywordTable.create(GLSLKeywords.BUILTIN_TYPE_TOKEN, "sampler2DRect", "sampler2DRectShadow");
	}

	@Override
	protected GLSLExtension createExtension(Properties properties, GLSLVersion version, ShaderType shaderType,
			HashMap<String, Macro> extensionMacros, KeywordTable extendedKeywords) {
		GLSLExtension e = super.createExtension(properties, version, shaderType, extensionMacros, extendedKeywords);
		e.addType(Type._sampler2DRect);
		e.addType(Type._sampler2DRectShadow);
		return e;
	}




	
	
}
