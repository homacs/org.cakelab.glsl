package org.cakelab.glsl.lang.lexer;

import java.util.ArrayList;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.cakelab.glsl.GLSLErrorHandler;
import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.lang.lexer.tokens.GLSLTokenTable;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;
import org.cakelab.glsl.pp.error.TokenFormatException;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.TWhitespace;

/**
 * PPTokenStream uses the preprocessor output and turns it
 * into a stream of valid GLSLParser tokens.
 * <p>
 * Received preprocessor tokens will be analysed based on
 * the given GLSLTokenTable and parse state information to
 * assign a valid token type.
 * </p>
 * 
 * @author homac
 *
 */
public class PPTokenStream implements TokenStream {

	
	public class EOFToken extends PPOutputToken {

		public EOFToken(int index, PPTokenSource source, int end, TEof eof) {
			super(index, source, end, end, GLSLParser.EOF, eof);
		}
		
		public String getText() {
			return "<EOF>";
		}

	}

	private ArrayList<PPOutputToken> tokens;
	private int p;
	private EOFToken eofToken;
	private boolean fetchedEOF;
	private GLSLTokenTable tokenTable;
	private GLSLErrorHandler errorHandler;
	private SymbolTable symbolTable;

	public PPTokenStream(GLSL_ANTLR_PPOutputBuffer output, GLSLTokenTable tokenTable, SymbolTable symbolTable, GLSLErrorHandler errorHandler) {
		this.symbolTable = symbolTable;
		this.p = 0;
		this.errorHandler = errorHandler;
		this.tokens = filter(output.getTokens());
		this.tokenTable = tokenTable;
		
		//
		// add EOF token
		//
		PPTokenSource inputSource = output.getInputSource();
		if (this.tokens.size() > 0) {
			PPOutputToken last = this.tokens.get(this.tokens.size()-1);
			Location end = last.getPPToken().getEnd();
			end.setColumn(end.getColumn()+1);
			org.cakelab.glsl.Interval interval = new org.cakelab.glsl.Interval(end, end);
			TEof teof = new TEof(interval);
			this.eofToken = new EOFToken(this.tokens.size(), inputSource, last.getStopIndex()+1, teof);
		} else {
			Resource resource = output.getState().getInputResource();
			Location end = new Location(resource.getIdentifier());
			org.cakelab.glsl.Interval interval = new org.cakelab.glsl.Interval(end, end);
			TEof teof = new TEof(interval);
			this.eofToken = new EOFToken(this.tokens.size(), inputSource, 0, teof);
		}
		this.tokens.add(eofToken);

		//
		// configure token sources
		//
		PPTokenSource[] sources = output.getUsedTokenSources();
		for (PPTokenSource source : sources) {
			source.setTokenStream(this);
		}
	}

	private ArrayList<PPOutputToken> filter(ArrayList<PPOutputToken> tokens) {
		ArrayList<PPOutputToken> filtered = new ArrayList<PPOutputToken>();
		for (PPOutputToken token : tokens) {
			org.cakelab.glsl.pp.tokens.Token t = token.getPPToken();
			if (!(t instanceof TWhitespace)) {
				token.setIndex(filtered.size());
				filtered.add(token);
			}
		}
		return filtered;
	}


	private int getTokenType(org.cakelab.glsl.pp.tokens.Token t) {
		
		if (t instanceof TWhitespace) {
			// TWhitespace is base of TCrlf, TLineContinuation, TComment and TUnknownToken
			throw new Error("internal error: preprocessor is supposed to remove all whitespace tokens");
		} else if (t instanceof TIdentifier) {
			TIdentifier identifierToken = (TIdentifier)t;
			String ident = identifierToken.getText();
			if (tokenTable.isLanguageKeyword(ident)) {
				identifierToken.setKeyword(true);
				return tokenTable.mapLanguageKeyword(ident);
			} else if (tokenTable.isBuiltinType(ident)) {
				identifierToken.setKeyword(true);
				identifierToken.setReferencedNode(symbolTable.getType(ident));
				return tokenTable.mapBuiltintType(ident);
			} else {
				if (tokenTable.isReservedKeyword(ident) && errorHandler != null) {
					errorHandler.error(t, "use of reserved keyword '" + ident + "'");
				}
				return GLSLParser.IDENTIFIER;
			}
		} else if (t instanceof TPunctuator && tokenTable.isPunctuator(t.getText())) {
			return tokenTable.getPunctuator(t.getText());
		} else if (t instanceof TNumber) {
			TNumber number = (TNumber)t;
			validate(number);

			if (number.isUnsignedInteger()) {
				return GLSLParser.UINTCONSTANT;
			} else if (number.isInteger()) {
				return GLSLParser.INTCONSTANT;
			} else if (number.isFloat()) {
				return GLSLParser.FLOATCONSTANT;
			} else if (number.isDouble()) {
				return GLSLParser.DOUBLECONSTANT;
			} else {
				throw new Error("internal error: constant number type recognition failed");
			}
		} else {
			throw new Error("internal error: token '" + t.getText() + "' should have not been forwarded as language token output");
		}
	}
	
