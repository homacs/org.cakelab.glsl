package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.Processor;

/**
 * <pre>
 *   - <em>primary</em>
 * </pre>
 * @author homac
 *
 */
public class NegExpression extends PrefixExpression {

	public NegExpression(Location start, Expression operand) {
		super(start, operand);
	}

	
	@Override
	public PrimaryExpression eval() throws EvaluationException {
		try {
			return Processor.neg(operand.eval().value());
		} catch (ProcessingException e) {
			throw new EvaluationException(this, e);
		}
	}

}
