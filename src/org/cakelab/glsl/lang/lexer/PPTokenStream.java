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
import org.cakelab.glsl.lang.lexer.tokens.ITokenTable;
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
	// TODO: we could assign matching sets of symbols to identifiers in TokenStream
	// this would allow 
	// 1. late resolution of identifiers (e.g. in editors) 
	// 2. lookup of overridden functions and redeclared variables
	// OR we leave it to the Validator implementation, whether to do it or not.
	
	public class EOFToken extends PPOutputToken {

		public EOFToken(int index, PPTokenSource source, int end, TEof eof) {
			super(index, source, end, end, GLSLParser.EOF, eof);
		}
		
		public String getText() {
			return "<EOF>";
		}

	}

	/** list of tokens received from preprocessor */
	private ArrayList<PPOutputToken> tokens;
	/** position of next token in stream */
	private int pos;
	/** token representing the end of the stream */
	private EOFToken eofToken;
	/** indicating whether the EOF token was read */
	private boolean fetchedEOF;
	private ITokenTable tokenTable;
	private GLSLErrorHandler errorHandler;
	private SymbolTable symbolTable;

	/**
	 * 
	 * @param output Preprocessor output.
	 * @param tokenTable Mappings of token strings to token type codes used by the ANTLR parser
	 * @param symbolTable Access to all currently known symbols
	 * @param errorHandler
	 */
	public PPTokenStream(GLSL_ANTLR_PPOutputBuffer output, ITokenTable tokenTable, SymbolTable symbolTable, GLSLErrorHandler errorHandler) {
		this.symbolTable = symbolTable;
		this.pos = 0;
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
			Location end = new Location(resource.getSourceIdentifier());
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


	/**
	 * Maps a given token to its type code used by ANTLR parser.
	 * @param t token to be mapped
	 * @return ANTLR token type code
	 */
	private int getTokenType(org.cakelab.glsl.pp.tokens.Token t) {
		
		if (t instanceof TWhitespace) {
			// TWhitespace is base of TCrlf, TLineContinuation, TComment and TUnknownToken
			throw new Error("internal error: preprocessor is supposed to remove all whitespace tokens");
		} else if (t instanceof TIdentifier) {
			TIdentifier identifierToken = (TIdentifier)t;
			String ident = identifierToken.getText();
			if (tokenTable.isLanguageKeyword(ident)) {
				identifierToken.setKeyword(true);
				if (symbolTable.containsType(ident)) {
					identifierToken.setReferencedNode(symbolTable.getType(ident));
				}
				return tokenTable.mapLanguageKeyword(ident);
			} else {
				if (tokenTable.isReservedKeyword(ident) && errorHandler != null) {
					errorHandler.error(t, "use of reserved keyword '" + ident + "'");
				}
				return GLSLParser.IDENTIFIER;
			}
		} else if (t instanceof TPunctuator && tokenTable.isPunctuator(t.getText())) {
			return tokenTable.mapPunctuator(t.getText());
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
	
	/** validates the given number by decoding its text representation */
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
		if (pos >= 0) {
			if (fetchedEOF) {
				// the last token in tokens is EOF. skip check if p indexes any
				// fetched token except the last.
				skipEofCheck = pos < tokens.size() - 1;
			}
			else {
				// no EOF token in tokens. skip check if p indexes a fetched token.
				skipEofCheck = pos < tokens.size();
			}
		}
		else {
			// not yet initialized
			skipEofCheck = false;
		}

		if (!skipEofCheck && LA(1) == EOF) {
			throw new IllegalStateException("cannot consume EOF");
		}

		pos++;
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
            if ( (pos-j)<0 ) return null;
            else return token(pos-j);
        }

		int i = pos + k - 1;

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
		return pos;
	}

	@Override
	public void seek(int index) {
		this.pos = index;
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
		// This method is used by the parser to retrieve the TokenFactory
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
