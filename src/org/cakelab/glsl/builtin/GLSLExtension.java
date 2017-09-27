package org.cakelab.glsl.builtin;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.builtin.GLSLBuiltin.ShaderType;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.json.JSONArray;
import org.cakelab.json.JSONException;
import org.cakelab.json.JSONObject;
import org.cakelab.json.codec.JSONCodec;
import org.cakelab.json.codec.JSONCodecException;
import org.cakelab.json.codec.Parser;

public class GLSLExtension extends ScopeImpl {


	public static class Properties {
		private static JSONCodec decoder = new JSONCodec();

		interface Dependency {

			boolean check(GLSLVersion version, GLSLExtensionSet extensions);}
		
		private static class Single implements Dependency {
			public final String extension;
			public Single(String extension) {
				this.extension = extension;
			}
			@Override
			public boolean check(GLSLVersion version, GLSLExtensionSet extensions) {
				return extensions.containsExtension(this.extension);
			}
		}
		private static class All implements Dependency {
			public final Dependency[] all;
			public All(Dependency[] set) {
				this.all = set;
			}
			@Override
			public boolean check(GLSLVersion version, GLSLExtensionSet extensions) {
				for (Dependency d : all) {
					if (!d.check(version, extensions)) return false;
				}
				return false;
			}
		}
		
		private static class Any implements Dependency {
			public final Dependency[] any;
			public Any(Dependency[] set) {
				this.any = set;
			}
			@Override
			public boolean check(GLSLVersion version, GLSLExtensionSet extensions) {
				for (Dependency d : any) {
					if (d.check(version, extensions)) return true;
				}
				return false;
			}
		}
		
		public static class Versions {
			public final String core = null;
			public final String es = null;
			public final String compatibility = null;
			public boolean check(GLSLVersion version) {
				switch(version.profile) {
				case compatibility:
					return checkVersion(compatibility, version.number);
				case core:
					return checkVersion(core, version.number);
				case es:
					return checkVersion(es, version.number);
				default:
					throw new Error("internal error: unknown profile");
				}
			}
			private boolean checkVersion(String versionString, int number) {
				// TODO deep version string check for GLSL extension dependencies
				if (versionString == null) return false;
				else return true;
			}
		}
		
		public static class Requirements {
			private Versions versions;
			private String[] conflicts;
			// transient prevents the decoder from trying to decode
			private transient Dependency dependencies;
			public boolean checkConflicts(GLSLExtensionSet extensions) {
				for (String extension : conflicts) {
					if (extensions.containsExtension(extension)) {
						return false;
					}
				}
				return true;
			}
		}
		
		public String name;
		public long number;
		public long since;
		public Requirements requirements;
		
		public Properties(InputStream inputStream) throws JSONCodecException, IOException, JSONException {
			Parser parser = new Parser(inputStream);
			JSONObject json = parser.parse();
			
			decoder.decodeObject(json, this);

			json = (JSONObject) json.get("requirements");
			if (json == null) return;
			
			requirements.dependencies = decodeDependency(json.get("dependencies"));
		}

		
		public boolean checkRequirements(GLSLVersion version, BuiltinScope builtinScope) throws IllegalArgumentException {
			boolean success = false;
			if (requirements == null) return true;
			
			if (requirements.versions != null) {
				if (!requirements.versions.check(version)) {
					throw new IllegalArgumentException("version " + version.number + " or profile '" + version.profile + "' not supported by extension '" + this.name + "'");
				}
			}
			if (success && requirements.dependencies != null) {
				if (!requirements.dependencies.check(version, builtinScope.extensions)) {
					throw new IllegalArgumentException("extension '" + this.name + "' has dependencies on other extensions which have not been loaded.");
				}
			}
			if (success && requirements.conflicts != null) {
				if (!requirements.checkConflicts(builtinScope.extensions)) {
					throw new IllegalArgumentException("extension '" + this.name + "' does conflict with some of the loaded extensions.");
				}
			}
			return true;
		}

		
		private Dependency decodeDependency(Object something) throws JSONException {
			if (something == null) return null;
			Dependency dependency = null;
			
			if (something instanceof String) {
				dependency = new Single((String) something);
			} else if (something instanceof JSONObject) {
				JSONObject json = (JSONObject)something;
				if (json.containsKey("all")) {
					JSONArray array = (JSONArray) json.get("all");
					Dependency[] set = decodeDependencyArray(array);
					dependency = new All(set);
				} 
				if (json.containsKey("any")) {
					if (dependency != null) throw new JSONException("'all' and 'any' are mutually exclusive (you can use only one of them or a single extension name)");
					JSONArray array = (JSONArray) json.get("any");
					Dependency[] set = decodeDependencyArray(array);
					dependency = new Any(set);
				}
			} 
			
			if (dependency == null) {
				throw new JSONException("A dependency is either an extension name or another json object containing an array variable 'all' or 'any' with a set of extension names");
			}
			return dependency;
		}

		private Dependency[] decodeDependencyArray(JSONArray array) throws JSONException {
			Dependency[] dependencies = new Dependency[array.size()];
			for (int i = 0; i < dependencies.length; i++) {
				dependencies[i] = decodeDependency(array.get(i));
			}
			return dependencies;
		}


		public Resource getPreamble() throws IOException {
			return GLSLExtension.getPreamble(name);
		}
		
	}

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
		Properties properties =  new GLSLExtension.Properties(resource.openInputStream());

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
