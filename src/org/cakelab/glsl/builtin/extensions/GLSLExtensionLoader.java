package org.cakelab.glsl.builtin.extensions;

import java.io.IOException;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.BuiltinLoaderHelper;
import org.cakelab.glsl.builtin.BuiltinResourceManager;
import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.builtin.GLSLTokenTable;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.json.JSONException;
import org.cakelab.json.codec.JSONCodecException;

public abstract class GLSLExtensionLoader extends BuiltinLoaderHelper {
	static final String PROPERTIES_FILE = "properties.json";
	static final String PREAMBLE_FILE = "preamble.glsl";
	

	public abstract GLSLExtension load(BuiltinScope builtinScope, Properties properties, GLSLVersion version, ShaderType shaderType,
			BuiltinResourceManager builtinResourceManager);
	
	

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
	
	static GLSLExtension loadExtension(BuiltinScope builtins, String extension, GLSLVersion version, ShaderType shaderType) {
		Properties properties;
		assert extension.equals(GLSLExtension.getPrimaryName(extension));

		GLSLExtension ext;
		
		if (GLSLExtension.hasPropertiesFile(extension)) {
			try {
				properties = loadProperties(extension);
				properties.checkRequirements(version, builtins);
				
				if (properties.getLoader() != null) {
					GLSLExtensionLoader loader = getLoaderInstance(properties);
					ext = loader.load(builtins, properties, version, shaderType, BUILTIN_RESOURCE_MANAGER);

				} else {
					ext = loadInternally(builtins, properties, version, shaderType);
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

	public static GLSLExtension loadInternally(BuiltinScope builtinScope, Properties properties, GLSLVersion version, ShaderType shaderType) throws IOException {
		
		// resource directory of the extension
		GLSLExtension e = null;
		
		if (properties.hasPreamble()) {
		
			Resource resource = properties.getPreamble();
		
		
			GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(BUILTIN_RESOURCE_MANAGER);
	
			HashMap<String, Macro> extensionMacros = preprocess(resource, version, shaderType, buffer);
	
			GLSLTokenTable tokenTable = GLSLTokenTable.get(version);
	
			e = new GLSLExtension(properties, version, shaderType, extensionMacros);
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

	static Resource getPreambleResource(String name) throws IOException {
		return getResource(name, PREAMBLE_FILE);
	}

	static Resource getPropertiesResource(String name) throws IOException {
		return getResource(name, PROPERTIES_FILE);
	}

	
	static Resource getResource(String extension, String resourceName) throws IOException {
		String extensionDir = BuiltinLoaderHelper.getExtensionDirectory(extension);
		String propertiesFile = extensionDir + "/" + resourceName;
		return	GLSLBuiltin.BUILTIN_RESOURCE_MANAGER.resolve(propertiesFile);
	}
	


}
