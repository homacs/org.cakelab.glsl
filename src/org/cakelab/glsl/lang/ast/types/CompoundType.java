package org.cakelab.glsl.lang.ast.types;

import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.Node;

public interface CompoundType {
	interface Member {
		String toString();
		Node getNode();
		String getName();
		Type getType();
		/** Returns the struct or interface block, which contains this member. */
		CompoundType getCompoundType();
	}
	/** member can be variable, method, constructor or type */
	void addMember(Member member);
	Member getMember(String identifier);
	IScope getBody();
}
