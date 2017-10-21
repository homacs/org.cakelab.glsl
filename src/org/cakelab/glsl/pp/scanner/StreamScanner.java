package org.cakelab.glsl.pp.scanner;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.pp.error.SyntaxError;

/***
 * IScanner implementation for input streams.
 * 
 * @author homac
 *
 */
public class StreamScanner extends IScanner {

	public static class InputStreamBuffer {
		private static final int INIT_CAPACITY = 1024;

		
		private InputStream in;

		/** atoms read from stream. (atom = single char) */
		private int[] atoms = new int[INIT_CAPACITY];
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
			return atoms[pos];
		}
		
		void append(int atom) {
			atoms[length] = atom;
			length++;
			if (atoms.length<=length) {
				atoms = Arrays.copyOf(atoms, atoms.length<<1);
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

		public void dismiss(int startingFrom) {
			dismissed = true;
			atoms[startingFrom] = EOF;
			length = startingFrom+1;
		}
	}
	
	

	protected InputStreamBuffer buffer;
	protected Location location;



	/** Create a lexer scanning giving input stream. */
	public StreamScanner(String sourceIdentifier, InputStream in) throws SyntaxError {
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
	public StreamScanner(Location origin, InputStream in) {
		this.buffer = new InputStreamBuffer(in);
		this.location = origin;
	}

	public StreamScanner(Resource resource) {
		this(new Location(resource.getSourceIdentifier()), resource.openInputStream());
	}

	public int current() {
		return buffer.get(location.getPosition());
	}

	public boolean eof() {
		return location.getPosition() != Location.POS_START && buffer.get(location.getPosition()) == EOF;
	}
	
	public int lookahead(int i) {
		if (eof()) return EOF;
		int pos = location.getPosition()+i;
		if (pos > buffer.size()) throw new Error("lookahead exceeds end of file");
		return buffer.get(pos);
	}

	/** if line end reached, then read next line */
	private void consumed(int n) {
		if (n == 0 || eof()) return;
		for (int i = 0; i < n; i++) next(location);
		if (eof()) runEofHandlers();
	}

	/** consume n tokens and return the consumed string. */
	public void consume(int n) {
		int stop = location.getPosition()+n;
		assert(buffer.size() >= stop);
		consumed(n);
	}

	public int consume() {
		int stop = location.getPosition()+1;
		assert(buffer.size() >= stop);
		int consumed = buffer.get(stop);
		consumed(1);
		return consumed;
	}

	public void dismiss() {
		buffer.dismiss(location.getPosition());
		runEofHandlers();
	}

	public Location location() {
		return ((Location)location).clone();
	}

	public void setVirtualLocation(int line) {
		setVirtualLocation(location.getSourceIdentifier(), line);
	}

	public void setVirtualLocation(String id, int line) {
		location = new Location(id, location.getPosition(), line, Location.FIRST_COLUMN);
	}

	public boolean atColumnStart() {
		return location.getColumn() == Location.FIRST_COLUMN;
	}

	public void next(Location location) {
		int i = location.getPosition()+1;
		int c = buffer.get(i);
		if (c == EOF) {
			location.setPosition(i);
		} else {
			if (c == '\n') {
				location.nextLine();
			} else {
				location.nextColumn();
			}
		}
	}

	public Location nextLocation(Location location) {
		location = location.clone();
		next(location);
		return location;
	}

	public Location nextLocation() {
		return nextLocation((Location) location);
	}


	@Override
	public int remaining() {
		return buffer.size() - (location.getPosition()+1);
	}

	
	

}
