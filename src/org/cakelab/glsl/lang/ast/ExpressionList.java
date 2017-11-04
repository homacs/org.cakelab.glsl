package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.impl.ExpressionImpl;
import org.cakelab.glsl.lang.ast.types.Type;

public class ExpressionList extends ExpressionImpl {
	ArrayList<Expression> list;

	public ExpressionList(ArrayList<Expression> list) {
		super(list.get(0).getStart(), list.get(list.size()-1).getEnd());
		this.list = list;
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		PrimaryExpression result = null;
		for (Expression expr : list) {
			result = expr.eval();
		}
		if (result == null) throw new Error("internal error: expression list without expressions");
		
		return result;
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		return list.get(list.size()-1).evaluateType();
	}

	@Override
	public String getText() {
		if (list.size() == 1) {
			return list.get(1).getText();
		} else {
			StringBuffer result = new StringBuffer();
			for (int i = 0; i < list.size(); i++) {
				result.append(list.get(i).getText());
				if (i+1 < list.size()) result.append(", ");
			}
			
		}
		return null;
	}
	
}
