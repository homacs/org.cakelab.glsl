package org.cakelab.glsl;

import java.util.List;

import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.pp.ast.PPGroupScope;

public class CombinedAST {
	// TODO [1] implement proper combined ast
	private List<PPGroupScope> ppAST;
	private Scope langAST;

	public CombinedAST(List<PPGroupScope> ppAST, Scope langAST) {
		this.ppAST = ppAST;
		this.langAST = langAST;
	}

	public List<PPGroupScope> getPpAST() {
		return ppAST;
	}

	public Scope getLangAST() {
		return langAST;
	}

}
