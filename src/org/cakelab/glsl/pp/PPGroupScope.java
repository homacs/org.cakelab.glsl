package org.cakelab.glsl.pp;

import org.cakelab.glsl.lang.ast.Scope;

public class PPGroupScope extends Scope {

	protected boolean visible = true;
	protected PPGroupScope parentGroup;
	
	
	public PPGroupScope(Scope parent) {
		super(parent);
		Scope group;
		for (group = parent; group != null && !(group instanceof PPGroupScope); group = group.getParent());
		parentGroup = (PPGroupScope) group;
	}

	/**
	 * Whether this scope (and all text lines in it)
	 * are visible to the language parser 
	 * (will be forwarded to him). Applies to #if #else etc.
	 * @return
	 */
	public boolean visible() {
		if (parentGroup != null) {
			return parentGroup.visible() && visible;
		} else {
			return visible;
		}
	}

	public PPGroupScope getParentGroup() {
		return parentGroup;
	}
	
}
