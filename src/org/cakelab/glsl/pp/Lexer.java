package org.cakelab.glsl.pp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.ast.MacroInvocation;


/**
 * Most primitive lexer you've ever seen.
 * @author homac
 *
 */
public class Lexer {

	public static class InputStreamBuffer {
		private static final int INIT_CAPACITY = 1024;

		
		private InputStream in;

		/** tokens read from stream */
		private int[] tokens = new int[INIT_CAPACITY];
		/** length of the current line, not the buffer */
		protected int length;

		protected boolean dismissed = false;
		
		
		InputStreamBuffer(InputStream in) {
			this.in = in;
			readAll();
		}

		int get(int pos) {
			if (pos < 0) {
				throw new IndexOutOfBoundsException("buffer underflow: index " + pos);
			}
			if (dismissed || pos >= size()) return EOF;
			return tokens[pos];
		}
		
		void append(int token) {
			tokens[length] = token;
			length++;
			if (tokens.length<length) {
				tokens = Arrays.copyOf(tokens, tokens.length<<1);
			}
		}
		
		void readAll() {
			int c;
			
			try {
				readBOM(in);
				
				while((c = in.read()) != EOF) {
					append(c);
				}
			} catch (IOException e) {
				throw new Error(e);
			}
		}

		private void readBOM(InputStream in) throws IOException {
			// TODO BOM should not be read in input stream buffer
			//       especially in temporary lexers.
			
			int bytes; // first two bytes as one integer
			byte hi,lo; // the two bytes separated
			int c = in.read();
			if (c == EOF) return;
			else {
				hi = (byte)c;
				c = in.read();
				if (c == EOF) {
					append(hi);
					return;
				} else {
					lo = (byte)c;
				}
				bytes = (0xff&hi)<<8;
				bytes = bytes + (0xff&lo);
			}
			
			switch(bytes) {
			case 0xEFBB:
				c = in.read();
				if (c == 0xBF) {
					return;         // UTF8  (0xEFBBBF)
				}
			case 0xFEFF:
				return;             // UTF16 (0xFEFF)
			case 0x0000:
				if (in.read() == 0xFE && in.read() == 0xFF) {
					return;         // UTF32 (0x0000FEFF)
				}
			case 0xFFFE:
				c = in.read();
				if (c == 0x00) {
					if (in.read() == 0x00) {
						return;     // UTF32 (0xFFFE0000)
					}
				} else {
					append(c);
					return;         // UTF16 (0xFFFE)
				}
			default:
				// none of the above -> add bytes to text
				append(hi);
				append(lo);
				return;
			}
		}

		public int size() {
			return length;
		}

		public String getText(int start, int end) {
			if (dismissed) return "";
			start = start < 0 ? 0 : start;
			StringBuffer s = new StringBuffer();
			for (int i = start; i <= end; i++) {
				s.append((char)get(i));
			}
			return s.toString();
		}

		public void dismiss(int startingFrom) {
			dismissed = true;
			tokens[startingFrom] = -1;
			length = startingFrom+1;
		}
	}
	
	public static final int EOF = -1;
	

	protected InputStreamBuffer buffer;
	protected LexerLocation location;


	public int current() {
		return buffer.get(location.getLexerPosition());
	}

	/** Create a lexer scanning giving input stream. */
	public Lexer(String sourceIdentifier, InputStream in) throws SyntaxError {
		this.buffer = new InputStreamBuffer(in);
		this.location = new Location(sourceIdentifier);
	}

	/** 
	 * 
	 * 
	 * This creates a lexer using origin as virtual location of the input.
	 * The actual position in the input will be reset to the start position.
	 * @param origin
	 * @param in
	 */
	protected Lexer(Location origin, InputStream in) {
		this.buffer = new InputStreamBuffer(in);
		// FIXME position may be misinterpreted as actual position by location map!
		this.location = origin;
	}

	
	public static Lexer createStringRescanLexer(Location origin, String text) {
		origin = new Location(origin.getSourceIdentifier(), Location.POS_START, origin.getLine(), origin.getColumn());
		ByteArrayInputStream in = new ByteArrayInputStream(text.getBytes());
		return new Lexer(origin, in);
	}
	
	public static Lexer createExpansionRescanLexer(MacroInvocation expr, String prepend, Lexer append) {
		return new RescanLexer(expr, new ByteArrayInputStream(prepend.getBytes()), append);
	}

	
	public boolean eof() {
		return location.getLexerPosition() != Location.POS_START && buffer.get(location.getLexerPosition()) == EOF;
	}
	
	public int lookahead(int i) {
		if (eof()) return EOF;
		int pos = location.getLexerPosition()+i;
		if (pos > buffer.size()) throw new Error("lookahead exceeds line end");
		return buffer.get(pos);
	}

	/** if line end reached, then read next line */
	private void consumed(int lastConsumedPos) {
		if (eof()) return;

		for (int c = lookahead(1); c != EOF && location.getLexerPosition() < lastConsumedPos;) {
			if (c == '\n') {
				location.nextLine();
			} else {
				location.nextColumn();
			}
		}
		location.setLexerPosition(lastConsumedPos);
	}

	/** consume n tokens and return the consumed string. */
	public String consume(int n) {
		int stop = location.getLexerPosition()+n;
		assert(buffer.size() >= stop);
		String consumed = buffer.getText(location.getLexerPosition()+1, stop);
		consumed(stop);
		return consumed;
	}

	public int consume() {
		int stop = location.getLexerPosition()+1;
		assert(buffer.size() >= stop);
		int consumed = buffer.get(stop);
		consumed(stop);
		return consumed;
	}

	public void dismiss() {
		buffer.dismiss(location.getLexerPosition());
	}

	public Location location() {
		return new Location((Location)location);
	}

	public void rewind(Location reset) {
		location = reset;
	}

	public void setVirtualLocation(int line) {
		setVirtualLocation(location.getSourceIdentifier(), line);
	}

	public void setVirtualLocation(String id, int line) {
		location = new Location(id, location.getLexerPosition(), line, Location.COLUMN_START);
	}

	public String getString(LexerLocation start, LexerLocation end) {
		assert (start.getSourceIdentifier().equals(location.getSourceIdentifier())) ;
		assert (end.getSourceIdentifier().equals(location.getSourceIdentifier())) ;
		
		return buffer.getText(start.getLexerPosition(), end.getLexerPosition());
	}

	public String getString(int start, int end) {
		return buffer.getText(start, end);
	}

	/** signals that previously scanned input will not be rewound. 
	 * @return */
	public Lexer commit() {
		// intentionally empty
		return this;
	}

	public boolean atColumnStart() {
		return location.getColumn() == Location.COLUMN_START;
	}


}
