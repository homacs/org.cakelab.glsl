package org.cakelab.glsl;

import org.cakelab.glsl.lang.ast.impl.NodeImpl;

public class GLSLExtension extends NodeImpl {
	public static enum Behaviour {
		REQUIRE,
		ENABLE,
		WARN,
		DISABLE
	}

	public String identifier;
	public Behaviour behaviour;
	
	public GLSLExtension(Interval interval, String identifier, Behaviour behaviour) {
		super(interval);
		this.identifier = identifier;
		this.behaviour = behaviour;
	}

}
