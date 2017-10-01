package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.types.Array;
import org.cakelab.glsl.lang.ast.types.CompoundType;
import org.cakelab.glsl.lang.ast.types.CompoundType.Member;
import org.cakelab.glsl.lang.ast.types.Type;

public class FieldSelection extends PostfixExpression {

	protected String identifier;

	public FieldSelection(Expression operand, String identifier, Location end) {
		super(operand, end);
		this.identifier = identifier;
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		// TODO syntax checks outside
		Value compound = operand.eval().value();
		int kind = compound.getType().getKind();
		if (kind == Type.KIND_ARRAY) {
			if (!identifier.equals("length")) {
				// TODO check for syntax error outside
				throw new Error("syntax: undefined member '" + identifier + "' for array type " + compound.getType().getSignature());
			} else {
				// TODO add methods to type
				return new MemberReference(this.interval, compound, Array.DEFAULT_LENGTH_METHOD);
			}
		} 
		else if (kind == Type.KIND_STRUCT) 
		{
			// FIXME: field selections needs CompoundType.getMemberReference() to deal with method groups
			Member member = ((CompoundType)(compound.getType())).getMember(identifier);
			return new MemberReference(this.interval, compound, member);
		}
		return null;
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		PrimaryExpression primary = eval();
		return primary.evaluateType();
	}

}
