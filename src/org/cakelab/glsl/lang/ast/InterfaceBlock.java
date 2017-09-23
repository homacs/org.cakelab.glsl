package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Qualifier.DirectionQualifier;

public class InterfaceBlock extends Struct {

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
		return direction.name + " " + name;
	}

	/** 
	 * Used to uniquely identify a certain interface. 
	 * It is a combination of direction qualifier and name. */
	public String getKey() {
		return key(direction, getName());
	}

	@Override

	
	public String toString() {
		String fqn = this.signature;
		if (!qualifiers.isEmpty()) {
			fqn = qualifiers.toString() + " " + fqn;
		}
		return fqn;
	}

	public DirectionQualifier getDirection() {
		return direction;
	}


	
	
	
	
	
}
