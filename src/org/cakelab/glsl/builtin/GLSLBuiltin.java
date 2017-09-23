package org.cakelab.glsl.builtin;

import java.io.IOException;
import java.io.PrintStream;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.lang.ASTBuilder;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.lang.lexer.PPTokenStream;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;
import org.cakelab.glsl.pp.LocationMap;
import org.cakelab.glsl.pp.MacroMap;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.error.SyntaxError;

public class GLSLBuiltin extends SymbolTable {
	
	private static class Key {

		private GLSLVersion version;
		private ShaderType type;

		public Key(GLSLVersion version, ShaderType type) {
			this.version = version;
			this.type = type;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((type == null) ? 0 : type.hashCode());
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
			if (type != other.type)
				return false;
			if (version == null) {
				if (other.version != null)
					return false;
			} else if (!version.equals(other.version))
				return false;
			return true;
		}

	}

	public static enum ShaderType {
		VERTEX_SHADER,
		FRAGMENT_SHADER,
		GENERIC_SHADER
	}

	/**
	 * This error handler throws an internal error on any error or 
	 * warning report.
	 * <p>
	 * This error handler is used only for internal purposes, such as
	 * parsing of preamble files (with builtin declarations). Any error
	 * in those files has to be considered as internal error (not user level error).
	 * </p>
	 * @author homac
	 *
	 */
	private static class InternalErrorHandler implements GLSLErrorHandler {

		private ResourceManager resources;

		@Override
		public void error(Node node, String message) throws SyntaxError {
			throw new Error("internal error: " + toString(node.getStart(), message));
		}

		@Override
		public void error(Location start, String message) throws SyntaxError {
			throw new Error("internal error: " + toString(start, message));
			
		}

		@Override
		public void warning(Location location, String message) throws SyntaxError {
			throw new Error("internal error: " + toString(location, message));
			
		}

		@Override
		public void warning(Interval interval, String message) throws SyntaxError {
			throw new Error("internal error: " + toString(interval.getStart(), message));
			
		}

		private String toString(Location start, String message) {
			String errLoc = "unknown location: ";
			if (start != null) {
				Resource resource = resources.getResourceById(start.getSourceIdentifier());
				String source;
				if (resource != null) {
					source = resource.getPath();
				} else {
					source = start.getSourceIdentifier();
				}
				errLoc = source + ":" + start.getLine() + ":" + start.getColumn() + ": ";
			}

			return errLoc + ": " + message;
		}

		
		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
				String msg, RecognitionException e) {
			PPOutputToken token = (PPOutputToken) offendingSymbol;
			throw new Error("internal error: " + toString(token.getPPToken().getStart(), msg));
		}

