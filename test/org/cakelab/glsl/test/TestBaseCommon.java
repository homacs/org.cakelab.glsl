package org.cakelab.glsl.test;

import java.io.PrintStream;
import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.cakelab.glsl.lang.GLSLLexer;
import org.cakelab.glsl.lang.GLSLParser;
import org.cakelab.glsl.lang.Validator;
import org.cakelab.glsl.pp.GLSLPPLexer;

public class TestBaseCommon {

	protected static Parser parser;

	protected static Validator validator = new Validator();

	protected static boolean autoTearDown = true;

	private static final boolean DEBUG = false;
	protected static boolean ALLOW_FULL_CONTEXT = false;
	protected static boolean IGNORE_CONTEXT_SENSITIVITY = false;
	
	public static class ParserError implements ANTLRErrorListener {
		public String message;
		
		public String getMessage() {
			return message;
		}
		
		public void reset() {
			message = null;
		}
		
		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
				int column, String msg, RecognitionException e) {
			if (hasError()) return;
			this.message = "" + line  + ":" + column + ": " + msg;
		}

		@Override
		public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
				BitSet ambigAlts, ATNConfigSet configs) {

			if (hasError()) return;
			this.message = "reported ambiguity";
		}

		@Override
		public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
				BitSet conflictingAlts, ATNConfigSet configs) {
			
			// Note: This notification just tells, that the 
			//       parser switched to another (slower) parsing strategy.
			//       Most of the time, if this report comes in, it will be followed 
			//       by a reported ambiguity. Disable it temporary to find out.
			if (IGNORE_CONTEXT_SENSITIVITY || ALLOW_FULL_CONTEXT) return;
			if (hasError()) return;
			this.message = "attempting full context";
		}

		@Override
		public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
				int prediction, ATNConfigSet configs) {
			if (IGNORE_CONTEXT_SENSITIVITY) return;
			if (hasError()) return;
			this.message = "reported context sensitivity";
		}


		public boolean hasError() {
			return message != null;
		}

		public void listenTo(Parser parser, Lexer lexer) {
			reset();
			parser.removeErrorListeners();
			parser.addErrorListener(this);
			lexer.removeErrorListeners();
			lexer.addErrorListener(this);
		}
	}
	protected static final ParserError error = new ParserError();
	


	@SafeVarargs
	public static boolean contains(ParseTree ast, Class<? extends ParseTree> ... types) {
		if (types.length == 0) throw new ArrayIndexOutOfBoundsException("contains is undefined for empty type list");
		
		for (Class<? extends ParseTree> type : types) {
			if (ast.getClass() == type) return true;
		}
		
		for (int i = 0; i < ast.getChildCount(); i++) {
			if (contains(ast.getChild(i), types)) {
				return true;
			}
		}
		return false;
	}

	@SafeVarargs
	public static void assertValid(ParseTree ast, Class<? extends ParseTree> ... types) {
		String errmsg = null;

		
		boolean containsTypes = true;
		if (types != null && types.length != 0) {
			containsTypes = contains(ast, types);
		}
		
		if (error.hasError()) {
			errmsg = error.getMessage();
		} else if (!containsTypes) {
			errmsg = "expected context " + contextToString(types) + "' not found!";
		} else if (contains(ast, ErrorNodeImpl.class)) {
			errmsg = "error node detected!";
		} else if (!assertEOF()) {
			errmsg = "parser did not reach EOF. remaining: \"" + remainingText() + "\"";
		}
		
		evaluateError(errmsg, ast);
	}


	@SafeVarargs
	public static void assertInvalid(ParseTree ast, Class<? extends ParseTree> ... types) {
		String errmsg = null;
		
		boolean containsType = false;
		if (types != null && types.length != 0) {
			containsType = contains(ast, types);
		}
		
		if (!assertEOF()) {
			errmsg = null;
		} else if (containsType && !error.hasError()) {
			errmsg = "unexpected context found: " + contextToString(types);
		} else if (error.hasError() || contains(ast, ErrorNodeImpl.class)) {
			errmsg = null;
		} else {
			errmsg = "expected an error!";
		}
		
		evaluateError(errmsg, ast);
	}

	private static void evaluateError(String errmsg, ParseTree ast) {
		if (errmsg != null) {
			dump(System.err, ast, 0);
			error(errmsg);
		} else if (DEBUG) {
			dump(System.out, ast, 0);
		}
		if (autoTearDown)tearDown();
	}

	private static boolean assertEOF() {
		if (parser.isMatchedEOF()) {
			return true;
		} else {
			try {
				Token token = parser.getCurrentToken();
				return token.getType() == Token.EOF;
			} catch (RecognitionException e) {
				return false;
			}
		}
	}


	private static String remainingText() {
		TokenStream tokens = parser.getTokenStream();
		Token token;
		StringBuffer result = new StringBuffer();
		for (int i = tokens.index(); Token.EOF != (token = tokens.get(i)).getType(); i++,tokens.seek(i)) {
			result.append(token.getText());
		}
		return result.toString();
	}
	
	private static String contextToString(Class<? extends ParseTree>[] types) {
		StringBuffer s = new StringBuffer();
		for (Class<? extends ParseTree> type : types) {
			if (s.length() != 0)s.append(", ");
				s.append(type.getSimpleName());
		}
		return s.toString();
	}

	public static void error(String msg) {
		System.err.println("\n");
		StackTraceElement caller = getCallSite();
		System.err.println(caller.toString() + ": " + msg);
		System.exit(-1);
	}
	
	
	private static StackTraceElement getCallSite() {
		String baseClassNamePrefix = "TestBase";
		assert (TestBaseCommon.class.getSimpleName().startsWith(baseClassNamePrefix)) : "need to adjust prefix of the base class names to make tests work again";
		
		for (StackTraceElement stackElem : Thread.currentThread().getStackTrace()) {
			String className = stackElem.getClassName().replaceAll("[^\\.]*\\.", "");
			if (!className.equals(Thread.class.getSimpleName())
					&& !className.startsWith(baseClassNamePrefix)) {
				return stackElem;
			}
		}
		return null;
	}

	public static String indent(int depth) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < depth; i++) result.append(' ');
		return result.toString();
	}
	
	public static void dump(ParseTree parseTree) {
		dump(System.out, parseTree, 0);
	}

	public static void dump(PrintStream out, ParseTree parseTree, int depth) {
		String indent = indent(depth);
		if (parseTree instanceof TerminalNodeImpl) {
			Token token = (Token) parseTree.getPayload();
			out.print(indent + parser.getVocabulary().getSymbolicName(token.getType()) + "[");
		} else {
			out.print(indent + parseTree.getClass().getSimpleName() + "[");
		}
		if (parseTree.getChildCount() > 0) {
			out.println("'" + parseTree.getText() + "'");
			for (int i = 0; i < parseTree.getChildCount(); i++) {
				dump(out, parseTree.getChild(i), depth+1);
			}
			out.println(indent + "]");
		} else {
			out.println("'" + parseTree + "']");
		}
		
	}

	public static void setup(Parser parser, Lexer lexer) {
		error.listenTo(parser, lexer);
		if (validator != null) {
			if (parser instanceof GLSLParser) {
//				((GLSLParser)parser).setValidator(validator);
//				((GLSLLexer)lexer).setValidator(validator);
				((GLSLLexer)lexer).preprocessing = false;
			} else {
//				((GLSLPPParser)parser).setValidator(validator);
//				((GLSLPPLexer)lexer).setValidator(validator);
				((GLSLPPLexer)lexer).preprocessing = true;
			}
		}
	}

	public static void tearDown() {
		validator.reset();
	}



}
