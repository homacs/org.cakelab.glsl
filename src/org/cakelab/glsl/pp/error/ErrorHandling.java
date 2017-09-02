package org.cakelab.glsl.pp.error;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Node;

public class ErrorHandling {
	private ErrorHandlingStrategy strategy;

	/// TODO [1] implement proper error handling strategy

	
	
	public ErrorHandling(ErrorHandlingStrategy strategy) {
		this.strategy = strategy;
	}
	

	public ErrorHandlingStrategy getErrorHandlingStrategy() {
		return strategy;
	}


	public void setErrorHandlingStrategy(ErrorHandlingStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * Note: Error handling requires errorHandler and input to be set.
	 */
	protected ErrorHandling() {
		
	}


	protected void syntaxError(Location location, String string) throws SyntaxError {
		boolean stop = strategy.errorHandler.error(location, string);
		if (stop) {
			strategy.errorRecoveryHandler.dismiss();
		} else {
			strategy.errorRecoveryHandler.recoverError();
		}
	}

	protected void syntaxError(Node node, String string) throws SyntaxError {
		boolean stop = strategy.errorHandler.error(node, string);
		if (stop) {
			strategy.errorRecoveryHandler.dismiss();
		} else {
			strategy.errorRecoveryHandler.recoverError();
		}
	}

	protected void syntaxError(EvaluationException e) throws SyntaxError {
		if (!(e.getOrigin() instanceof ExpressionError)) {
			// has not yet been reported -> report
			boolean stop = strategy.errorHandler.error(e.getOrigin(), e.getMessage());
			if (stop) {
				strategy.errorRecoveryHandler.dismiss();
			} else {
				strategy.errorRecoveryHandler.recoverError();
			}
		}
	}
	
	protected ExpressionError expressionError(Interval interval, String message) throws SyntaxError {
		syntaxError(interval.getStart(), message);
		return new ExpressionError(interval, message);
	}


	protected boolean syntaxWarning(Location location, String message) {
		boolean stop = strategy.errorHandler.warning(location, message);
		if (stop) {
			strategy.errorRecoveryHandler.dismiss();
		} else {
			strategy.errorRecoveryHandler.recoverWarning();
		}
		return stop;
	}

	protected boolean syntaxWarning(Interval interval, String message) {
		boolean stop = strategy.errorHandler.warning(interval, message);
		if (stop) {
			strategy.errorRecoveryHandler.dismiss();
		} else {
			strategy.errorRecoveryHandler.recoverWarning();
		}
		return stop;
	}


	
	
	
	
}
