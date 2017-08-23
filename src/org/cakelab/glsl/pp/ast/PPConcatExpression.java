package org.cakelab.glsl.pp.ast;

import java.util.List;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.MacroInterpreter;
import org.cakelab.glsl.pp.tokens.Token;

public class PPConcatExpression extends PPExpression {

	private Node left;
	private Node right;
	private MacroInterpreter interpreter;

	public PPConcatExpression(MacroInterpreter interpreter, Interval interval, Node left, Node right) {
		super(interval);
		this.interpreter = interpreter;
		this.left = left;
		this.right = right;
	}

	public void eval(List<Token> result) throws EvaluationException {
		Token leftToken = null;
		Token rightToken = null;
		int size = result.size();
		eval(left, result);
		int index = -1;
		if (result.size() > size) {
			size = result.size();
			index = size-1;
			leftToken = result.get(index);
		}

		eval(right, result);
		if (result.size() > size) {
			rightToken = result.get(size);
		}
		
		if (leftToken != null && rightToken != null) {
			Token joined = interpreter.macro_join_tokens(leftToken, rightToken);
		
			// joined token refers to the start of the left parameter and end of the right parameter in
			// the expansion list. 
			joined.setInterval(new Interval(left.getStart(), right.getEnd()));
			
			result.remove(index); // remove left token
			result.set(index, joined); // replace right token with joined token
		}
	}

	public Node getLeftOperand() {
		return left;
	}

	public Node getRightOperand() {
		return right;
	}

	static void eval(Node node, List<Token> result) throws EvaluationException {
		if (node instanceof PPExpression) {
			((PPExpression) node).eval(result);
		} else if (node instanceof Token) {
			result.add(((Token)node));
		} else {
			throw new Error("internal error: unexpected object type in expansion list");
		}
	}


}
