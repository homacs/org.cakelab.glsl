package org.cakelab.glsl.pp.scanner;

import java.util.ArrayList;

import org.cakelab.glsl.Location;

public abstract class IScanner {

	/**
	 * EofFuture is an EofHandler (see {@link IScanner#addOnEofHandler(Runnable)})
	 * which just stores, whether it was called or not. Method {@link #occurred()}
	 * indicates just that.
	 * @author homac
	 * @see IScanner#addOnEofHandler(Runnable)
	 * @see #occurred()
	 *
	 */
	public static class EofFuture implements Runnable {
		boolean occurred = false;
		
		@Override
		public void run() {
			occurred = true;
		}
		
		/**
		 * @return whether this handlers {@link #run()} method was called or not.
		 */
		public boolean occurred() {
			return occurred;
		}
	}
	
	public static final int EOF = -1;
	protected ArrayList<Runnable> eofHandlers = new ArrayList<Runnable>();


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
	 * On EOF Handlers allow clients to be notified, when
	 * the content of a scanner has been fully read (including EOF).
	 * The scanner will call the {@link Runnable#run()} method
	 * on each registered eof handler when EOF was consumed.
	 * @param runnable
	 * @see EofFuture
	 */
	public void addOnEofHandler(Runnable runnable) {
		eofHandlers.add(runnable);
	}

	protected void runEofHandlers() {
		for (Runnable handler : eofHandlers) {
			handler.run();
		}
	}


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
