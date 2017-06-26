package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.lang.ast.Scope;

public class PPElseScope extends PPGroupScope {
	private PPIfScope previous;

	public PPElseScope(Scope parent, PPIfScope previous) {
		super(parent);
		this.previous = previous;
	}

	@Override
	public boolean visible() {
		return super.visible() && !previous.visible;
	}

	
}
