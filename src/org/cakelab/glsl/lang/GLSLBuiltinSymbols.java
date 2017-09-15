package org.cakelab.glsl.lang;

import java.io.IOException;
import java.io.PrintStream;
import java.util.BitSet;
import java.util.Map.Entry;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
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

public class GLSLBuiltinSymbols extends SymbolTable {
	
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
			return start.toString() + ": " + message;
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
			// not required
		}

		@Override
		public void setLocations(TokenStream tokens, LocationMap locations) {
			// not required
		}

		@Override
		public void error(ParseTree node, String message) {
			throw new Error("internal error: " + message);
		}
		
	}
	
	static final InternalErrorHandler INTERNAL_ERROR_HANDLER = new InternalErrorHandler();
	
	/** cache for recently parsed preambles */
	static final ObjectCache<GLSLVersion, GLSLBuiltinSymbols> cache = new ObjectCache<GLSLVersion, GLSLBuiltinSymbols>(4);
	
	
	private MacroMap macros;

	GLSLBuiltinSymbols(MacroMap macros, GLSLTokenTable tokenTable) {
		super(null);
		this.macros = macros;
		for (Type t : Type.BUILTIN_TYPES) {
			// add those builtin types only, which are known in this version.
			if (tokenTable.isBuiltinType(t.getName()) || t.equals(Type._void)) {
				super.addType(t.getName(), t);
			}
		}
	}
	
	public static GLSLBuiltinSymbols get(GLSLVersion version) {
		GLSLBuiltinSymbols result = cache.get(version);
		if (result == null) {
			result = create(version);
			cache.put(version, result);
		}
		return result;
	}

	private static GLSLBuiltinSymbols create(GLSLVersion version) {
		ResourceManager resourceManager = new BuiltinResourceManager(LookupResource.getBaseDirectory());

		Resource resource;
		try {
			resource = resourceManager.resolve(LookupResource.getResourceDirectory(version) + "/preamble.glsl");
		} catch (IOException e) {
			throw new Error("internal error: cant parse preamble. GLSLVersion parser should have avoided this case.", e);
		}
		GLSL_ANTLR_PPOutputBuffer buffer = new GLSL_ANTLR_PPOutputBuffer(resourceManager);
		Preprocessor pp = new Preprocessor(resource, buffer);

		pp.setResourceManager(resourceManager);
		pp.setErrorHandler(INTERNAL_ERROR_HANDLER);
		pp.enableInclude(true);
		pp.enableLineDirectiveInsertion(false);
		pp.setForceVersion(version);

		pp.process();


		GLSLTokenTable tokenTable = GLSLTokenTable.get(version);
		GLSLBuiltinSymbols symbolTable = new GLSLBuiltinSymbols(pp.getState().getMacros(), tokenTable);

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

	public Scope getBuiltinScope() {
		return super.getTopLevelScope();
	}

	public void dump(PrintStream out) {
		super.dump(out);
		for (Entry<String, Macro> e : macros.entrySet()) {
			out.println("macro: '" + e.getKey() + "'");
		}
	}

	public MacroMap getMacros() {
		return macros;
	}

	/** this is for testing purposes only! */
	public static GLSLBuiltinSymbols getTestSymbolTable(GLSLTokenTable tokens) {
		return new GLSLBuiltinSymbols(new MacroMap(), tokens);
	}
	
}
