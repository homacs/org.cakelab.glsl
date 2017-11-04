package org.cakelab.glsl.builtin;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.cakelab.glsl.GLSLCompiler;
import org.cakelab.glsl.GLSLCompilerFeatures;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ShaderType;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.builtin.extensions.GLSLExtension;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.lexer.tokens.ExtendedTokenTable;
import org.cakelab.glsl.pp.PPOutputSink;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.ast.Macro;


/**
 * The class GLSLBuiltin provides access to builtin symbols and macros.
 * <p>
 * There exists a specific set of builtin symbols for each combination of:
 * </p>
 * <ul>
 * <li>GLSL version</li>
 * <li>profile</li>
 * <li>shader type</li>
 * </ul>
 * <p>
 * A specific set of builtin symbols and macros is represented by one instance of GLSLBuiltin
 * available via {@link GLSLBuiltin#getBuiltins(GLSLVersion, ShaderType)}. Those instances are cached
 * globally and reused if the application parses multiple glsl source files. 
 * </p>
 * <p>
 * During preprocessing phase, the preprocessor will determine version and profile and retrieve
 * associated builtins in-flight.
 * </p>
 * <p>
 * The set of builtin symbols and macros actually changes during preprocessing when extensions
 * get loaded. Thus, preprocessor and the language parser use a shared {@link WorkingSet} which 
 * contains builtins and extensions.
 * </p>
 * 
 * @author homac
 *
 */
public class GLSLBuiltin {
	
	private static class Key {

		private GLSLVersion version;
		private ShaderType shaderType;

