package org.cakelab.glsl.lang;

import java.io.IOException;
import java.io.PrintStream;
import java.util.BitSet;
import java.util.HashMap;

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
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.lexer.GLSL_ANTLR_PPOutputBuffer;
import org.cakelab.glsl.lang.lexer.PPTokenStream;
import org.cakelab.glsl.lang.lexer.tokens.GLSLTokenTable;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;
import org.cakelab.glsl.pp.LocationMap;
import org.cakelab.glsl.pp.MacroMap;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.error.SyntaxError;
import org.cakelab.glsl.util.ObjectCache;
import org.cakelab.glsl.versioning.LookupResource;

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
	
	static final InternalErrorHandler INTERNAL_ERROR_HANDLER = new InternalErrorHandler();
	static final BuiltinResourceManager BUILTIN_RESOURCE_MANAGER = new BuiltinResourceManager(LookupResource.getBaseDirectory());
	static {
		INTERNAL_ERROR_HANDLER.setResourceManager(BUILTIN_RESOURCE_MANAGER);
	}
	
	/** cache for recently parsed preambles */
	static final ObjectCache<Key, GLSLBuiltin> BUILTIN_SYMBOLS_CACHE = new ObjectCache<Key, GLSLBuiltin>(4);
	
	
	private Key key;
	private MacroMap macros;


	GLSLBuiltin(Key key, MacroMap macros, GLSLTokenTable tokenTable) {
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
		scope = new BuiltinScope();
		toplevel = scope;
	}


	
	
	public static GLSLBuiltin get(GLSLVersion version, ShaderType type) {
		Key key = new Key(version, type);
		GLSLBuiltin result = BUILTIN_SYMBOLS_CACHE.get(key);
		if (result == null) {
			result = create(key);
			BUILTIN_SYMBOLS_CACHE.put(key, result);
		}
		return result;
	}

	private static GLSLBuiltin create(Key key) {
		Resource resource;
		try {
			resource = BUILTIN_RESOURCE_MANAGER.resolve(LookupResource.getResourceDirectory(key.version) + "/preamble.glsl");
		} catch (IOException e) {
			throw new Error("internal error: cant parse preamble. GLSLVersion parser should have avoided this case.", e);
		}
		GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(BUILTIN_RESOURCE_MANAGER);
		Preprocessor pp = new Preprocessor(resource, key.type, buffer);
		
		
		String shaderTypeBuiltinMacro = key.type.name();
		
		pp.addDefine(shaderTypeBuiltinMacro);
		
		pp.setResourceManager(BUILTIN_RESOURCE_MANAGER);
		pp.setErrorHandler(INTERNAL_ERROR_HANDLER);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		pp.setForceVersion(key.version);

		pp.process();

		MacroMap builtinMacros = pp.getState().getMacros();
		
		builtinMacros.remove(shaderTypeBuiltinMacro);

		GLSLTokenTable tokenTable = GLSLTokenTable.get(key.version);
		GLSLBuiltin symbolTable = new GLSLBuiltin(key, builtinMacros, tokenTable);

		PPTokenStream tokens = new PPTokenStream(buffer, tokenTable, symbolTable, INTERNAL_ERROR_HANDLER);
		INTERNAL_ERROR_HANDLER.setLocations(tokens, buffer.getLocations());
		ASTBuilder astBuilder = new ASTBuilder(tokens, buffer.getLocations(), symbolTable, INTERNAL_ERROR_HANDLER);
		
		GLSLParser parser = new GLSLParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(INTERNAL_ERROR_HANDLER);
		parser.addParseListener(astBuilder);
		
		parser.glsl();
		
		return symbolTable;
	}

	
	public GLSLVersion getVersion() {
		return key.version;
	}
	
	public ShaderType getShaderType() {
		return key.type;
	}
	
	public BuiltinScope getBuiltinScope() {
		return (BuiltinScope) super.getTopLevelScope();
	}

	public void dump(PrintStream out) {
		super.dump(out);
		for (Macro e : macros.getAll()) {
			out.println("macro: '" + e.getName() + "'");
		}
	}

	public HashMap<String, Macro> getBuiltinMacros() {
		return macros.getUserLevelMacros();
	}

	/** this is for testing purposes only! */
	public static GLSLBuiltin getTestSymbolTable(GLSLTokenTable tokens) {
		Key key = new Key(tokens.getVersion(), ShaderType.GENERIC_SHADER);
		return new GLSLBuiltin(key, new MacroMap(new GLSLExtensionSet()), tokens);
	}

	public static GLSLExtension loadExtension(String extension, GLSLVersion version, ShaderType type) {
		Resource resource;
		try {
			resource = BUILTIN_RESOURCE_MANAGER.resolve(LookupResource.getExtensionDirectory(extension) + "/preamble.glsl");
		} catch (IOException e) {
			throw new Error("internal error: cant parse preamble for extension '" + extension + "' . GLSLExtension parser should have avoided this case.", e);
		}
		
		
		
		
		GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(BUILTIN_RESOURCE_MANAGER);
		Preprocessor pp = new Preprocessor(resource, type, buffer);
		
		
		String shaderTypeBuiltinMacro = type.name();
		
		pp.addDefine(shaderTypeBuiltinMacro);
		
		pp.setResourceManager(BUILTIN_RESOURCE_MANAGER);
		pp.setErrorHandler(INTERNAL_ERROR_HANDLER);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		pp.setForceVersion(version);

		pp.process();

		MacroMap macroMap = pp.getState().getMacros();
		macroMap.remove(shaderTypeBuiltinMacro);
		
		HashMap<String, Macro> extensionMacros = macroMap.getUserLevelMacros();

		GLSLTokenTable tokenTable = GLSLTokenTable.get(version);
		
		BuiltinScope builtinScope = GLSLBuiltin.get(version, type).getBuiltinScope();

		SymbolTable symbolTable = new SymbolTable(builtinScope);
		
		PPTokenStream tokens = new PPTokenStream(buffer, tokenTable, symbolTable, INTERNAL_ERROR_HANDLER);
		INTERNAL_ERROR_HANDLER.setLocations(tokens, buffer.getLocations());
		ASTBuilder astBuilder = new ASTBuilder(tokens, buffer.getLocations(), symbolTable, INTERNAL_ERROR_HANDLER);
		
		GLSLParser parser = new GLSLParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(INTERNAL_ERROR_HANDLER);
		parser.addParseListener(astBuilder);
		
		parser.glsl();
		
		Scope extensionSymbols = symbolTable.getTopLevelScope();
		
		GLSLExtension e = new GLSLExtension(extension, version, type, extensionMacros, extensionSymbols);
		return e;
	}


	
}
