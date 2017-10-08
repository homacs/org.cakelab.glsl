package org.cakelab.glsl.builtin;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.builtin.GLSLBuiltin.ShaderType;
import org.cakelab.glsl.builtin.extensions.KnownExtensions;
import org.cakelab.glsl.builtin.extensions.Properties;
import org.cakelab.glsl.builtin.extensions.MockedExtension;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.json.JSONException;
import org.cakelab.json.codec.JSONCodecException;

public class GLSLExtension extends ScopeImpl {


	/**
	 * Hash key attributes for a loaded extension. 
	 * 
	 * @author homac
	 */
	public static class Key {
		GLSLVersion version;
		String name;
		ShaderType shaderType;
		public Key(String name, GLSLVersion version, ShaderType shaderType) {
			this.name = name;
			this.version = version;
			this.shaderType = shaderType;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((shaderType == null) ? 0 : shaderType.hashCode());
			result = prime * result + ((version == null) ? 0 : version.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Key other = (Key) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (shaderType != other.shaderType)
				return false;
			if (version == null) {
				if (other.version != null)
					return false;
			} else if (!version.equals(other.version))
				return false;
			return true;
		}
	}

	private static final String PROPERTIES_FILE = "properties.json";
	private static final String PREAMBLE_FILE = "preamble.glsl";
	
	
	public static boolean isRegistered(String extension) {
		try {
			getResource(extension, PROPERTIES_FILE);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	
	public static boolean checkRequirements(String extension, GLSLVersion version, BuiltinScope builtinScope) {
		try {
			Properties properties = loadProperties(extension);
			return properties.checkRequirements(version, builtinScope);
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (Exception e) {
			throw new Error("internal error: while evaluating requirements of '" + extension + "'", e);
		}
	}

	static Properties loadProperties(String extension) throws JSONCodecException, IOException, JSONException {
		Resource resource = getResource(extension, PROPERTIES_FILE);
		Properties properties =  new Properties(resource.openInputStream());

		// make sure we have at least a valid name variable.
		if (properties.name == null) {
			properties.name = extension;
		}
		else if (!properties.name.equals(extension)) 
		{
			throw new Error("internal error: extension name '" + extension + "' does not match the name '" + properties.name + "' given in its properties file (" + PROPERTIES_FILE + ")");
		}
		return properties;
	}
	
	private static Resource getResource(String extension, String resourceName) throws IOException {
		String extensionDir = BuiltinResources.getExtensionDirectory(extension);
		String propertiesFile = extensionDir + "/" + resourceName;
		return	GLSLBuiltin.BUILTIN_RESOURCE_MANAGER.resolve(propertiesFile);
	}
	
	
	
	// TODO: performance: think about a better way to cache extensions and builtin symbols
	//       builtins and extensions cannot be removed from cache as long as symbols still in use 
	//      (because of duplicate symbol instantiation when loading it again)
	// maybe with weak references?
	static final Map<Key, GLSLExtension> CACHE = new HashMap<Key, GLSLExtension>(4);

	public static GLSLExtension get(BuiltinScope builtins, String extension, GLSLVersion version, ShaderType type) {
		Key key = new Key(extension, version, type);
		GLSLExtension e = CACHE.get(key);
		if (e == null) {
			e = loadExtension(builtins, extension, version, type);
			CACHE.put(key, e);
		}
		return e;
	}

	
	private static GLSLExtension loadExtension(BuiltinScope builtins, String extension, GLSLVersion version, ShaderType type) {
		Properties properties;
		try {
			properties = loadProperties(extension);
		} catch (JSONCodecException | IOException | JSONException e) {
			if (KnownExtensions.containsAny(extension)) {
				return new MockedExtension(extension, version);
			}
			throw new Error("internal error: cannot load properties of extension '" + extension + "'", e);
		}
		GLSLExtension ext = GLSLBuiltin.loadExtension(builtins, properties, version, type);
		return ext;
	}

	static void put(GLSLExtension extension) {
		CACHE.put(extension.key, extension);
	}

	
	private final Key key;
	private Properties properties;
	private HashMap<String, Macro> macros;
	
	private GLSLExtension(Key key, HashMap<String, Macro> macros) {
		super(null);
		this.key = key;
		this.macros = macros;
	}

	public GLSLExtension(Properties properties, GLSLVersion version, ShaderType type, HashMap<String, Macro> extensionMacros) {
		this(new Key(properties.name, version, type), extensionMacros);
		this.properties = properties;
	}

	public String getName() {
		return key.name;
	}

	public Properties getProperties() {
		return properties;
	}
	
	public Macro getMacro(String name) {
		return macros.get(name);
	}

	public Collection<? extends Macro> getMacros() {
		return macros.values();
	}

	@Override
	public void dump(PrintStream out, String indent) {
		super.dump(out, indent);
		for (Macro m : macros.values()) {
			out.println(indent + "macro: " + m.getName());
		}
	}

	void setParent(IScope builtinScope) {
		this.parent = builtinScope;
	}

	public void finishLoad() {
		setParent(null);
	}

	public static Resource getPreamble(String name) throws IOException {
		return getResource(name, PREAMBLE_FILE);
	}
	
	
	
}
