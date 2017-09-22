package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;

public class PPExtensionDirective extends NodeImpl {
	public static enum Behaviour {
		REQUIRE,
		ENABLE,
		WARN,
		DISABLE
	}

	public String identifier;
	public Behaviour behaviour;
	
	public PPExtensionDirective(Interval interval, String identifier, Behaviour behaviour) {
		super(interval);
		this.identifier = identifier;
		this.behaviour = behaviour;
	}

}
