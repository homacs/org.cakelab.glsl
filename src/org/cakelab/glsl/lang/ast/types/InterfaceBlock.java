package org.cakelab.glsl.lang.ast.types;

import java.util.ArrayList;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.Qualifier;
import org.cakelab.glsl.lang.ast.Qualifiers;
import org.cakelab.glsl.lang.ast.Qualifier.DirectionQualifier;

public class InterfaceBlock extends Struct {
	// FIXME: variables of interface blocks alias at global space if the interface declaration is not associated with a variable declaration?
	// FIXME: adding qualifiers and array dimensions to variables of interface blocks (see gl_TexCoord in 1.50)
	private DirectionQualifier direction;

	public InterfaceBlock(Interval interval, IScope parent, String name, Qualifiers qualifiers) {
		super(interval, parent, name, qualifiers);
		direction = qualifiers.get(DirectionQualifier.class);
	}

	public InterfaceBlock(InterfaceBlock block) {
		super(block);
	}

	public InterfaceBlock clone() {
		return new InterfaceBlock(this);
	}

	/**
	 * Used by the symbol table to lookup existing interfaces.
	 * @param direction
	 * @param name
	 * @return
	 */
	public static String key(Qualifier direction, String name) {
		return direction.getName() + " " + name;
	}

	/** 
	 * Used to uniquely identify a certain interface. 
	 * It is a combination of direction qualifier and name. */
	public String getKey() {
		return key(direction, getName());
	}

	@Override

	
	public String toString() {
		String fqn = this.getSignature();
		if (!qualifiers.isEmpty()) {
			fqn = qualifiers.toString() + " " + fqn;
		}
		return fqn;
	}

	public DirectionQualifier getDirection() {
		return direction;
	}

	public ArrayList<Member> getMembers() {
		return body.members;
	}

	@Override
	protected void createStandardConstructors() {
		// no constructors
	}


	
	
	
	
	
}
