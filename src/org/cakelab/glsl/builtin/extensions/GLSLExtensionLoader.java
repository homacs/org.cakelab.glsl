package org.cakelab.glsl.builtin.extensions;

import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.builtin.BuiltinLoaderHelper;
import org.cakelab.glsl.builtin.BuiltinResourceManager;
import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.builtin.GLSLExtensionSet;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.lang.lexer.tokens.ExtendedTokenTable;
import org.cakelab.glsl.pp.MacroMap;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.json.JSONException;
import org.cakelab.json.codec.JSONCodecException;

public abstract class GLSLExtensionLoader extends BuiltinLoaderHelper {
	static final String PROPERTIES_FILE = "properties.json";
	static final String PREAMBLE_FILE = "preamble.glsl";
	private static final String KEYWORDS_FILE = "keywords.txt";
	private static final GLSLExtension TEMPORARY_EXTENSION = new MockedExtension("__TEMPORARY_EXTENSION__YOU__SHOULD_NOT_SEE_THIS__", null, null);
	

	public abstract GLSLExtension load(WorkingSet ws, Properties properties, BuiltinResourceManager builtinResourceManager) throws IOException;
	
	

	public static GLSLExtensionLoader getLoaderInstance(Properties properties) {
		try {
			String name = GLSLExtension.class.getPackage().getName() + '.' + properties.getName() + "." + properties.getLoader();
			
			@SuppressWarnings("unchecked")
			Class<GLSLExtensionLoader> clazz = (Class<GLSLExtensionLoader>) GLSLExtension.class.getClassLoader().loadClass(name);
			return clazz.newInstance();
		} catch (Exception e) {
			throw new Error("error loading extension " + properties.getName(), e);
		}
	}
	
	

	static Properties loadProperties(String extension) throws JSONCodecException, IOException, JSONException {
		
		Resource resource = getPropertiesResource(extension);
		Properties properties =  new Properties(resource.openInputStream());

		// make sure we have at least a valid name variable.
		if (properties.getName() == null) {
			properties.setName(extension);
		}
		else if (!properties.getName().equals(extension)) 
		{
			throw new Error("internal error: extension name '" + extension + "' does not match the name '" + properties.getName() + "' given in its properties file (" + resource.getPath() + ")");
		}
		return properties;
	}
	
	static GLSLExtension loadExtension(WorkingSet ws, String extension) {
		Properties properties;
		assert extension.equals(GLSLExtension.getPrimaryName(extension));

		GLSLExtension ext;
		GLSLVersion version = ws.getGLSLVersion();
		BuiltinScope builtins = ws.getBuiltinScope();
		ShaderType shaderType = ws.getShaderType();
		
		if (hasPropertiesFile(extension)) {
			try {
				properties = loadProperties(extension);
				properties.checkRequirements(version, builtins);
				
				if (properties.getLoader() != null) {
					GLSLExtensionLoader loader = getLoaderInstance(properties);
					ext = loader.load(ws, properties, BUILTIN_RESOURCE_MANAGER);

				} else {
					ext = loadInternally(ws, properties);
				}
				
				ext.finishLoad();
				
			} catch (JSONCodecException | IOException | JSONException e) {
				throw new Error("internal error: failed to load extension '" + extension + "'", e);
			}
			
		} else {
			String[] names = KnownExtensions.getNames(extension);
			if (names == null) {
				ext = new MockedExtension(extension, shaderType, version);
			} else {
				ext = new MockedExtension(names, shaderType, version);
			}
		}
		return ext;
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
	protected static KeywordTable loadKeywordTable(String extension) throws IOException {
		if (!hasKeywordsFile(extension)) return null;
		
		Resource tokenFile = getResource(extension, KEYWORDS_FILE);
		KeywordTable tokenTable = new KeywordTable(tokenFile.openInputStream());
		
		return tokenTable;
	}
	
	public static GLSLExtension loadInternally(WorkingSet ws, Properties properties) throws IOException {
		BuiltinScope builtinScope = ws.getBuiltinScope();
		GLSLVersion version = ws.getGLSLVersion();
		ShaderType shaderType = ws.getShaderType();
		
		GLSLExtension e = null;
		
		if (properties.hasPreamble()) {
		
			Resource resource = properties.getPreamble();
		
		
			GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(BUILTIN_RESOURCE_MANAGER);
	
			HashMap<String, Macro> extensionMacros = preprocess(ws, resource, buffer);
	
			ExtendedTokenTable tokenTable = ws.getTokenTable();
			KeywordTable extendedKeywords = loadKeywordTable(properties.getName());
			e = new GLSLExtension(properties, version, shaderType, extensionMacros, extendedKeywords);
			GLSLExtensionSymbolTable symbolTable = new GLSLExtensionSymbolTable(e, builtinScope);
	
			parse(buffer, tokenTable, symbolTable);
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

	
	protected static HashMap<String, Macro> preprocess(WorkingSet ws, Resource resource,
			GLSL_ANTLR_PPOutputBuffer buffer) {
		Preprocessor pp = setupPreprocessing(resource, ws.getShaderType(), buffer);
		pp.getState().setWorkingSet(ws);
		pp.getState().setForcedVersion(true);
		pp.process(true);
		
		MacroMap macroMap = pp.getState().getMacros();
		macroMap.undefine(ws.getShaderType().name());

		return macroMap.getUserLevelMacros();
	}



	protected static void parse(GLSLExtension e, WorkingSet ws, GLSL_ANTLR_PPOutputBuffer preprocessedPreamble,
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
				parse(preprocessedPreamble, ws.getTokenTable(), symbolTable);
			} finally {
				extensionSet.disable(TEMPORARY_EXTENSION);
				TEMPORARY_EXTENSION.setKeywordTable(null);
			}
		} else {
			parse(preprocessedPreamble, ws.getTokenTable(), symbolTable);
		}
	}


	
	static Resource getPreambleResource(String name) throws IOException {
		return getResource(name, PREAMBLE_FILE);
	}
	
	public static boolean hasPropertiesFile(String extension) {
		return existsExtensionResource(extension, PROPERTIES_FILE);
	}
	
	static Resource getPropertiesResource(String extension) throws IOException {
		return getResource(extension, PROPERTIES_FILE);
	}

	
	public static boolean hasKeywordsFile(String extension) {
		return existsExtensionResource(extension, KEYWORDS_FILE);
	}
	
	
	
	static boolean existsExtensionResource(String extension, String resourceName) {
		try {
			getResource(extension, resourceName);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	
	static Resource getResource(String extension, String resourceName) throws IOException {
		String extensionDir = BuiltinLoaderHelper.getExtensionDirectory(extension);
		String propertiesFile = extensionDir + "/" + resourceName;
		return	GLSLBuiltin.BUILTIN_RESOURCE_MANAGER.resolve(propertiesFile);
	}



	public static boolean canLoadExtenion(String extension) {
		return KnownExtensions.containsAny(extension) || hasPropertiesFile(extension);
	}
	


}