	private void validate(TNumber number) {
		if (errorHandler == null) return;
		try {
			number.decode();
		} catch (TokenFormatException e) {
			errorHandler.error(number, e.getMessage());
		}
	}


	@Override
	public void consume() {
		boolean skipEofCheck;
		if (p >= 0) {
			if (fetchedEOF) {
				// the last token in tokens is EOF. skip check if p indexes any
				// fetched token except the last.
				skipEofCheck = p < tokens.size() - 1;
			}
			else {
				// no EOF token in tokens. skip check if p indexes a fetched token.
				skipEofCheck = p < tokens.size();
			}
		}
		else {
			// not yet initialized
			skipEofCheck = false;
		}

		if (!skipEofCheck && LA(1) == EOF) {
			throw new IllegalStateException("cannot consume EOF");
		}

		p++;
	}

	@Override
	public int LA(int i) {
		return LT(i).getType();
	}
	
	@Override
	public Token LT(int k) {
        if ( k==0 ) return null;
        if ( k < 0 ) {
        	int j = -k;
            if ( (p-j)<0 ) return null;
            else return token(p-j);
        }

		int i = p + k - 1;

        if (i >= tokens.size()) { 
        	// return EOF token
            return eofToken;
        } else {
        	return token(i);
        }
	}


	private PPOutputToken token(int i) {
		PPOutputToken token = tokens.get(i);
		if (token.getType() == PPOutputToken.INVALID_TYPE) {
			org.cakelab.glsl.pp.tokens.Token t = token.getPPToken();
			token.setType(getTokenType(t));
		}
		return token;
	}


	@Override
	public int mark() {
		return -1;
	}

	@Override
	public void release(int marker) {
	}

	@Override
	public int index() {
		return p;
	}

	@Override
	public void seek(int index) {
		// TODO: not sure, if we have to reset token information in TokenStream.seek
		/*
		for (int i = index; i <= this.p; i++) {
			PPOutputToken t = tokens.get(i);
			org.cakelab.glsl.pp.tokens.Token ppt = t.getPPToken();
			if (ppt instanceof TIdentifier) {
				// reset token types to revert probably misinterpreted type
				t.setType(PPOutputToken.INVALID_TYPE);
				((TIdentifier) ppt).setReferencedNode(null);
			}
		}
		*/
		this.p = index;
	}

	@Override
	public int size() {
		return tokens.size();
	}

	@Override
	public String getSourceName() {
		return UNKNOWN_SOURCE_NAME;
	}

	@Override
	public Token get(int i) {
        if ( i < 0 || i >= tokens.size() ) {
            throw new IndexOutOfBoundsException("token index "+i+" out of range 0.."+(tokens.size()-1));
        }
        PPOutputToken token = tokens.get(i);
        return token;
	}


	@Override
	public TokenSource getTokenSource() {
		//
		// Tokens are actually from different streams when supporting 
		// #include.
		// This method is used by the parser to retreive the TokenFactory
		// and generate a new token for a missing token.
		//
		// Since the missing token would be at the place of the next token,
		// we return here the source of the next token in the stream.
		//
		TokenSource source = LT(1).getTokenSource();
		if (source == null) {
			return null;
		} else {
			return source;
		}
	}

	@Override
	public String getText(Interval interval) {
		StringBuffer text = new StringBuffer();
		for (int i = interval.a; i <= interval.b; i++) {
			PPOutputToken token = (PPOutputToken) get(i);
			if (token != null) {
				text.append(token.getText());
				if (i< interval.b) text.append(' ');
			}
		}
		return text.toString();
	}

	@Override
	public String getText() {
		return getText(new Interval(0, tokens.size()-1));
	}

	@Override
	public String getText(RuleContext ctx) {
		return getText(ctx.getSourceInterval());
	}

	@Override
	public String getText(Token start, Token stop) {
		return getText(new Interval(start.getTokenIndex(), stop.getTokenIndex()));
	}


}
