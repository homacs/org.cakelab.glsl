package org.cakelab.glsl.builtin.extensions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.builtin.GLSLBuiltinServices;
import org.cakelab.glsl.builtin.WorkingSet;
import org.cakelab.glsl.builtin.extensions.GLSLExtension.Key;
import org.cakelab.json.JSONException;
import org.cakelab.json.codec.JSONCodecException;

public class GLSLExtensionServices {
	static final String PROPERTIES_FILE = "properties.json";
	static final String PREAMBLE_FILE = "preamble.glsl";
	static final String KEYWORDS_FILE = "keywords.txt";
	private GLSLBuiltinServices builtinServices;
	
	// TODO: performance: think about a better way to cache extensions and builtin symbols
	//       builtins and extensions cannot be removed from cache as long as symbols still in use 
	//      (because of duplicate symbol instantiation when loading it again)
	// maybe with weak references?
	private final Map<Key, GLSLExtension> EXTENSIONS_CACHE = new HashMap<Key, GLSLExtension>(4);
	private GLSLExtensionLoader defaultLoader;


	public GLSLExtensionServices(GLSLBuiltinServices builtinServices) {
		this.builtinServices = builtinServices;
	}


	/** 
	 * An extension may be referred to by different names, but it is registered by its primary name only.
	 * This method looks up the primary name of a known extension (see {@link KnownExtensions}). 
	 * If the extension is unknown to the system, then the given name will be returned.
	 * 
	 * @param extension 
	 * @return primary name for known extension or given extension name for unknown extensions.
	 */
	public static String getPrimaryName(String extension) {
		String[] names = KnownExtensions.getNames(extension);
		if (names != null) {
			return names[0];
		}
		return extension;
	}

	
	public GLSLExtensionLoader getDefaultLoader() {
		if (defaultLoader == null) {
			this.defaultLoader = new GLSLExtensionLoader();
			this.defaultLoader.init(builtinServices, this);
		}
		return defaultLoader;
	}
	
	
	public boolean checkRequirements(String extension, GLSLVersion version, BuiltinScope builtinScope) {
		try {
			extension = getPrimaryName(extension);
			if (hasPropertiesFile(extension)) {
				Properties properties = loadProperties(extension);
				return properties.checkRequirements(version, builtinScope);
			} else {
				return true;
			}
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (Exception e) {
			throw new Error("internal error: while evaluating requirements of '" + extension + "'", e);
		}
	}

	public Resource getPreamble(String extension) throws IOException {
		return getPreambleResource(extension);
	}


	public boolean hasPreamble(String extension) {
		try {
			getPreamble(extension);
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	

	public GLSLExtension getExtension(WorkingSet ws, String extension) {
		extension = getPrimaryName(extension);
		Key key = new Key(extension, ws.getGLSLVersion(), ws.getShaderType());
		GLSLExtension e = EXTENSIONS_CACHE.get(key);
		if (e == null) {
			e = loadExtension(ws, extension);
			EXTENSIONS_CACHE.put(key, e);
		}
		return e;
	}



	private GLSLExtensionLoader getLoaderInstance(Properties properties) {
		try {
			String name = GLSLExtension.class.getPackage().getName() + '.' + properties.getName() + "." + properties.getLoader();
			
			@SuppressWarnings("unchecked")
			Class<GLSLExtensionLoader> clazz = (Class<GLSLExtensionLoader>) GLSLExtension.class.getClassLoader().loadClass(name);
			GLSLExtensionLoader instance = clazz.newInstance();
			instance.init(builtinServices, this);
			return instance;
		} catch (Exception e) {
			throw new Error("error loading extension " + properties.getName(), e);
		}
	}
	
	
	/**
	 * loads properties file for a given extension. Given extension name, must be its primary name (see {@link #getPrimaryName(String)}).
	 * @param extension primary name of the extension.
	 * @return properties for the extension.
	 * @throws JSONCodecException
	 * @throws IOException
	 * @throws JSONException
	 */
	public Properties loadProperties(String extension) throws JSONCodecException, IOException, JSONException {
		
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
	
	public GLSLExtension loadExtension(WorkingSet ws, String primaryExtensionName) {
		assert primaryExtensionName.equals(getPrimaryName(primaryExtensionName));
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
					ext = getDefaultLoader().load(ws, properties);
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

	
	
	
	public Resource getPreambleResource(String name) throws IOException {
		return getResource(name, PREAMBLE_FILE);
	}
	
	public boolean hasPropertiesFile(String extension) {
		return existsExtensionResource(extension, PROPERTIES_FILE);
	}
	
	Resource getPropertiesResource(String extension) throws IOException {
		return getResource(extension, PROPERTIES_FILE);
	}

	
	public boolean hasKeywordsFile(String extension) {
		return existsExtensionResource(extension, KEYWORDS_FILE);
	}
	
	
	
	boolean existsExtensionResource(String extension, String resourceName) {
		try {
			getResource(extension, resourceName);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	
	Resource getResource(String extension, String resourceName) throws IOException {
		String extensionDir = "extensions/" + extension;
		String propertiesFile = extensionDir + "/" + resourceName;
		return builtinServices.getBuiltinResourceManager().resolve(propertiesFile);
	}



	public boolean canLoadExtenion(String extension) {
		return KnownExtensions.containsAny(extension) || hasPropertiesFile(extension);
	}
	


}
