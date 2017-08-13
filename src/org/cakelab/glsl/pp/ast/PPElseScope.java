package org.cakelab.glsl.pp.ast;

public class PPElseScope extends PPGroupScope {
	private PPIfScope previous;

	public PPElseScope(PPGroupScope parent, PPIfScope previous) {
		super(parent);
		this.previous = previous;
	}

	@Override
	public boolean visible() {
		return super.visible() && !previous.visible;
	}

	
}
