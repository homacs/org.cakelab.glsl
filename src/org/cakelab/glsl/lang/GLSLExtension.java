package org.cakelab.glsl.lang;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.lang.GLSLBuiltin.ShaderType;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.util.ObjectCache;

public class GLSLExtension extends Scope {
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

	static final ObjectCache<Key, GLSLExtension> CACHE = new ObjectCache<Key, GLSLExtension>(4);

	public static GLSLExtension get(String extension, GLSLVersion version, ShaderType type) {
		Key key = new Key(extension, version, type);
		GLSLExtension e = CACHE.get(key);
		if (e == null) {
			e = loadExtension(extension, version, type);
			CACHE.put(key, e);
		}
		return e;
	}

	private static GLSLExtension loadExtension(String extension, GLSLVersion version, ShaderType type) {
		return GLSLBuiltin.loadExtension(extension, version, type);
	}

	static void put(GLSLExtension extension) {
		CACHE.put(extension.key, extension);
	}

	
	private final Key key;
	private HashMap<String, Macro> macros;
	
	GLSLExtension(Key key, HashMap<String, Macro> macros, Scope extensionSymbols) {
		super(null);
		this.key = key;
		this.macros = macros;
		this.flatcopy(extensionSymbols);
	}

	public GLSLExtension(String extension, GLSLVersion version, ShaderType type, HashMap<String, Macro> extensionMacros,
			Scope extensionSymbols) {
		this(new Key(extension, version, type), extensionMacros, extensionSymbols);
	}

	public String getName() {
		return key.name;
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
	
	
	
}
