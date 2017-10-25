package org.cakelab.glsl.builtin.extensions.GL_ARB_shading_language_include;

import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.KeywordTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.ast.Macro;

public class GLSLExtension_ARB_shading_language_include extends GLSLExtension {

	public GLSLExtension_ARB_shading_language_include(Properties properties, GLSLVersion version, ShaderType type,
			HashMap<String, Macro> extensionMacros, KeywordTable addedKeywords) {
		super(properties, version, type, extensionMacros, addedKeywords);
	}

	@Override
	public void enable(PPState ppstate) {
		super.enable(ppstate);
		ppstate.setIncludeEnabled(true);
	}

	@Override
	public void disable(PPState ppstate) {
		ppstate.setIncludeEnabled(false);
		super.disable(ppstate);
	}

	
	
	
}
