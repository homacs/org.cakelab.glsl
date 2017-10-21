package org.cakelab.glsl.builtin.extensions;

import java.io.IOException;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.BuiltinLoaderHelper;
import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.builtin.GLSLBuiltin;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.json.JSONException;
import org.cakelab.json.codec.JSONCodecException;

public abstract class GLSLExtensionLoading extends BuiltinLoaderHelper {
	static final GLSLExtensionLoader DEFAULT_LOADER = new GLSLExtensionLoader();
	static final String PROPERTIES_FILE = "properties.json";
	static final String PREAMBLE_FILE = "preamble.glsl";
	static final String KEYWORDS_FILE = "keywords.txt";
	

	

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
	
	

	public static Properties loadProperties(String extension) throws JSONCodecException, IOException, JSONException {
		
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
	
	public static GLSLExtension loadExtension(WorkingSet ws, String primaryExtensionName) {
		assert primaryExtensionName.equals(GLSLExtension.getPrimaryName(primaryExtensionName));
		Properties properties;

		GLSLExtension ext;
		GLSLVersion version = ws.getGLSLVersion();
		BuiltinScope builtins = ws.getBuiltinScope();
		ShaderType shaderType = ws.getShaderType();
		
		if (hasPropertiesFile(primaryExtensionName)) {
			try {
				properties = loadProperties(primaryExtensionName);
				
				assert properties.checkRequirements(version, builtins) : "requirements have to be checked before enabling";
				
				if (properties.getLoader() != null) {
					GLSLExtensionLoader loader = getLoaderInstance(properties);
					ext = loader.load(ws, properties);

				} else {
					ext = DEFAULT_LOADER.load(ws, properties);
				}
				
				ext.finishLoad();
				
			} catch (JSONCodecException | IOException | JSONException e) {
				throw new Error("internal error: failed to load extension '" + primaryExtensionName + "'", e);
			}
			
		} else {
			String[] names = KnownExtensions.getNames(primaryExtensionName);
			if (names == null) {
				ext = new MockedExtension(primaryExtensionName, shaderType, version);
			} else {
				ext = new MockedExtension(names, shaderType, version);
			}
		}
		return ext;
	}

	
	
	
	public static Resource getPreambleResource(String name) throws IOException {
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
