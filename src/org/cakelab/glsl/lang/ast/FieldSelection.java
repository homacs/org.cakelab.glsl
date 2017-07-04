package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Struct.Member;

public class FieldSelection extends PostfixExpression {

	protected String identifier;

	public FieldSelection(Expression operand, String identifier, Location end) {
		super(operand, end);
		this.identifier = identifier;
	}

	@Override
	public Object eval() throws EvaluationException {
		// TODO syntax checks outside
		Value compound = operand.value();
		int kind = compound.getType().kind;
		if (kind == Type.ARRAY) {
			if (!identifier.equals("length")) {
				// TODO check for syntax error outside
				throw new Error("syntax: undefined member '" + identifier + "' for array type " + compound.getType().signature);
			} else {
				// TODO add methods to type
				return new MemberReference(this.interval, compound, Array.LENGTH);
			}
		} 
		else if (kind == Type.STRUCT) 
		{
			Member member = ((Struct)compound.getType()).getMember(identifier);
			return new MemberReference(this.interval, compound, member);
		}
		return null;
	}

}
