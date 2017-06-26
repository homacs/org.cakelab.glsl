package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.lang.ast.Scope;

public class PPElifScope extends PPIfScope {
	private PPIfScope previous;

	public PPElifScope(Scope parent, PPIfScope previous) {
		super(parent);
		this.previous = previous;
		
	}

	@Override
	public boolean visible() {
		return super.visible() && !previous.visible;
	}

	
}
