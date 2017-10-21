package org.cakelab.glsl.pp.scanner;

import org.cakelab.glsl.Location;

public abstract class IScanner {

	
	public static final int EOF = -1;

	public abstract int current();
	
	public abstract boolean eof();
	
	public abstract int lookahead(int i);

	public abstract void consume(int n);
	
	public abstract int consume();

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
	
	public abstract boolean atColumnStart();


	public abstract Location nextLocation();

	/**
	 * Called when an error occurred. 
	 * Scanner has to act, like it was read to EOF.
	 */
	public abstract void dismiss();


	/**
	 * Number of remaining bytes from current position not including the EOF atom.
	 * @return
	 */
	public abstract int remaining();
	
	
	public void consume_to_buffer(int n, StringBuffer buffer) {
		for (int i = 0; i < n; i++) {
			buffer.append((char)consume());
		}
	}

	public boolean consume_optional(String s) {
		if (LA_equals(s)) {
			consume(s.length());
			return true;
		}
		return false;
	}

	public boolean consume_optional(char c) {
		if (LA_equals(c)) {
			consume();
			return true;
		}
		return false;
	}



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
