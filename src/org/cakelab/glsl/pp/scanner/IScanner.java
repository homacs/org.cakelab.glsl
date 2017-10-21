package org.cakelab.glsl.pp.scanner;

import org.cakelab.glsl.Location;

/**
 * Token processing has been split into 
 * <ul>
 * <li>{@link IScanner}: reading single characters (atoms) from input</li>
 * <li>Lexers: interpreting byte sequences as tokens (see {@link org.cakelab.glsl.pp.lexer.ILexer})</li>
 * <li>Parsers: interpreting sequences of tokens (see {@link org.cakelab.glsl.pp.parser.Parser})</li>
 * </ul>
 * <p>
 * The scanner is responsible to keep track of the current {@link Location} 
 * in the stream and deliver atoms read from the stream. All 
 * methods (e.g. {@link #lookahead(int)} or {@link #consume()}) 
 * refer to atom locations.
 * </p>
 * <p>
 * A scanner can only read in forward direction and cannot be reset to an
 * earlier position. Lexers have to use the {@link #lookahead(int)} methods 
 * (e.g. {@link #LA1()}) to determine if the input matches a certain token 
 * or not and {@link #consume(int)} those atoms on success.
 * </p>
 * 
 * @author homac
 *
 */
public abstract class IScanner {

	
	public static final int EOF = -1;

	/**
	 * @return atom at the current location, which is the last atom read.
	 */
	public abstract int current();
	
	public abstract boolean eof();
	
	/** 
	 * @param n number of atoms to look ahead from current position.
	 * @return atom found at that position.
	 */
	public abstract int lookahead(int n);

	/** 
	 * Consumes n atoms and sets current position to current+n.
	 * @param n number of atoms to consume starting from current position.
	 */
	public abstract void consume(int n);
	
	/** 
	 * Consumes 1 atoms and sets current position to current+1.
	 */
	public abstract int consume();

	/**
	 * Returns current location in stream, which is the location of the last atom read.
	 * @return Current location.
	 */
	public abstract Location location();

	/**
	 * Set a different line as current location. The column 
	 * will be reset to COLUMN_START.
	 * @param id
	 * @param line
	 * @see Location
	 */
	public abstract void setVirtualLocation(int line);

	/**
	 * Set a different input resource identifier and line
	 * as current location. The column will be reset to COLUMN_START.
	 * @param id
	 * @param line
	 * @see Location
	 */
	public abstract void setVirtualLocation(String id, int line);

	/** Determines if this scanner current is at the start of a new line */
	public abstract boolean atLineStart();

	/** 
	 * Create a new Location instance pointing to the next atom in this stream.
	 * @return
	 */
	public abstract Location nextLocation();

	/**
	 * Ignore all following atoms and pretend it is the end of the input stream.
	 */
	public abstract void dismiss();


	/**
	 * Number of remaining bytes from current position not including the EOF atom.
	 * @return
	 */
	public abstract int remaining();


	public int LA1() {
		return LA(1);
	}

	public int LA(int i) {
		return lookahead(i);
	}

	public boolean LA_equals(String s) {
		return LA_equals(1,s);
	}

	public boolean LA_equals(int start, String s) {
		assert(start > 0);
		for (int i = 0, l = start; i < s.length(); i++, l++) {
			char c = (char) lookahead(l);
			if (c != s.charAt(i)) return false;
		}
		return true;
	}

	public boolean LA_equals(char c) {
		return (LA1() == c);
	}

	public boolean LA_equals(int n, char c) {
		return LA(n) == c;
	}

}
