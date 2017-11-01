package org.cakelab.glsl.pp.parser;

import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.PPHelper;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.error.ExpressionError;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.error.SyntaxError;
import org.cakelab.glsl.pp.tokens.TCharacterConstant;
import org.cakelab.glsl.pp.tokens.TComment;
import org.cakelab.glsl.pp.tokens.TCrlf;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.THeaderPath;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TLineContinuation;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.TStringLiteral;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public abstract class Parser extends PPHelper  {

	protected Token token = null;
	
	public Parser(PPState state) {
		super(false, state);
	}

	public Parser(boolean enableRecovery, PPState state) {
		super(enableRecovery, state);
	}


	public boolean atEOF() {
		return getLexer().eof() || getLexer().lookahead(1) instanceof TEof;
	}

	
	public abstract boolean parse() throws Recovery;
	
	
	protected ExpressionError expressionError(Interval interval, String message) throws SyntaxError {
		try {
			syntaxError(interval.getStart(), message);
		} catch (Recovery e) {
			// creating the expression error is the recovery (see below)
		}
		return new ExpressionError(interval, message);
	}

	protected Token preprocessing_token(boolean acceptHashes) {
		Token la = getLexer().lookahead(1);
		if (la instanceof TIdentifier) {
			return getLexer().consume(1);
		} else if (la instanceof TStringLiteral) {
			return getLexer().consume(1);
		} else if (la instanceof TCharacterConstant) {
			return getLexer().consume(1);
		} else if (la instanceof TPunctuator) {
			if (!acceptHashes && la.getText().startsWith("#")) {
				return null;
			} else {
				return getLexer().consume(1);
			}
		} else if (la instanceof TNumber) {
			return getLexer().consume(1);
		} else if (la instanceof TEof) {
			return null;
		} else if (la instanceof TCrlf) {
			return null;
		} else if (la instanceof TWhitespace) {
			return null;
		} else {
			// anything else but whitespace or crlf or eof
			return getLexer().consume(1);
		}
	}

	
	protected Location line_start(Location start) {
		Location l = start.clone();
		l.setColumn(Location.FIRST_COLUMN);
		return l;
	}



	/** Skips all input characters including line continuation sequences 
	 * (\\\r) and stops after CRLF or EOF. 
	 * @return false if lexer is already at EOF.
	 * @see #read_remaining_line() 
	 */
	protected boolean skip_remaining_line() {
		if (getLexer().eof()) return false;
		while (!ENDL()) {
			if (!line_continuation()) {
				getLexer().consume(1);
			}
		}
		return true;
	}

	/** 
	 * Reads all input characters including line continuation sequences 
	 * (\\\r) and stops after CRLF or EOF.
	 * The sequence of characters, including the terminating CRLF or EOF
	 * is returned as string.
	 */
	protected TokenList read_remaining_line() {
		// TODO [6] see if we really need this (consider methods above)
		if (getLexer().eof()) return null;
		TokenList result = new TokenList();
		while(!ENDL()) {
			if (!line_continuation()) {
				result.add(getLexer().consume(1));
			}
		}
		return result;
	}

	/** \\\r\n or \\\n */
	protected boolean line_continuation() {
		token = null;
		if (optional(TLineContinuation.class)) {
			return true;
		}
		return false;
	}
	
	protected boolean optional(Class<? extends Token> tokenType) {
		token = null;
		if (tokenType.isInstance(getLexer().lookahead(1))) {
			token = getLexer().consume(1);
			return true;
		}
		return false;
	}

	protected boolean optional(Class<? extends Token> tokenType, String text) {
		Token la = getLexer().lookahead(1);
		if (tokenType.isInstance(la) && text.equals(la.getText())) {
			token = getLexer().consume(1);
			return true;
		}
		return false;
	}

	protected boolean mandatory(Class<? extends Token> tokenType, String text) throws Recovery {
		if (!optional(tokenType, text)) {
			syntaxError(getLexer().lookahead(1).getStart(), "missing '" + text + "'");
			return false;
		}
		return true;
	}

	
	/**
	 * Either \r\n or \n or EOF
	 * @return
	 */
	protected boolean ENDL() {
		token = null;
		if (optional(TCrlf.class) || optional(TEof.class)) {
			return true;
		} else {
			return false;
		}
	}

	
	protected boolean HEADER_PATH() {
		token = null;
		// TODO: maybe use specific lexers e.g. for include
		if (optional(THeaderPath.class)) {
			return true;
		}
		
		return false;
	}
	

	

	protected boolean isOctDigit(char c) {
		return '0' <= c  && c <= '7';
	}

	protected boolean isDigit(char c) {
		return '0' <= c  && c <= '9';
	}

	protected boolean isHexDigit(char c) {
		return isDigit(c) || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
	}

	protected boolean NUMBER() {
		token = null;
		if (optional(TNumber.class)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	protected boolean DOTS() {
		token = null;
		return PUNCTUATOR("...");
	}

	protected boolean PUNCTUATOR(boolean acceptHashes) {
		token = null;
		Token t = getLexer().lookahead(1);
		if (t instanceof TPunctuator) {
			if (!acceptHashes) {
				// TODO [4] consider introduction of THash and THashHash
				String text = t.getText();
				if (!text.equals("#") && !text.equals("##")) {
					token = t;
				}
			}
		}
		return token != null;
	}
	
	protected boolean PUNCTUATOR(char c) {
		return PUNCTUATOR(String.valueOf(c));
	}

	protected boolean PUNCTUATOR(String text) {
		token = null;
		Token t = getLexer().lookahead(1);
		if (t instanceof TPunctuator && text.equals(t.getText())) {
			token = getLexer().consume(1);
		}
		return token != null;
	}



	protected boolean IDENTIFIER() {
		return (optional(TIdentifier.class)); 
	}
	
	protected boolean IDENTIFIER(String expectedIdentifier) {
		return (optional(TIdentifier.class, expectedIdentifier)); 
	}
	


	/** WHITESPACE including traditional white space chars,
	 * line continuation markers and comments but no pure
	 * CRLF (except multi-line comments and line continuations).
	 * Any whitespace read is stored in "this.token" .
	 */
	protected boolean WHITESPACE() {
		token = null;
		if (getLexer().lookahead(1) instanceof TCrlf) {
			return false;
		} else if (optional(TWhitespace.class)) {
			return true;
		} else if (line_continuation()) {
			return true;
		} else if (optional(TComment.class)) {
			return true;
		} else {
			return false;
		}
	}

	protected int nextNonWhiteLookahead(int from, boolean skipCRLF) {
		int i = from;
		for (Token la = getLexer().lookahead(i); !(la instanceof TEof); la = getLexer().lookahead(i)) {
			if (la instanceof TCrlf && !skipCRLF) {
				break;
			} else if (la instanceof TWhitespace) {
				i++;
			} else {
				break;
			}
		}
		return i;
	}
	
	
	protected boolean CRLF() {
		token = null;
		if (optional(TCrlf.class)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Sequence consisting of CRLF() and WHITESPACE()
	 * @return
	 */
	protected boolean whitespace_crlf_sequence() {
		boolean result = false;
		Token la = getLexer().lookahead(1);
		while (la instanceof TCrlf || la instanceof TWhitespace) {
			result = true;
			token = getLexer().consume(1);
			la = getLexer().lookahead(1);
		}
		return result;
	}

	

	protected boolean mandatory_endl() {
		if (!ENDL()) {
			try {
				syntaxError(getLexer().lookahead(1).getStart(), "missing mandatory CRLF or end of file");
			} catch (Recovery e) {
				// use general error recovery
				recoverError();
			}
			
			return false;
		}
		return true;
	}

	public void recoverError() {
		skip_remaining_line();
	}

	public void setErrorHandler(GLSLErrorHandler errorHandler) {
		getState().setErrorHandler(errorHandler);
	}


	


}
