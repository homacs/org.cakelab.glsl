package org.cakelab.glsl;

import org.cakelab.glsl.pp.LexerLocation;

/** 
 * Representation of a source code location.
 * <p>
 * Source code resource (e.g. file or source string) is
 * identified by the resource identifier 
 * (see {@link Resource#getIdentifier()}.
 * </p>
 * The position in the resource is expressed as tuple: <br/>
 * <pre>
 *    line : column
 * </pre>
 * <br/>
 * <p>
 * A location can be influenced by <code>#line</code> 
 * preprocessing directives. In this case, 
 * the location is virtually overridden. Getter methods
 * will always return the location of the cursor according 
 * to the last #line directive. The actual position in
 * an input streams is only needed by the lexer and 
 * therefore hidden inside.
 * </p>
 * 
 * @author homac
 *
 */
public class Location extends LexerLocation {

	public static final Location NONE = new Location("",-1,-1,-1);

	
	public Location(Location that) {
		super(that);
	}

	public Location(String sourceIdentifier, int pos, int line, int column) {
		super(sourceIdentifier, pos, line, column);
	}

	public Location(String sourceIdentifier) {
		super(sourceIdentifier);
	}
	
}
