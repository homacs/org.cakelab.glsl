package org.cakelab.glsl.pp.ast;

import java.util.List;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;
import org.cakelab.glsl.pp.MacroExpandedLocation;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class Macro extends NodeImpl {
	String name;
	private List<MacroParameter> params;
	private NodeList<Node> replacement_list;

	public Macro(String macroName, List<MacroParameter> params, Interval interval) {
		super(interval);
		this.name = macroName;
		this.params = params;
	}

	public Macro(String name, Interval interval) {
		this(name, null, interval);
	}
	
	/**
	 * Macros having the same signature and expansion list may be redefined.
	 * This method compares two macros in this regard.
	 * 
	 * @param that
	 * @return
	 */
	public boolean equals(Macro that) {
		if (!this.name.equals(that.name)) return false;
		
		
		if (this.params == null) {
			if (that.params != null) return false;
		} else if (that.params == null) {
			return false;
		} else {
			if (this.params.size() != that.params.size()) return false;
			for (int i = 0; i < params.size(); i++) {
				if (!this.params.get(i).same(that.params.get(i))) return false;
			}
		}
		
		if (this.replacement_list == null) {
			return (that.replacement_list == null);
		} else if (that.replacement_list == null) {
			return false;
		} else {
			if (this.replacement_list.size() != that.replacement_list.size()) {
				return false;
			}
			
			for (int i = 0; i < this.replacement_list.size(); i++) {
				if (!same(this.replacement_list.get(i), that.replacement_list.get(i))) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	private boolean same(Node e1, Node e2) {
		if (e1.getClass() != e2.getClass()) {
			return false;
		} else if (e1 instanceof PPConcatExpression) {
			PPConcatExpression c1 = ((PPConcatExpression)e1);
			PPConcatExpression c2 = ((PPConcatExpression)e2);
			return same(c1.getLeftOperand(), c2.getLeftOperand()) && same(c1.getRightOperand(), c2.getRightOperand());
		} else if (e1 instanceof PPStringifyExpression) {
			return same(((PPStringifyExpression)e1).getOperand(), ((PPStringifyExpression)e2).getOperand());
		} else if (e1 instanceof Token) {
			return ((Token)e1).getText().equals(((Token)e2).getText());
		} else if (e1 instanceof MacroParameterReference) {
			return ((MacroParameterReference)e1).same(((MacroParameterReference)e2));
		} else {
			throw new Error("internal error: unhandled case in macro comparison");
		}
	}

	public void setReplacementList(NodeList<Node> replacement_list) {
		this.replacement_list = replacement_list;
		
		if (replacement_list != null && replacement_list.size() > 0) {
			super.interval.setEnd(replacement_list.get(replacement_list.size()-1).getEnd());
		}
	}
	

	public MacroParameter getParameter(String identifier) {
		if (params == null) return null;
		for (MacroParameter p : params) {
			if (identifier.equals(p.getName())) {
				return p;
			}
		}
		return null;
	}
	
	public boolean isFunctionMacro() {
		// a function macro can have an empty parameter list.
		// a non-existing parameter list indicates an object like macro.
		return params != null;
	}

	public boolean hasVarArgs() {
		return isFunctionMacro() && params.size() > 0 && params.get(params.size()-1).getName().equals(MacroParameter.__VA_ARGS__);
	}

	public String getName() {
		return name;
	}
	
	
	/**
	 * Macro invocation -> expansion.
	 * <p>
	 * Macro (1) replaces macro parameters with given values, (2) inserts text sections
	 * (3) applies concatenation (##) and (4) stringify (#) expressions.
	 * </p>
	 * The result is returned in a Text value.
	 * 
	 * @param args
	 * @return
	 * @throws EvaluationException 
	 */
	public TokenList call(MacroInvocation invocation, TokenList[] args) throws EvaluationException {
		// TODO [6] check if we still need to check number of macro arguments
		
		
		assignArguments(args);

		
		TokenList result = new TokenList();
		
		// execute concat and stringify expressions
		// concatenate results in a string
		if (replacement_list != null) {
			for (Node replacement : replacement_list) {
				if (replacement instanceof Token) {
					result.add(((Token)replacement));
				} else if (replacement instanceof PPExpression) {
					((PPExpression)replacement).eval(result);
				}
			}
		}
		
		result.trim();
		
		return createMacroExpandedCopy(invocation, result);
		
	}
	
	private TokenList createMacroExpandedCopy(MacroInvocation invocation, TokenList result) {
		TokenList copy = new TokenList(result.size());
		for (Token t : result) {
			Token clone = t.clone();
			createMacroExpandedLocation(invocation, clone);
			copy.add(clone);
		}
		return copy;
	}

	private void createMacroExpandedLocation(MacroInvocation invocation, Token clone) {
		MacroExpandedLocation start = new MacroExpandedLocation(invocation, clone.getStart());
		MacroExpandedLocation end = new MacroExpandedLocation(invocation, clone.getEnd());
		clone.setInterval(new Interval(start, end));
	}

	private void assignArguments(TokenList[] args) {
		if (args != null) for (int i = 0; i < args.length; i++) {
			TokenList arg = args[i];
			params.get(i).setValue(arg);
		}
	}

	public int numParameters() {
		return params.size();
	}


}
