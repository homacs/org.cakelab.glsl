package org.cakelab.glsl.pp.ast;

import java.util.List;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Value;

public class Macro {
	String name;
	private List<MacroParameter> params;
	private List<Expression> replacement_list;

	public Macro(String macroName, List<MacroParameter> params) {
		this.name = macroName;
		this.params = params;
	}

	public Macro(String name) {
		this(name, null);
	}
	
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
	
	
	
	
	
	private boolean same(Expression e1, Expression e2) {
		if (e1.getClass() != e2.getClass()) {
			return false;
		} else if (e1 instanceof PPConcatExpression) {
			PPConcatExpression c1 = ((PPConcatExpression)e1);
			PPConcatExpression c2 = ((PPConcatExpression)e2);
			return same(c1.getLeftOperand(), c2.getLeftOperand()) && same(c1.getRightOperand(), c2.getRightOperand());
		} else if (e1 instanceof PPWhitespace) {
			return true;
		} else if (e1 instanceof PPStringifyExpression) {
			return same(((PPStringifyExpression)e1).getOperand(), ((PPStringifyExpression)e2).getOperand());
		} else if (e1 instanceof Text) {
			return ((Text)e1).same(((Text)e2));
		} else if (e1 instanceof MacroParameterReference) {
			return ((MacroParameterReference)e1).same(((MacroParameterReference)e2));
		} else {
			throw new Error("internal error: unhandled case in macro comparison");
		}
	}

	public void setReplacementList(List<Expression> expressions) {
		// TODO really a list of expressions in macros?
		this.replacement_list = expressions;
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
	public Value call(Value[] args) throws EvaluationException {
		// TODO check if we still need to check number of macro arguments
		
		if (args != null) for (int i = 0; i < args.length; i++) {
			Value arg = args[i];
			if (arg instanceof Text) {
				params.get(i).setValue((Text)arg);
			} else {
				throw new Error("internal error: argument expected to be source code text (instances of Text)");
			}
		}
		
		// execute concat and stringify expressions
		// concatenate results in a string
		StringBuffer result = new StringBuffer();
		if (replacement_list != null) {
			for (Expression replacement : replacement_list) {
				Value v = replacement.eval().value();
				if (v == null || v.getValue() == null) throw new Error("internal error: replacement expression evaluated to null value");
				
				String s = v.getValue().toString();
				result.append(s);
			}
		}
		return new Text(Interval.NONE, result.toString().trim());
		
	}

	public int numParameters() {
		return params.size();
	}

}
