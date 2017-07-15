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
	 * The result is returned in a String value.
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
		return new StringConstant(Interval.NONE, result.toString().trim());
		
	}

	public int numParameters() {
		return params.size();
	}

}
