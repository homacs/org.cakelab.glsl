package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;

import org.cakelab.glsl.lang.EvaluationException;

public class ExpressionList extends Expression {
	ArrayList<Expression> list;

	public ExpressionList(ArrayList<Expression> list) {
		super(list.get(0).getStart(), list.get(list.size()-1).getEnd());
		this.list = list;
	}

	@Override
	public Object eval() throws EvaluationException {
		Expression result = null;
		for (Expression expr : list) {
			result = (Expression) expr.eval();
		}
		if (result == null) throw new Error("internal error: expression list without expressions");
		
		return result;
	}
	
}
