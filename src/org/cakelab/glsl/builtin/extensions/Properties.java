package org.cakelab.glsl.builtin.extensions;

import java.io.IOException;
import java.io.InputStream;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.GLSLVersion.Profile;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.builtin.GLSLExtensionSet;
import org.cakelab.json.JSONArray;
import org.cakelab.json.JSONException;
import org.cakelab.json.JSONObject;
import org.cakelab.json.codec.JSONCodec;
import org.cakelab.json.codec.JSONCodecException;
import org.cakelab.json.codec.Parser;

public class Properties {
	private static JSONCodec decoder = new JSONCodec();

	interface Dependency {

		boolean check(GLSLVersion version, GLSLExtensionSet extensions);
	}
	
	private static class ExtensionDependency implements Dependency {
		public final String name;
		public ExtensionDependency(String name) {
			this.name = name;
		}
		@Override
		public boolean check(GLSLVersion version, GLSLExtensionSet extensions) {
			return extensions.containsExtension(this.name);
		}
	}
	
	private static class ProfileDependency implements Dependency {

		final VersionDependency versionDependency;
		private Profile profile;

		public ProfileDependency(Profile profile, VersionDependency versionDependency) {
			this.profile = profile;
			this.versionDependency = versionDependency;
		}

		@Override
		public boolean check(GLSLVersion version, GLSLExtensionSet extensions) {
			switch (profile) {
			case compatibility:
				if (version.profile != Profile.compatibility) return false;
				break;
			case core:
				if (version.profile != Profile.core && version.profile != Profile.compatibility) return false;
				break;
			case es:
				if (version.profile != Profile.es) return false;
				break;
			default:
				assert(false) : "unhandled new profile";
			}
			return versionDependency.check(version.number);
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
			return true;
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
	
	private String name;
	private String[] alternatives;
	private String loader;
	
	// transient prevents the decoder from trying to decode
	private transient Dependency dependencies;
	private String[] conflicts;
	private boolean mocked = false;
	
	protected Properties(String name) {
		this.name = name;
		this.mocked = true;
	}

	protected Properties(String name, String[] alternatives) {
		this(name);
		this.alternatives = alternatives;
	}
	
	public Properties(InputStream inputStream) throws JSONCodecException, IOException, JSONException {
		Parser parser = new Parser(inputStream);
		JSONObject json = parser.parse();
		
		decoder.decodeObject(json, this);

		Object something = json.get("dependencies");
		if (something == null) return;
		
		dependencies = decodeDependency(something);
	}

	public boolean isMockedExtension() {
		return mocked;
	}
	
	public boolean checkRequirements(GLSLVersion version, BuiltinScope builtinScope) throws IllegalArgumentException {
		if (dependencies != null) {
			if (!dependencies.check(version, builtinScope.getExtensions())) {
				throw new IllegalArgumentException("extension '" + this.name + "' cannot be enabled in this configuration. Check its dependencies first.");
			}
		}
		if (conflicts != null) {
			if (!checkConflicts(builtinScope.getExtensions())) {
				throw new IllegalArgumentException("extension '" + this.name + "' does conflict with some of the loaded extensions.");
			}
		}
		return true;
	}

	private boolean checkConflicts(GLSLExtensionSet extensions) {
		for (String extension : conflicts) {
			if (extensions.containsExtension(extension)) {
				throw new IllegalArgumentException("extension '" + this.name + "' conflicts with enabled extension '" + extension + "'");
			}
		}
		return true;
	}

	private Dependency decodeDependency(Object something) throws JSONException {
		if (something == null) return null;
		Dependency dependency = null;
		
		if (something instanceof String) {
			String name = (String) something;
			String versionSpecifier = null;
			int colon = name.indexOf(':');
			if (colon > 0) {
				name = ((String)something).substring(0, colon).trim();
				versionSpecifier = ((String)something).substring(colon+1);
			}
			Profile profile = Profile.get(name);
			if (profile != null) {
				dependency = new ProfileDependency(profile, VersionDependency.parse(versionSpecifier));
			} else {
				dependency = new ExtensionDependency(name);
			}
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
		return GLSLExtensionServices.getPreambleResource(name);
	}


	public boolean hasPreamble() {
		try {
			getPreamble();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getAlternativeNames() {
		return alternatives;
	}

	public void setAlternativeNames(String[] alternativeNames) {
		this.alternatives = alternativeNames;
	}

	public String getLoader() {
		return loader;
	}

	public void setLoader(String loader) {
		this.loader = loader;
	}


}
