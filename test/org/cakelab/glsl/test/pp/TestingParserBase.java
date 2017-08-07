package org.cakelab.glsl.test.pp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.ParserErrorHandler;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.Parser;
import org.cakelab.glsl.pp.Preprocessor;

public abstract class TestingParserBase {

	protected String error;
	protected String warning;
	protected boolean ignoreWarning = true;
	protected boolean mirrorToStdout = false;

	protected Parser parser;

	protected final OutputStream DEV_NULL = new OutputStream() {
		@Override
		public void write(int b) throws IOException {
			// -> /dev/null
		}
	};

	/**
	 * Like UNIX tee. Output to two sinks (e.g. stdout and pipe).
	 * @author homac
	 *
	 */
	protected class Tee extends OutputStream {
	
		private PrintStream pipe;
		private OutputStream tee;
	
		public Tee(OutputStream tee, PrintStream pipeOut) {
			this.tee = tee;
			this.pipe = pipeOut;
		}
	
		@Override
		public void write(int b) throws IOException {
			tee.write(b);
			pipe.write(b);
		}
	
	}
	
	protected ParserErrorHandler errorHandler = new ParserErrorHandler() {


		@Override
		public boolean error(Location location, String message) {
			if (error == null && warning == null) error = location.getSourceIdentifier() + ':' + location.getLine() + ':' + location.getColumn() + ": " + message;
			return false;
		}

		@Override
		public boolean warning(Location location, String message) {
			if (warning == null && error == null && !ignoreWarning) warning = location.getSourceIdentifier() + ':' + location.getLine() + ':' + location.getColumn() + ": " + message;
			return false;
		}

		@Override
		public boolean error(Node node, String message) {
			return error(node.getStart(), message);
		}

		@Override
		public boolean warning(Interval interval, String message) {
			return warning(interval.getStart(), message);
		}
		
	};

	protected OutputStream output(OutputStream out) {
		if (mirrorToStdout) return new Tee(out, System.out);
		else return out;
	}
	
	public Parser p(String source, OutputStream out) {
		try {
			error = null;
			warning = null;
			parser = new Preprocessor("0", new ByteArrayInputStream(source.getBytes()), output(out));
			parser.setErrorHandler(errorHandler);
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return parser;
	}

	public Parser p(String source) {
		try {
			return p(source, DEV_NULL);
		} catch (Throwable e) {
			throw new Error(e);
		}
	}

	public void assertValid(String source, String result) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		p(source, out).parse();
		assertValidPostConditions();
		String output = new String(out.toByteArray());
		if (!output.equals(result)) {
			error("result differs from expected result.\nEXPECTED: '" + result + "'\nRECEIVED: '" + output + "'");
		}
	}

	public void assertWarning(String source, String warningMessage) {
		ignoreWarning = false;
		p(source).parse();
		if (error != null) {
			error("received error instead of warning: " + error);
		} else if (warning == null) {
			error("got no warning, expected: " + warningMessage);
		} else if (!warning.endsWith(warningMessage)) {
			error("expected warning: \"" + warningMessage + "\"\nbut got: \"" + warning + "\"");
		}
		ignoreWarning  = true;
	}
	
	public void assertError(String source, String errorMessage) {
		p(source).parse();
		assertError(errorMessage);
	}
	public void assertError(String errorMessage) {
		if (error == null) {
			error("expected an error");
		} else if (!error.endsWith(errorMessage)) {
			error("expected error: \"" + errorMessage + "\"\nbut got: \"" + error + "\"");
		}
	}

	public void assertError(Expression e, String errorMessage) {
		if (!assertInvalidPostConditions()) error("expected an error");
		assertError(errorMessage);
	}


	public void assertValid(String source) {
		p(source).parse();
		assertValidPostConditions();
	}

	public void assertValid(Node expr) {
		assertValid(expr, expr.getClass());
	}
	
	
	public void assertValid(Node expr, Class<? extends Node> clazz) {
		if (expr == null) error("expected a result");
		else if (clazz.isInstance(expr)) assertValidPostConditions();
		else error("expected an instance of type " + clazz.getSimpleName() + " but got " + expr.getClass().getSimpleName());
	}

	protected boolean assertValidPostConditions() {
		if (warning != null) error("received unexpected warning: " + warning);
		if (error != null) error("received unexpected error: " + error);
		else if (!parser.atEOF()) error("preprocessor not at EOF");
		else return true;
		
		return false;
	}


	public void assertInvalid(String source) {
		p(source).parse();
		if (!assertInvalidPostConditions()) error("expected an error");
	}
	
	public void assertInvalid(Expression expr) {
		if (expr == null || assertInvalidPostConditions()) return;
		else error("expected an error");
	}

	public boolean assertInvalidPostConditions() {
		if (error != null || !parser.atEOF()) return true;
		return false;
	}

	public void assertEval(Expression e, int result, Class<? extends Expression> clazz) {
		assertEval(e, Long.valueOf(result), clazz);
	}
	
	public void assertEval(Expression e, boolean result, Class<? extends Expression> clazz) {
		assertEval(e, Boolean.valueOf(result), clazz);
	}
	
	public void assertEval(Expression e, Object result, Class<? extends Expression> clazz) {
		assertValid(e, clazz);
		try {
			Object value = e.eval().value().getValue();
			if (!value.equals(result)) {
				error("result " + value.toString() + " does not equal " + result.toString());
			}
		} catch (EvaluationException ex) {
			error(ex.getMessage());
		}
		
	}


	
	public void error(String msg) {
		System.err.println("\n");
		StackTraceElement caller = getCallSite();
		System.err.println(caller.toString() + ": " + msg);
		System.exit(-1);
	}
	
	
	private StackTraceElement getCallSite() {
		String baseClassNamePrefix = "Testing";
		assert (TestingParserBase.class.getSimpleName().startsWith(baseClassNamePrefix)) : "need to adjust prefix of the base class names to make tests work again";
		
		for (StackTraceElement stackElem : Thread.currentThread().getStackTrace()) {
			String className = stackElem.getClassName().replaceAll("[^\\.]*\\.", "");
			if (!className.equals(Thread.class.getSimpleName())
					&& !className.startsWith(baseClassNamePrefix)) {
				return stackElem;
			}
		}
		return null;
	}

	public String indent(int depth) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < depth; i++) result.append(' ');
		return result.toString();
	}
	



}
