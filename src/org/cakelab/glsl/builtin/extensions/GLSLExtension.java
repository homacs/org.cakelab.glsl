package org.cakelab.glsl.builtin.extensions;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.builtin.BuiltinScope;
import org.cakelab.glsl.builtin.GLSLBuiltin.WorkingSet;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;
import org.cakelab.glsl.pp.ast.Macro;

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

	public static boolean checkRequirements(String extension, GLSLVersion version, BuiltinScope builtinScope) {
		try {
			extension = getPrimaryName(extension);
			Properties properties = GLSLExtensionLoader.loadProperties(extension);
			return properties.checkRequirements(version, builtinScope);
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (Exception e) {
			throw new Error("internal error: while evaluating requirements of '" + extension + "'", e);
		}
	}

	/** 
	 * An extension may be referred to by different names, but it is registered by its primary name only.
	 * This method looks up the primary name of a known extension.
	 * @param extension
	 * @return
	 */
	public static String getPrimaryName(String extension) {
		String[] names = KnownExtensions.getNames(extension);
		if (names != null) {
			return names[0];
		}
		return null;
	}

	
	// TODO: performance: think about a better way to cache extensions and builtin symbols
	//       builtins and extensions cannot be removed from cache as long as symbols still in use 
	//      (because of duplicate symbol instantiation when loading it again)
	// maybe with weak references?
	static final Map<Key, GLSLExtension> CACHE = new HashMap<Key, GLSLExtension>(4);

	
	
	public static GLSLExtension get(WorkingSet ws, String extension) {
		extension = getPrimaryName(extension);
		Key key = new Key(extension, ws.getGLSLVersion(), ws.getShaderType());
		GLSLExtension e = CACHE.get(key);
		if (e == null) {
			e = GLSLExtensionLoader.loadExtension(ws, extension);
			CACHE.put(key, e);
		}
		return e;
	}

	
	
	private final Key key;
	private Properties properties;
	private HashMap<String, Macro> macros;
	private KeywordTable tokenTable;
	
	private GLSLExtension(Key key, HashMap<String, Macro> macros) {
		super(null);
		this.key = key;
		this.macros = macros;
	}

	public GLSLExtension(Properties properties, GLSLVersion version, ShaderType type, HashMap<String, Macro> extensionMacros, KeywordTable addedKeywords) {
		this(new Key(properties.getName(), version, type), extensionMacros);
		this.properties = properties;
		this.tokenTable = addedKeywords;
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

	public KeywordTable getKeywordTable() {
		return tokenTable;
	}

	public void setKeywordTable(KeywordTable addedKeywords) {
		this.tokenTable = addedKeywords;
	}


	
}
