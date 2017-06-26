package org.cakelab.glsl;

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
public class Location {
	public static final int POS_START = -1;
	public static final int COLUMN_START = 0;
	private static final int LINE_START = 1;
	public static final Location NONE = new Location("",-1,-1,-1);
	/** byte position in input */
	protected int pos;
	/** line number */
	protected int line;
	/** column */
	protected int column;
	/** identifier (for GLSL this is the source string number) */
	String identifier;
	
	public Location(String sourceIdentifier, int pos, int line, int column) {
		this.identifier = sourceIdentifier;
		this.line = line;
		this.column = column;
		this.pos = pos;
	}

	public Location(Location that) {
		this(that.identifier, that.pos, that.line, that.column);
	}

	public Location(String sourceIdentifier) {
		this(sourceIdentifier, POS_START, LINE_START, COLUMN_START);
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

	public int getPosition() {
		return pos;
	}

	public String toString() {
		return identifier + ':' + line + ':' + column;
	}
	
}
