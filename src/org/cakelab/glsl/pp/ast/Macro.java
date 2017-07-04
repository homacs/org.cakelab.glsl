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
	
	public String getName() {
		return name;
	}
	
	
	/**
	 * Macro invocation.
	 * 
	 * Macro executes only (1, ##) concatenation, (2, #) stringify expressions,
	 * (3) replaces macro parameters with given values and (4) forwards text sections.
	 * 
	 * The result is returned in a String value, which has to be macro expanded again.
	 * 
	 * @param args
	 * @return
	 * @throws EvaluationException 
	 */
	public Value call(Value[] args) throws EvaluationException {
		// TODO [1] check number of macro arguments
		// assign values to parameters
		
		if (args != null) for (int i = 0; i < args.length; i++) {
			Value arg = args[i];
			if (arg.getValue() instanceof String) {
				params.get(i).setValue(arg.getValue().toString());
			} else {
				throw new Error("internal error: argument expected to be string");
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
		return new StringConstant(Interval.NONE, result.toString());
		
	}

}
