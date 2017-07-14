package org.cakelab.glsl.pp;


/** Source code location of the cursor.
 * 
 * Source code resource (e.g. file or source string) is
 * identified by the resource identifier 
 * (see {@link Resource#getIdentifier()}.
 * 
 * The exact cursor position is either <br/>
 * <pre>
 *    line + column
 * </pre>
 * <br/>
 * or 
 * <br/>
 * <pre>
 *    position
 * </pre>
 * <br/>
 * which marks the cursor position in bytes 
 * from the start.
 * 
 * A location can be influenced by <code>#line</code> 
 * preprocessing directives. In this case, 
 * the location is virtually overridden. Getter methods
 * will always return the location of the cursor according 
 * to the last #line directive. The actual location in
 * the set of input streams is only needed by the 
 * lexer itself and therefore hidden inside.
 * 
 * 
 * @author homac
 *
 */
public class LexerLocation {
	public static final int POS_START = -1; // indicates: no input read so far
	public static final int FIRST_POSITION = 0;
	public static final int FIRST_COLUMN = 0;
	public static final int FIRST_LINE = 1;
	/** position in bytes from start */
	private int pos;
	/** line number */
	private int line;
	/** column */
	private int column;
	/** identifier (for GLSL this is the source string number) */
	private String identifier;
	
	protected LexerLocation(String sourceIdentifier, int pos, int line, int column) {
		this.identifier = sourceIdentifier;
		this.line = line;
		this.column = column;
		this.pos = pos;
	}

	protected LexerLocation(LexerLocation that) {
		this(that.identifier, that.pos, that.line, that.column);
	}

	/** constructing an instance pointing to the start of the resource identified by sourceIdentifier.*/
	protected LexerLocation(String sourceIdentifier) {
		this(sourceIdentifier, POS_START, FIRST_LINE, FIRST_COLUMN);
	}

	public int getLine() {
		return line;
	}
	
	public int getColumn() {
		return column;
	}
	
	public String getSourceIdentifier() {
		return identifier;
	}

	int getLexerPosition() {
		return pos;
	}

	public int getPosition() {
		return pos;
	}
	
	
	protected void nextLine() {
		pos++;
		line++;
		column = FIRST_COLUMN;
	}
	
	protected void nextColumn() {
		pos++;
		column++;
	}

	protected void setLexerPosition(int lastConsumedPos) {
		pos = lastConsumedPos;
	}


	
	public String toString() {
		return identifier + ':' + line + ':' + column;
	}
	
	public LexerLocation clone() {
		return new LexerLocation(this);
	}
	
	
}
