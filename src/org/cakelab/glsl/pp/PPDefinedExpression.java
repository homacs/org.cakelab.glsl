package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.PrefixExpression;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Value;

public class PPDefinedExpression extends PrefixExpression {

	public PPDefinedExpression(Location start, Expression operand) {
		super(start, operand);
	}

	@Override
	public Object eval() throws EvaluationException {
		Object result = operand.eval();
		if (result instanceof MacroReference) {
			return new Value(this.interval, Type._bool, true);
		} else {
			return new Value(this.interval, Type._bool, false);
		}
	}

}
