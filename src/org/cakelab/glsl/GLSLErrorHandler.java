package org.cakelab.glsl;

import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cakelab.glsl.pp.LocationMap;
import org.cakelab.glsl.pp.StandardErrorHandler;

public class GLSLErrorHandler extends StandardErrorHandler implements ANTLRErrorListener {
	
	LocationMap locations;
	private TokenStream tokens;
	
	
	public GLSLErrorHandler() {
		super(false);
	}

	
	public GLSLErrorHandler(boolean stopOnFirstError) {
		super(stopOnFirstError);
	}


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
		Location loc = locations.getLocation(token.getStartIndex());
		error(loc, msg);
		
	}

	public void error(ParseTree node, String message) {
		Interval i = interval(node);
		error(i.getStart(), message);
	}


	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
			BitSet ambigAlts, ATNConfigSet configs) {
		// ignored
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
			BitSet conflictingAlts, ATNConfigSet configs) {
		// ignored
	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
			ATNConfigSet configs) {
		// ignored
	}

	private Interval interval(ParseTree node) {
		org.antlr.v4.runtime.misc.Interval interval = node.getSourceInterval();
		Token first = tokens.get(interval.a);
		Token last = tokens.get(interval.b);
		return locations.getInterval(first.getStartIndex(), last.getStopIndex());
	}


}
