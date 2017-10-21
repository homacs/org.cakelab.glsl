package org.cakelab.glsl;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.MacroExpandedLocation;
/** Source code location of the cursor.
 * 
 * Source code resource (e.g. file or source string) is
 * identified by the resource identifier 
 * (see {@link Resource#getSourceIdentifier()}.
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
 * to the last #line directive. 
 * 
 * @see Location
 * @see MacroExpandedLocation
 * @author homac
 *
 */
public class Location {
	public static final Location NONE = new Location("",-1,-1,-1);

	public static final int POS_START = -1; // indicates: no input read so far
	public static final int FIRST_POSITION = 0;
	public static final int FIRST_COLUMN = 0; // beyond the start of line to the left. Atom at LA1() will have column = 1
	public static final int FIRST_LINE = 1;
	/** position in bytes from FIRST_POSITION */
	private int pos;
	/** line number */
	private int line;
	/** column number */
	private int column;
	/** identifier (for GLSL this is the source string number) */
	private String identifier;
	
	public Location(String sourceIdentifier, int pos, int line, int column) {
		this.identifier = sourceIdentifier;
		this.line = line;
		this.column = column;
		this.pos = pos;
	}

	public Location(Location that) {
		this(that.identifier, that.pos, that.line, that.column);
	}

	/** constructing an instance pointing to the start of the resource identified by sourceIdentifier.*/
	public Location(String sourceIdentifier) {
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

	public int getPosition() {
		return pos;
	}
	
	public void nextLine() {
		pos++;
		line++;
		column = FIRST_COLUMN;
	}
	
	public void nextColumn() {
		pos++;
		column++;
	}

	public void setPosition(int lastConsumedPos) {
		pos = lastConsumedPos;
	}

	public void setColumn(int column) {
		int diff = column - this.column;
		setPosition(getPosition() + diff);
		this.column = column;
	}

	
	public String toString() {
		return identifier + ':' + line + ':' + column;
	}
	
	public Location clone() {
		return new Location(this);
	}

	
	public Location add(Location offset) {
		Location result = this.clone();
		result.pos += offset.pos-POS_START;
		if (offset.line == Location.FIRST_LINE) {
			result.column += offset.column;
		} else {
			result.line += offset.line - Location.FIRST_LINE;
			result.column = offset.column;
		}
		return result;
	}

	public Location getLineStart() {
		Location lineStart = this.clone();
		lineStart.setColumn(FIRST_COLUMN);
		return lineStart;
	}
	
	
}
