package org.cakelab.glsl.builtin.extensions.GL_ARB_shader_image_load_store;

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

		HashMap<String, Macro> extensionMacros = preprocess(ws, preambleResource, preprocessedPreamble);

		KeywordTable addedKeywords = loadKeywordTable(properties.getName());

		
		
		GLSLExtension e = new GLSLExtension(properties, glslVersion, shaderLanguage, extensionMacros, addedKeywords);
		assert (!glslVersion.profile.equals(GLSLVersion.Profile.es));
		// add built-in types
		addTypes(e, addedKeywords);

		// This is just a temporary symbol table 
		// used during parse of the preamble.
		GLSLExtensionSymbolTable symbolTable = new GLSLExtensionSymbolTable(e, ws.getBuiltinScope());

		
		parseExtensionPreamble(e, ws, preprocessedPreamble, symbolTable);
		return e;
	}

	private void addTypes(GLSLExtension e, KeywordTable addedKeywords) {
		// TODO: add builtin types for keywords in regular extension load function?
		for (Type t : Type.BUILTIN_TYPES) {
			if (addedKeywords.isLanguageKeyword(t.getName())) {
				e.addType(t);
			}
		}
	}

	
	
}
