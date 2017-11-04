package org.cakelab.glsl.builtin.extensions;

import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.antlr.PPOutputBuffer;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.GLSLBuiltinServices;
import org.cakelab.glsl.builtin.GLSLExtensionSet;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.lexer.tokens.Vocabulary;
import org.cakelab.glsl.pp.MacroMap;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;

public class GLSLExtensionLoader {
	
	private static final GLSLExtension TEMPORARY_EXTENSION = new MockedExtension("__TEMPORARY_EXTENSION__USED_WHEN_EXTENSION_INTRODUCES_NEW_KEYWORDS__", null, null);
	protected final GLSLBuiltinServices services;
	protected Vocabulary vocabulary;

	
	public GLSLExtensionLoader() {
		services = GLSLCompiler.getActiveCompilerImpl().getBuiltinServices();
		vocabulary = services.getVocabulary();

	}
	
	
	
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
	 * <p>
	 * You can override this method to fully control the process yourself 
	 * or use some of the hooks:
	 * </p>
	 * <ul>
	 * <li>{@link #preprocess(WorkingSet, Resource, PPOutputBuffer)} </li>
	 * <li>{@link #parseExtensionPreamble(GLSLExtension, WorkingSet, PPOutputBuffer, SymbolTable)} </li>
	 * </ul>
	 * <p>Those methods provide further hooks (refer to their documentation).
	 * </p>
	 * 
	 * @param ws working set with builtins and other extensions
	 * @param properties properties the extension to be loaded
	 * @return extension instance
	 * @throws IOException
	 */
	public GLSLExtension load(WorkingSet ws, Properties properties) throws IOException {
		GLSLVersion version = ws.getGLSLVersion();
		ShaderType shaderType = ws.getShaderType();
		
		GLSLExtension e = null;
		
		if (properties.isMockedExtension()) {
			String[] names = KnownExtensions.getNames(properties.getName());
			if (names == null) {
				// unknown extension
				e = new MockedExtension(properties.getName(), shaderType, version);
			} else {
				// known extension
				e = new MockedExtension(names, shaderType, version);
			}
		} else {
			boolean hasPreamble = properties.hasPreamble();
			
			PPOutputSink buffer = null;
			HashMap<String, Macro> extensionMacros = null;
			
			if (hasPreamble) {
				Resource resource = properties.getPreamble();
			
				buffer = services.createPreprocessorSink(GLSLBuiltinServices.BUILTIN_RESOURCE_MANAGER);
		
				extensionMacros = preprocess(ws, resource, buffer);
			}
			
			KeywordTable extendedKeywords = loadKeywordTable(properties.getName());
			e = createExtension(properties, version, shaderType, extensionMacros, extendedKeywords);

			if (hasPreamble) {
				parseExtensionPreamble(e, ws, buffer);
			}
		}
		
		return e;
	}

	
	
	/**
	 * This method creates a new instance of GLSLExtension with the given data loaded so far.
	 * <p>
	 * This method is called after preamble preprocessing and before parsing 
	 * of the preprocessor output.
	 * </p>
	 * <p>
	 * You can use this hook to add built-in types of the extension like this:
	 * </p>
	 * <pre>
	 * 	protected GLSLExtension createExtension(Properties properties, ...) {
	 *		GLSLExtension e = super.createExtension(properties, ...);
	 *		e.addType(my_uint_128_t);
	 *		return e;
	 *	}
	 * </pre>
	 * 
	 * @param properties Properties of the extension
	 * @param version    GLSLVersion of the current working set.
	 * @param shaderType Type of shader where this extension was loaded.
	 * @param extensionMacros  Macros of the extension received from the preprocessor output
	 * @param extendedKeywords Keywords added by this extension.
	 * @return
	 */
	protected GLSLExtension createExtension(Properties properties, GLSLVersion version, ShaderType shaderType,
			HashMap<String, Macro> extensionMacros, KeywordTable extendedKeywords) {
		GLSLExtension e = new GLSLExtension(properties, version, shaderType, extensionMacros, extendedKeywords);
		if (extendedKeywords != null) addBuiltinTypesForKeywords(e, extendedKeywords);
		return e;
	}






	/** 
	 * 
	 * This method loads keywords from the keywords.txt file. 
	 * <p>
	 * The keywords.txt file can only contain keywords, known to the GLSLParser. 
	 * Known to the parser are all keywords and builtin types, which are available 
	 * to any of the GLSL versions.
	 * </p>
	 * <p>
	 * You can override this method to provide a static {@link KeywordTable}.
	 * </p>
	 * 
	 * @param extension
	 * @return
	 * @throws IOException
	 */
	protected KeywordTable loadKeywordTable(String extension) throws IOException {
		if (!GLSLExtensionServices.hasKeywordsFile(extension)) return null;
		
		Resource tokenFile = GLSLExtensionServices.getResource(extension, GLSLExtensionServices.KEYWORDS_FILE);
		KeywordTable tokenTable = KeywordTable.create(vocabulary, tokenFile.openInputStream());
		
		return tokenTable;
	}
	
	/**
	 * This method adds all known builtin types (see {@link Type.BUILTIN_TYPES}) which 
	 * are listed as keywords in the given keyword table to the symbol table of the extension 'e' .
	 * <p>
	 * This method is called from {@link #createExtension(Properties, GLSLVersion, ShaderType, HashMap, KeywordTable)} 
	 * if the keyword table is not null. Override it to control whether the types will be added or not.
	 * </p>
	 * 
	 * 
	 * @param e
	 * @param addedKeywords
	 */
	protected void addBuiltinTypesForKeywords(GLSLExtension e, KeywordTable addedKeywords) {
		for (Type t : Type.BUILTIN_TYPES) {
			if (addedKeywords.isLanguageKeyword(t.getName())) {
				e.addType(t);
			}
		}
	}


	/**
	 * Preprocesses the preamble.glsl file.
	 * <p>
	 * This method calls the following hooks:
	 * </p>
	 * <ul>
	 * <li>{@link #setupPreprocessor(WorkingSet, Resource, PPOutputBuffer)}</li>
	 * <li>{@link #finishedPreprocessing(WorkingSet, Preprocessor)}</li>
	 * </ul>
	 * 
	 * @param ws
	 * @param resource
	 * @param buffer
	 * @return
	 */
	protected HashMap<String, Macro> preprocess(WorkingSet ws, Resource resource,
			PPOutputSink buffer) {
		Preprocessor pp = setupPreprocessor(ws, resource, buffer);

		// running preprocessor
		pp.process(true);

		finishedPreprocessing(ws, pp);
		
		MacroMap macroMap = pp.getState().getMacros();
		return macroMap.getUserLevelMacros();
	}


	/**
	 * Here you can hook in to remove defines you have added for the preprocessor run.
	 * <p>
	 * Use the following procedure:
	 * </p>
	 * <pre>
	 *	protected void finishedPreprocessing(WorkingSet ws, Preprocessor pp) {
	 *		pp.removeDefine(HAVE_UINT64.getName());
	 *		pp.removeDefine(HAVE_UVEC.getName());
	 *		super.finishedPreprocessing(ws, pp);
	 *	}
	 * </pre>
	 * @param ws
	 * @param pp
	 */
	protected void finishedPreprocessing(WorkingSet ws, Preprocessor pp) {
		pp.removeDefine(ws.getShaderType().name());
	}




	/**
	 * Here you can hook in to add your own defines for the preprocessor run.
	 * <p>
	 * Use the following procedure:
	 * </p>
	 * <pre>
	 *	protected Preprocessor setupPreprocessor(WorkingSet ws, Resource resource, GLSL_ANTLR_PPOutputBuffer buffer) {
	 *		Preprocessor pp = super.setupPreprocessor(ws, resource, buffer);
	 *		
	 *		if (ws.haveBuiltinType("uint64_t")) {
	 *			pp.addDefine(HAVE_UINT64);
	 *		}
	 *		if (ws.haveBuiltinType("uvec2")) {
	 *			pp.addDefine(HAVE_UVEC);
	 *		}
	 *		
	 *		return pp;
	 *	}
	 *
	 * @see #finishedPreprocessing(WorkingSet, Preprocessor)
	 * @see Preprocessor#addDefine(String)
	 * 
	 * @param ws
	 * @param resource
	 * @param buffer
	 * @return
	 */
	protected Preprocessor setupPreprocessor(WorkingSet ws, Resource resource, PPOutputSink buffer) {
		Preprocessor pp = services.setupPreprocessing(resource, ws.getShaderType(), buffer);
		pp.getState().setWorkingSet(ws);
		pp.getState().setForcedVersion(true);
		return pp;
	}



	/**
	 * This method runs the GLSLParser and gathers all symbols defined in the given output of the preprocessor.
	 * 
	 * @param e
	 * @param ws
	 * @param preprocessedPreamble
	 * @param symbolTable
	 */
	protected void parseExtensionPreamble(GLSLExtension e, WorkingSet ws, PPOutputSink preprocessedPreamble) {
		
		e.setParent(ws.getBuiltinScope());
		SymbolTable symbolTable = new SymbolTable(ws.getBuiltinScope(), e);

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
			extensionSet.addExtension(TEMPORARY_EXTENSION);
			try {
				services.parseBuiltinPreamble(preprocessedPreamble, ws.getTokenTable(), symbolTable);
			} finally {
				extensionSet.removeExtension(TEMPORARY_EXTENSION);
				TEMPORARY_EXTENSION.setKeywordTable(null);
			}
		} else {
			services.parseBuiltinPreamble(preprocessedPreamble, ws.getTokenTable(), symbolTable);
		}
	}



}