		@Override
		public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
				BitSet ambigAlts, ATNConfigSet configs) {
			throw new Error("internal error: reported ambiguity");
			
		}

		@Override
		public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
				BitSet conflictingAlts, ATNConfigSet configs) {
			throw new Error("internal error: reported attempt of full context");
		}

		@Override
		public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
				ATNConfigSet configs) {
			throw new Error("internal error: reported context sensitivity");
		}

		@Override
		public void setResourceManager(ResourceManager resources) {
			this.resources = resources;
		}

		@Override
		public void setLocations(TokenStream tokens, LocationMap locations) {
			// not required
		}

		@Override
		public void error(ParseTree node, String message) {
			throw new Error("internal error: " + toString(getLocation(node), message));
		}

		private Location getLocation(ParseTree node) {
			if (node instanceof TerminalNode) {
				PPOutputToken token = ((PPOutputToken)(((TerminalNode)node).getSymbol()));
				return token.getPPToken().getStart();
			} else if (node.getChildCount() > 0) {
				return getLocation(node.getChild(0));
			} else {
				return null;
			}
		}
		
	}
	
	
	public static class WorkingSet {
		private Key key;
		private BuiltinScope builtinScope;
		private HashMap<String, Macro> builtinMacros;

		
		
		public WorkingSet(Key key, BuiltinScope builtinScope, HashMap<String, Macro> builtinMacros) {
			super();
			this.key = key;
			this.builtinScope = builtinScope;
			this.builtinMacros = builtinMacros;
		}

		public ShaderType getShaderType() {
			return key.type;
		}
		
		public GLSLVersion getGLSLVersion() {
			return key.version;
		}
		
		public BuiltinScope getBuiltinScope() {
			return builtinScope;
		}

		public HashMap<String, Macro> getBuiltinMacros() {
			return builtinMacros;
		}

		public void enableExtension(String identifier) {
			GLSLExtension e = GLSLExtension.get(builtinScope, identifier, key.version, key.type);
			builtinScope.extensions.enable(e);
		}

		public void disableExtension(String identifier) {
			builtinScope.extensions.disable(identifier);
		}

		public GLSLExtensionSet getExtensions() {
			return builtinScope.extensions;
		}

		public void dump(PrintStream out) {
			builtinScope.dump(out, "");
			for (Macro m : builtinMacros.values()) {
				out.println("macro: " + m.getName());
			}
		}
		
	}
	
	
	static final InternalErrorHandler INTERNAL_ERROR_HANDLER = new InternalErrorHandler();
	static final BuiltinResourceManager BUILTIN_RESOURCE_MANAGER = new BuiltinResourceManager(BuiltinResources.getBaseDirectory());
	static {
		INTERNAL_ERROR_HANDLER.setResourceManager(BUILTIN_RESOURCE_MANAGER);
	}
	
	/** cache for recently parsed preambles */
	static final Map<Key, GLSLBuiltin> BUILTIN_SYMBOLS_CACHE = new HashMap<Key, GLSLBuiltin>(4);
	
	
	private Key key;
	private HashMap<String, Macro> macros;


	GLSLBuiltin(Key key, HashMap<String, Macro> macros, GLSLTokenTable tokenTable) {
		super(null);
		this.key = key;
		this.macros = macros;
		for (Type t : Type.BUILTIN_TYPES) {
			// add those builtin types only, which are known in this version.
			if (tokenTable.isBuiltinType(t.getName()) || t.equals(Type._void)) {
				super.addType(t.getName(), t);
			}
		}
	}
	
	public void reset() {
		scope = new ScopeImpl(null);
		toplevel = scope;
	}


	
	
	public static GLSLBuiltin get(GLSLVersion version, ShaderType type) {
		Key key = new Key(version, type);
		GLSLBuiltin result = BUILTIN_SYMBOLS_CACHE.get(key);
		if (result == null) {
			result = loadBuiltins(key);
			BUILTIN_SYMBOLS_CACHE.put(key, result);
		}
		return result;
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
	

	
	public GLSLVersion getVersion() {
		return key.version;
	}
	
	public ShaderType getShaderType() {
		return key.type;
	}

	public WorkingSet createWorkingSet() {
		return new WorkingSet(key, new BuiltinScope(super.getTopLevelScope()), getBuiltinMacros());
	}
	
	public void dump(PrintStream out) {
		super.dump(out);
		for (Macro e : macros.values()) {
			out.println("macro: '" + e.getName() + "'");
		}
	}

	public HashMap<String, Macro> getBuiltinMacros() {
		return macros;
	}

	
	public static HashMap<String, Macro> getDefaultBuiltinMacros() {
		HashMap<String, Macro> builtinMacros = new HashMap<String, Macro>();
		addCommonBuiltinMacros(builtinMacros);
		return builtinMacros;
	}
	
	/** this is for testing purposes only! */
	public static GLSLBuiltin getTestSymbolTable(GLSLTokenTable tokens) {
		Key key = new Key(tokens.getVersion(), ShaderType.GENERIC_SHADER);
		return new GLSLBuiltin(key, getDefaultBuiltinMacros(), tokens);
	}

	private static GLSLBuiltin loadBuiltins(Key key) {
		Resource resource;
		try {
			resource = BUILTIN_RESOURCE_MANAGER.resolve(BuiltinResources.getResourceDirectory(key.version) + "/preamble.glsl");
		} catch (IOException e) {
			throw new Error("internal error: cant parse preamble. GLSLVersion parser should have avoided this case.", e);
		}
		
		
		
		
		GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(BUILTIN_RESOURCE_MANAGER);

		HashMap<String, Macro> builtinMacros = preprocess(resource, key.version, key.type, buffer);
		addCommonBuiltinMacros(builtinMacros);

		GLSLTokenTable tokenTable = GLSLTokenTable.get(key.version);
		GLSLBuiltin builtinSymbols = new GLSLBuiltin(key, builtinMacros, tokenTable);

		parse(buffer, tokenTable, builtinSymbols);
		
		return builtinSymbols;
	}
	
	public static GLSLExtension loadExtension(BuiltinScope builtinScope, String extension, GLSLVersion version, ShaderType shaderType) {
		Resource resource;
		try {
			resource = BUILTIN_RESOURCE_MANAGER.resolve(BuiltinResources.getExtensionDirectory(extension) + "/preamble.glsl");
		} catch (IOException e) {
			throw new Error("internal error: cant parse preamble for extension '" + extension + "' . GLSLExtension parser should have avoided this case.", e);
		}
		
		
		GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(BUILTIN_RESOURCE_MANAGER);

		HashMap<String, Macro> extensionMacros = preprocess(resource, version, shaderType, buffer);

		GLSLTokenTable tokenTable = GLSLTokenTable.get(version);

		GLSLExtension e = new GLSLExtension(extension, version, shaderType, extensionMacros);
		GLSLExtensionSymbolTable symbolTable = new GLSLExtensionSymbolTable(e, builtinScope);

		parse(buffer, tokenTable, symbolTable);

		e.finishLoad();
		
		return e;
	}

	private static void parse(GLSL_ANTLR_PPOutputBuffer buffer, GLSLTokenTable tokenTable,
			SymbolTable symbolTable) {
		PPTokenStream tokens = new PPTokenStream(buffer, tokenTable, symbolTable, INTERNAL_ERROR_HANDLER);
		INTERNAL_ERROR_HANDLER.setLocations(tokens, buffer.getLocations());
		ASTBuilder astBuilder = new ASTBuilder(tokens, buffer.getLocations(), symbolTable, INTERNAL_ERROR_HANDLER);
		
		GLSLParser parser = new GLSLParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(INTERNAL_ERROR_HANDLER);
		parser.addParseListener(astBuilder);
		
		parser.glsl();
	}

	private static HashMap<String, Macro> preprocess(Resource resource, GLSLVersion version, ShaderType shaderType,
			GLSL_ANTLR_PPOutputBuffer buffer) {
		Preprocessor pp = new Preprocessor(resource, shaderType, buffer);
		
		pp.addDefine(shaderType.name());
		
		pp.setResourceManager(BUILTIN_RESOURCE_MANAGER);
		pp.setErrorHandler(INTERNAL_ERROR_HANDLER);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		pp.setForceVersion(version);

		pp.process();
		
		MacroMap macroMap = pp.getState().getMacros();
		macroMap.remove(shaderType.name());
		

		return macroMap.getUserLevelMacros();
	}


	
}
