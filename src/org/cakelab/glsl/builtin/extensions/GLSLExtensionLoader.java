package org.cakelab.glsl.builtin.extensions;

import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.GLSLExtensionSet;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.pp.MacroMap;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;

public class GLSLExtensionLoader {
	
	protected Properties properties;

	private static final GLSLExtension TEMPORARY_EXTENSION = new MockedExtension("__TEMPORARY_EXTENSION__USED_WHEN_EXTENSION_INTRODUCES_NEW_KEYWORDS__", null, null);

	/**
	 * Loads the extension identified with the given properties in standard way,
	 * based on the given working set.
	 * 
	 * Processes:
	 * <ul>
	 * <li>keywords.txt</li>
	 * <li>preamble.glsl</li>
	 * </ul>
	 * 
	 * @param ws working set with builtins and other extensions
	 * @param properties properties the extension to be loaded
	 * @return extension instance
	 * @throws IOException
	 */
	public GLSLExtension load(WorkingSet ws, Properties properties) throws IOException {
		BuiltinScope builtinScope = ws.getBuiltinScope();
		GLSLVersion version = ws.getGLSLVersion();
		ShaderType shaderType = ws.getShaderType();
		
		GLSLExtension e = null;
		
		if (properties.hasPreamble()) {
		
			Resource resource = properties.getPreamble();
		
			GLSL_ANTLR_PPOutputBuffer buffer = createPPOutputBuffer();
	
			HashMap<String, Macro> extensionMacros = preprocess(ws, resource, buffer);
	
			KeywordTable extendedKeywords = loadKeywordTable(properties.getName());
			e = new GLSLExtension(properties, version, shaderType, extensionMacros, extendedKeywords);
			GLSLExtensionSymbolTable symbolTable = new GLSLExtensionSymbolTable(e, builtinScope);
			
			parseExtensionPreamble(e, ws, buffer, symbolTable);
		} else {
			String[] names = KnownExtensions.getNames(properties.getName());
			if (names == null) {
				// unknown extension
				e = new MockedExtension(properties.getName(), shaderType, version);
			} else {
				// known extension
				e = new MockedExtension(names, shaderType, version);
			}
		}
		
		return e;
	}

	
	

	protected final GLSL_ANTLR_PPOutputBuffer createPPOutputBuffer() {
		return new GLSL_ANTLR_PPOutputBuffer(GLSLExtensionLoading.BUILTIN_RESOURCE_MANAGER);
	}




	/** 
	 * This method loads the keywords.txt file. The keywords.txt file can 
	 * only contain keywords, known to the GLSLParser. Known to the parser are
	 * all keywords and builtin types, which are available to any of the GLSL 
	 * versions.
	 * 
	 * @param extension
	 * @return
	 * @throws IOException
	 */
	protected KeywordTable loadKeywordTable(String extension) throws IOException {
		if (!GLSLExtensionLoading.hasKeywordsFile(extension)) return null;
		
		Resource tokenFile = GLSLExtensionLoading.getResource(extension, GLSLExtensionLoading.KEYWORDS_FILE);
		KeywordTable tokenTable = new KeywordTable(tokenFile.openInputStream());
		
		return tokenTable;
	}
	
	
	protected HashMap<String, Macro> preprocess(WorkingSet ws, Resource resource,
			GLSL_ANTLR_PPOutputBuffer buffer) {
		Preprocessor pp = setupPreprocessor(ws, resource, buffer);

		// running preprocessor
		pp.process(true);

		finishedPreprocessing(ws, pp);
		
		MacroMap macroMap = pp.getState().getMacros();
		return macroMap.getUserLevelMacros();
	}



	protected void finishedPreprocessing(WorkingSet ws, Preprocessor pp) {
		pp.removeDefine(ws.getShaderType().name());
	}




	protected Preprocessor setupPreprocessor(WorkingSet ws, Resource resource, GLSL_ANTLR_PPOutputBuffer buffer) {
		Preprocessor pp = GLSLExtensionLoading.setupPreprocessing(resource, ws.getShaderType(), buffer);
		pp.getState().setWorkingSet(ws);
		pp.getState().setForcedVersion(true);
		return pp;
	}




	protected void parseExtensionPreamble(GLSLExtension e, WorkingSet ws, GLSL_ANTLR_PPOutputBuffer preprocessedPreamble,
			SymbolTable symbolTable) {
		//
		// In case the extension adds own keywords, 
		// we add them here temporary, to be able 
		// to parse its preamble. We cannot enable
		// the extension, until its preamble is parsed.
		//
		// Keywords will be available later on, only if 
		// the extension is actually enabled.
		//
		
		KeywordTable addedKeywords = e.getKeywordTable();
		if (addedKeywords != null) {
			GLSLExtensionSet extensionSet = ws.getExtensions();
			TEMPORARY_EXTENSION.setKeywordTable(e.getKeywordTable());
			extensionSet.enable(TEMPORARY_EXTENSION);
			try {
				GLSLExtensionLoading.parsePreamble(preprocessedPreamble, ws.getTokenTable(), symbolTable);
			} finally {
				extensionSet.disable(TEMPORARY_EXTENSION);
				TEMPORARY_EXTENSION.setKeywordTable(null);
			}
		} else {
			GLSLExtensionLoading.parsePreamble(preprocessedPreamble, ws.getTokenTable(), symbolTable);
		}
	}


}
