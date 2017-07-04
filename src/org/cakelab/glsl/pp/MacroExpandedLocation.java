package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Expression;

/**
 * Location of text expanded from a macro invocation.
 * 
 * The location refers to the location of the macro call.
 * 
 * When the macro call is expanded (e.g. in an IDE) the 
 * referred location in the macro expanded text can be determined
 * by adding the macro expanded offset retrieved from {@link #getMacroExpandedOffset()}.
 * 
 * <h3>Attention:</h3> Start and end of a token or expression can be 
 *              inside macro expanded or simple text sections (e.g. 
 *              it can start in a text location and end in a 
 *              macro expanded location).
 *              
 * @author homac
 *
 */
public class MacroExpandedLocation extends Location {

	private int macroExpandedOffset;
	private Expression invocation;

	public MacroExpandedLocation(Location that, int macroExpandedOffset, Expression macroInvocation) {
		super(that);
		this.macroExpandedOffset = macroExpandedOffset;
		this.invocation = macroInvocation;
	}

	public int getMacroExpandedOffset() {
		return macroExpandedOffset;
	}

	public Expression getMacroInvocation() {
		return invocation;
	}
	
}