		public Key(GLSLVersion version, ShaderType type) {
			this.version = version;
			this.shaderType = type;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
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


	/**
	 * A working set provides access to data which is valid throughout preprocessing and parse
	 * of a specific glsl source file, namely:
	 * <ul>
	 * <li>GLSL version ({@link GLSLVersion})</li>
	 * <li>selected profile ({@link GLSLVersion#Profile})</li>
	 * <li>type of the shader to be processed ({@link ShaderType})</li>
	 * <li>set of builtin macros (<b><code>HashMap&lt;String, Macro&gt;</code></b>)</li>
	 * <li>set of feature macros (see {@link GLSLCompilerFeatures#getFeatureMacros()})</li>
	 * <li>set of builtin symbols ({@link BuiltinScope})</li>
	 * <li>enabled extensions ({@link GLSLExtensionSet}, via {@link BuiltinScope#extensions})</li>
	 * </ul>
	 * A working set is created by {@link GLSLBuiltin#createWorkingSet()}.
	 * @author homac
	 *
	 */
	public static class WorkingSet {
		private Key key;
		private BuiltinScope builtinScope;
		private HashMap<String, Macro> builtinMacros;
		private ExtendedTokenTable tokenTable;
		private GLSLCompilerFeatures features;
		
		private WorkingSet(Key key, GLSLCompilerFeatures features, BuiltinScope builtinScope, ExtendedTokenTable tokenTable, HashMap<String, Macro> builtinMacros) {
			super();
			this.key = key;
			this.features = features;
			this.builtinScope = builtinScope;
			this.tokenTable = tokenTable;
			this.builtinMacros = builtinMacros;
		}

		public ExtendedTokenTable getTokenTable() {
			return this.tokenTable;
		}
		
		public ShaderType getShaderType() {
			return key.shaderType;
		}
		
		public GLSLVersion getGLSLVersion() {
			return key.version;
		}
		
		public BuiltinScope getBuiltinScope() {
			return this.builtinScope;
		}

		public HashMap<String, Macro> getBuiltinMacros() {
			return this.builtinMacros;
		}

		
		public GLSLExtensionSet getExtensions() {
			return this.builtinScope.getExtensions();
		}


		public void enableExtension(PPState ppstate, String identifier) {
			GLSLExtensionSet extensions = this.builtinScope.getExtensions();
			GLSLExtension e = extensions.getExtension(identifier);
			if (e == null) {
				e = GLSLExtension.get(this, identifier);
				extensions.addExtension(e);
			}
			e.enable(ppstate);
		}

		/**
		 * Note: In terms of syntax checking, disabling extensions is basically ignored (see system specification).
		 * @param ppstate
		 * @param identifier
		 */
		public void disableExtension(PPState ppstate, String identifier) {
			GLSLExtensionSet extensions = this.builtinScope.getExtensions();
			GLSLExtension e = extensions.getExtension(identifier);
			if (e != null) {
				e.disable(ppstate);
			} else {
				// has never been enabled
			}
		}

		/**
		 * Note: In terms of syntax checking, disabling extensions is basically ignored (see system specification).
		 * @param state
		 */
		public void disableExtensionsAll(PPState state) {
			GLSLExtensionSet extensions = this.builtinScope.getExtensions();
			for (GLSLExtension e : extensions) {
				e.disable(state);
			}
		}

		public void dump(PrintStream out) {
			this.builtinScope.dump(out, "");
			for (Macro m : this.features.getFeatureMacros().values()) {
				out.println("feature: " + m.toString());
			}
			for (Macro m : this.builtinMacros.values()) {
				out.println("macro: " + m.toString());
			}
		}

		public boolean haveBuiltinType(String type) {
			return this.builtinScope.containsType(type) || this.getExtensions().containsType(type);
		}

		
	}
	
	
	/** cache for parsed preambles */
	static final Map<Key, GLSLBuiltin> BUILTIN_SYMBOLS_CACHE = new HashMap<Key, GLSLBuiltin>(4);
	
	
	private Key key;
	private HashMap<String, Macro> builtinMacros;
	private IScope builtinScope;


	GLSLBuiltin(Key key, HashMap<String, Macro> macros, GLSLTokenTable tokenTable) {
		this.key = key;
		this.builtinMacros = macros;

	}
	
	public static GLSLBuiltin getBuiltins(GLSLVersion version, ShaderType type) {
		Key key = new Key(version, type);
		GLSLBuiltin result = BUILTIN_SYMBOLS_CACHE.get(key);
		if (result == null) {
			result = loadBuiltins(key);
			BUILTIN_SYMBOLS_CACHE.put(key, result);
		}
		return result;
	}

	public GLSLVersion getVersion() {
		return key.version;
	}
	
	public ShaderType getShaderType() {
		return key.shaderType;
	}

	public WorkingSet createWorkingSet(GLSLCompilerFeatures features) {
		BuiltinScope builtinSymbols = new BuiltinScope(this.builtinScope);
		GLSLTokenTable builtinTokens = GLSLTokenTable.getTokenTable(key.version);
		ExtendedTokenTable tokenTable = new ExtendedTokenTable(builtinTokens, builtinSymbols.getExtensions());
		return new WorkingSet(key, features, builtinSymbols, tokenTable, this.builtinMacros);
	}
	
	public void dump(PrintStream out) {
		this.builtinScope.dump(out, "");
		for (Macro e : this.builtinMacros.values()) {
			out.println("macro: '" + e.getName() + "'");
		}
	}

	public HashMap<String, Macro> getBuiltinMacros() {
		return this.builtinMacros;
	}

	
	public static HashMap<String, Macro> getDefaultBuiltinMacros() {
		HashMap<String, Macro> builtinMacros = new HashMap<String, Macro>();
		addCommonBuiltinMacros(builtinMacros);
		return builtinMacros;
	}

	private static GLSLBuiltin loadBuiltins(Key key) {
		GLSLBuiltinServices services = GLSLCompiler.getActiveCompilerImpl().getBuiltinServices();
		BuiltinResourceManager resourceManager = services.getBuiltinResourceManager();
		Resource resource;
		try {
			resource = resourceManager.resolve(key.version.profile, key.version.number, "preamble.glsl");
		} catch (IOException e) {
			throw new Error("internal error: cant parse preamble. GLSLVersion parser should have avoided this case.", e);
		}
		
		PPOutputSink buffer = services.createPreprocessorSink(resourceManager);

		HashMap<String, Macro> builtinMacros = services.preprocessBuiltinPreamble(resource, key.version, key.shaderType, buffer);
		addCommonBuiltinMacros(builtinMacros);

		GLSLTokenTable tokenTable = GLSLTokenTable.getTokenTable(key.version);
		GLSLBuiltin builtin = new GLSLBuiltin(key, builtinMacros, tokenTable);
		SymbolTable builtinSymbols = createMinimumBuiltinSymbols(tokenTable);

		services.parseBuiltinPreamble(buffer, tokenTable, builtinSymbols);

		builtin.builtinScope = builtinSymbols.getTopLevelScope();
		
		return builtin;
	}
	
	

	private static void addCommonBuiltinMacros(HashMap<String, Macro> builtinMacros) {
		//
		// add context specific builtin macros
		//
		Macro __LINE__ = new BuiltinMacro__LINE__();
		builtinMacros.put(__LINE__.getName(), __LINE__);
		Macro __FILE__ = new BuiltinMacro__FILE__();
		builtinMacros.put(__FILE__.getName(), __FILE__);

	}

	
	private static SymbolTable createMinimumBuiltinSymbols(GLSLTokenTable tokenTable) {
		SymbolTable builtinSymbols = new SymbolTable(null);
		for (Type t : Type.BUILTIN_TYPES) {
			// add those builtin types only, which are known in this version.
			if (tokenTable.isBuiltinType(t.getName()) || t.equals(Type._void)) {
				builtinSymbols.addType(t);
			}
		}
		return builtinSymbols;
	}

	
	
	/** 
	 * This is for testing purposes only! 
	 * It circumvents parsing of the builtin preambles, 
	 * and registers builtin types only.
	 */
	public static GLSLBuiltin getTestBuiltins(GLSLVersion version) {
		GLSLTokenTable tokens = GLSLTokenTable.getTokenTable(version);
		Key key = new Key(tokens.getVersion(), ShaderType.GENERIC_SHADER);
		SymbolTable builtinSymbols = createMinimumBuiltinSymbols(tokens);
		GLSLBuiltin builtin = new GLSLBuiltin(key, getDefaultBuiltinMacros(), tokens);
		builtin.builtinScope = builtinSymbols.getTopLevelScope();
		return builtin;
	}

	
}
