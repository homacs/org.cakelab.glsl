package org.cakelab.glsl.builtin;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.builtin.GLSLBuiltin.ShaderType;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.util.ObjectCache;

public class GLSLExtension extends ScopeImpl {
	// TODO: when using cached builtins, extensions may reference 
	// for example global variables from different instances of the same builtins or extensions
	// TODO: extensions may depend on other extensions
	
	
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
		GLSLExtension ext = GLSLBuiltin.loadExtension(builtins, extension, version, type);
		return ext;
	}

	static void put(GLSLExtension extension) {
		CACHE.put(extension.key, extension);
	}

	
	private final Key key;
	private HashMap<String, Macro> macros;
	
	GLSLExtension(Key key, HashMap<String, Macro> macros) {
		super(null);
		this.key = key;
		this.macros = macros;
	}

	public GLSLExtension(String extension, GLSLVersion version, ShaderType type, HashMap<String, Macro> extensionMacros) {
		this(new Key(extension, version, type), extensionMacros);
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

	public void setParent(IScope builtinScope) {
		this.parent = builtinScope;
	}

	public void finishLoad() {
		setParent(null);
	}
	
	
	
}
