package org.cakelab.glsl.impl;

import java.util.BitSet;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;
import org.cakelab.glsl.pp.StandardErrorHandler;

public class GLSLErrorHandlerImpl extends StandardErrorHandler implements GLSLErrorHandler {
	
	private boolean DEBUG = false;
	private TokenStream tokens;
	
	
	public GLSLErrorHandlerImpl() {
		super(false);
	}

	
	public GLSLErrorHandlerImpl(boolean stopOnFirstError) {
		super(stopOnFirstError);
	}


	public void setDEBUG(boolean enabled) {
		DEBUG = enabled;
	}
	
	@Override
	public void setResourceManager(ResourceManager resources) {
		this.resources = resources;
	}

	public void setLocations(TokenStream tokens) {
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
			Interval interval = interval(startIndex, stopIndex);
			warning(interval, "reported ambiguity on: '" + getText(startIndex, stopIndex) + "'");
		}
		// ignored
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
			BitSet conflictingAlts, ATNConfigSet configs) {
		if (DEBUG) {
			Interval interval = interval(startIndex, stopIndex);
			warning(interval, "reported full context search on: '" + getText(startIndex, stopIndex) + "'");
		}
	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
			ATNConfigSet configs) {
		if (DEBUG) {
			Interval interval = interval(startIndex, stopIndex);
			warning(interval, "reported context sensitivity on: '" + getText(startIndex, stopIndex) + "'");
		}
	}

	
	
	
	private String getText(int startIndex, int stopIndex) {
		org.antlr.v4.runtime.misc.Interval interval = new org.antlr.v4.runtime.misc.Interval(startIndex, stopIndex);
		return tokens.getText(interval);
	}

	
	private Interval interval(int startIndex, int stopIndex) {
		return interval((PPOutputToken) tokens.get(startIndex), (PPOutputToken) tokens.get(stopIndex));
	}

	private Interval interval(PPOutputToken first, PPOutputToken last) {
		return new Interval(first.getPPToken().getStart(), last.getPPToken().getEnd());
	}
	
	private Interval interval(ParseTree node) {
		return interval(getFirstToken(node), getLastToken(node));
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
