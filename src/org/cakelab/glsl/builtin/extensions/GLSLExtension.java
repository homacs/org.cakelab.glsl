package org.cakelab.glsl.builtin.extensions;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;
import org.cakelab.glsl.pp.PPState;
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


	// in case an extension does not define any macros we use this empty map
	private static final HashMap<String, Macro> EMPTY_MACROS = new HashMap<String, Macro>();

	
	
	
	private final Key key;
	private Properties properties;
	private HashMap<String, Macro> macros;
	private KeywordTable tokenTable;
	protected boolean enabled = false;
	
	private GLSLExtension(Key key, HashMap<String, Macro> macros) {
		super(null);
		this.key = key;
		if (macros != null && macros.size() > 0)	this.macros = macros;
		else this.macros = EMPTY_MACROS;
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
	
	
	public void enable(PPState ws) {
		this.enabled = true;
	}
	
	public void disable(PPState ws) {
		this.enabled = false;
	}
	
	public boolean isEnabled() {
		return enabled;
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

	public void setParent(IScope scope) {
		this.parent = scope;
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
