package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Struct.Member;
import org.cakelab.glsl.lang.ast.Struct.Method;

public class MemberReference extends Value {

	/** this pointer used in method calls */
	Value compound;

	public MemberReference(Interval interval, Value compound, Member member) {
		super(interval, member.getType(), member);
		this.compound = compound;
	}

	public Struct.Method getMethod() {
		return (Method) this.value;
	}

	public Value getCompound() {
		return compound;
	}

	
	
}
