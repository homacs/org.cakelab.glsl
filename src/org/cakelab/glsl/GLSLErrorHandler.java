package org.cakelab.glsl;

import java.util.BitSet;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;
import org.cakelab.glsl.pp.LocationMap;
import org.cakelab.glsl.pp.StandardErrorHandler;

public class GLSLErrorHandler extends StandardErrorHandler implements GLSLErrorHandlerInterface {
	
	private boolean DEBUG = false;
	private LocationMap locations;
	private TokenStream tokens;
	
	
	public GLSLErrorHandler() {
		super(false);
	}

	
	public GLSLErrorHandler(boolean stopOnFirstError) {
		super(stopOnFirstError);
	}


	public void setDEBUG(boolean enabled) {
		DEBUG = enabled;
	}
	
	@Override
	public void setResourceManager(ResourceManager resources) {
		this.resources = resources;
	}

	public void setLocations(TokenStream tokens, LocationMap locations) {
		this.locations = locations;
		this.tokens = tokens;
	}

	/**
	 * Language level syntax error.
	 */
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		Token token = (Token) offendingSymbol;
		Location loc = ((PPOutputToken)token).getPPToken().getStart();
		error(loc, msg);
	}

	@Override
	public void error(ParseTree node, String message) {
		if (node.getChildCount() == 0) {
			error(((PPOutputToken)(node.getPayload())).getPPToken(), message);
		} else {
			Interval i = interval(node);
			error(i.getStart(), message);
		}
	}


	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
			BitSet ambigAlts, ATNConfigSet configs) {
		if (DEBUG) {
			Location start = locations.getLocation(startIndex);
			Location end = locations.getLocation(stopIndex);
			Interval interval = new Interval(start, end);
			warning(interval, "reported ambiguity on: '" + getText(startIndex, stopIndex) + "'");
		}
		// ignored
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
			BitSet conflictingAlts, ATNConfigSet configs) {
		if (DEBUG) {
			Location start = locations.getLocation(startIndex);
			Location end = locations.getLocation(stopIndex);
			Interval interval = new Interval(start, end);
			warning(interval, "reported full context search on: '" + getText(startIndex, stopIndex) + "'");
		}
	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
			ATNConfigSet configs) {
		if (DEBUG) {
			Location start = locations.getLocation(startIndex);
			Location end = locations.getLocation(stopIndex);
			Interval interval = new Interval(start, end);
			warning(interval, "reported context sensitivity on: '" + getText(startIndex, stopIndex) + "'");
		}
	}

	
	
	
	private String getText(int startIndex, int stopIndex) {
		org.antlr.v4.runtime.misc.Interval interval = new org.antlr.v4.runtime.misc.Interval(startIndex, stopIndex);
		return tokens.getText(interval);
	}

	private Interval interval(ParseTree node) {
		PPOutputToken first = getFirstToken(node);
		PPOutputToken last = getLastToken(node);
		return new Interval(first.getPPToken().getStart(), last.getPPToken().getEnd());
	}

	private PPOutputToken getLastToken(ParseTree node) {
		int childCount = node.getChildCount();
		if (childCount == 0) {
			return (PPOutputToken)node.getPayload();
		} else if (childCount > 0) {
			return getLastToken(node.getChild(childCount-1));
		} else {
			return null;
		}
	}


	private PPOutputToken getFirstToken(ParseTree node) {
		Object payload = node.getPayload();
		if (payload instanceof PPOutputToken) {
			return (PPOutputToken)payload;
		} else if (node.getChildCount() > 0) {
			return getFirstToken(node.getChild(0));
		} else {
			return null;
		}
	}



}
