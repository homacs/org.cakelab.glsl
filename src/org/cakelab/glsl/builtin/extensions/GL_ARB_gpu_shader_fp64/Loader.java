package org.cakelab.glsl.builtin.extensions.GL_ARB_gpu_shader_fp64;

import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.BuiltinResourceManager;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionLoader;
import org.cakelab.glsl.builtin.extensions.GLSLExtensionSymbolTable;
import org.cakelab.glsl.builtin.extensions.KeywordTable;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.pp.ast.Macro;

public class Loader extends GLSLExtensionLoader {

	
	
	@Override
	public GLSLExtension load(WorkingSet ws, Properties properties, BuiltinResourceManager builtinResourceManager) throws IOException {
		Resource preambleResource;
		try {
			preambleResource = properties.getPreamble();
		} catch (IOException e1) {
			throw new Error("internal error: failed to load preamble for extension " + properties.getName(), e1);
		}
		
		GLSLVersion glslVersion = ws.getGLSLVersion();
		ShaderType shaderLanguage = ws.getShaderType();
		
		GLSL_ANTLR_PPOutputBuffer preprocessedPreamble = new GLSL_ANTLR_PPOutputBuffer(BUILTIN_RESOURCE_MANAGER);

		HashMap<String, Macro> extensionMacros = preprocess(preambleResource, glslVersion, shaderLanguage, preprocessedPreamble);

		KeywordTable addedKeywords = loadKeywordTable(properties.getName());

		
		
		GLSLExtension e = new GLSLExtension(properties, glslVersion, shaderLanguage, extensionMacros, addedKeywords);
		assert (!glslVersion.profile.equals(GLSLVersion.Profile.es));
		if (glslVersion.number < 400) {
			// add built-in types
			addTypes(e);
		}

		// This is just a temporary symbol table 
		// used during parse of the preamble.
		GLSLExtensionSymbolTable symbolTable = new GLSLExtensionSymbolTable(e, ws.getBuiltinScope());

		
		parse(e, ws, preprocessedPreamble, symbolTable);
		return e;
	}

	private void addTypes(GLSLExtension e) {
		e.addType(Type._double);
		e.addType(Type._dvec2);
		e.addType(Type._dvec3);
		e.addType(Type._dvec4);
		e.addType(Type._dmat2);
		e.addType(Type._dmat3);
		e.addType(Type._dmat4);
		e.addType(Type._dmat2x2);
		e.addType(Type._dmat2x3);
		e.addType(Type._dmat2x4);
		e.addType(Type._dmat3x2);
		e.addType(Type._dmat3x3);
		e.addType(Type._dmat3x4);
		e.addType(Type._dmat4x2);
		e.addType(Type._dmat4x3);
		e.addType(Type._dmat4x4);
	}

	
	
}
