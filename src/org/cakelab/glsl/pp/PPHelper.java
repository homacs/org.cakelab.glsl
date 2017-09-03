package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.error.ExpressionError;
import org.cakelab.glsl.pp.error.SyntaxError;
import org.cakelab.glsl.pp.lexer.ILexer;

public class PPHelper {
	protected PPState state;

	/// TODO [1] implement proper error handling strategy

	
	
	public PPHelper(PPState strategy) {
		this.state = strategy;
	}
	

	public PPHelper() {
	}


	public PPState getState() {
		return state;
	}


	public void setState(PPState strategy) {
		this.state = strategy;
	}

	protected ILexer getLexer() {
		return state.getLexer();
	}

	protected void syntaxError(Location location, String string) throws SyntaxError {
		boolean stop = state.getErrorHandler().error(location, string);
		if (stop) {
			state.getErrorRecoveryHandler().dismiss();
		} else {
			state.getErrorRecoveryHandler().recoverError();
		}
	}

	protected void syntaxError(Node node, String string) throws SyntaxError {
		boolean stop = state.getErrorHandler().error(node, string);
		if (stop) {
			state.getErrorRecoveryHandler().dismiss();
		} else {
			state.getErrorRecoveryHandler().recoverError();
		}
	}

	protected void syntaxError(EvaluationException e) throws SyntaxError {
		if (!(e.getOrigin() instanceof ExpressionError)) {
			// has not yet been reported -> report
			boolean stop = state.getErrorHandler().error(e.getOrigin(), e.getMessage());
			if (stop) {
				state.getErrorRecoveryHandler().dismiss();
			} else {
				state.getErrorRecoveryHandler().recoverError();
			}
		}
	}
	
	protected ExpressionError expressionError(Interval interval, String message) throws SyntaxError {
		syntaxError(interval.getStart(), message);
		return new ExpressionError(interval, message);
	}


	protected boolean syntaxWarning(Location location, String message) {
		boolean stop = state.getErrorHandler().warning(location, message);
		if (stop) {
			state.getErrorRecoveryHandler().dismiss();
		} else {
			state.getErrorRecoveryHandler().recoverWarning();
		}
		return stop;
	}

	protected boolean syntaxWarning(Interval interval, String message) {
		boolean stop = state.getErrorHandler().warning(interval, message);
		if (stop) {
			state.getErrorRecoveryHandler().dismiss();
		} else {
			state.getErrorRecoveryHandler().recoverWarning();
		}
		return stop;
	}


	
	
	
	
}
