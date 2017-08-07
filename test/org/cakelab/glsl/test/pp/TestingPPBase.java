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
import org.cakelab.glsl.pp.Preprocessor;

public class TestingPPBase {

	private static String error;
	private static String warning;
	protected static boolean ignoreWarning = true;
	private static boolean mirrorToStdout = false;

	private static Preprocessor pp;

	private static final OutputStream DEV_NULL = new OutputStream() {
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
	private static class Tee extends OutputStream {
	
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
	
	private static ParserErrorHandler errorHandler = new ParserErrorHandler() {


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

	private static OutputStream output(OutputStream out) {
		if (mirrorToStdout) return new Tee(out, System.out);
		else return out;
	}
	
	public static Preprocessor p(String source, OutputStream out) {
		try {
			error = null;
			warning = null;
			pp = new Preprocessor("0", new ByteArrayInputStream(source.getBytes()), output(out));
			pp.setErrorHandler(errorHandler);
		} catch (Throwable e) {
			// will never happen
			throw new Error(e);
		}
		return pp;
	}

	public static Preprocessor p(String source) {
		try {
			return p(source, DEV_NULL);
		} catch (Throwable e) {
			throw new Error(e);
		}
	}

	public static void assertValid(String source, String result) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		p(source, out).process();
		assertValidPostConditions();
		String output = new String(out.toByteArray());
		if (!output.equals(result)) {
			error("result differs from expected result.\nEXPECTED: '" + result + "'\nRECEIVED: '" + output + "'");
		}
	}

	public static void assertWarning(String source, String warningMessage) {
		ignoreWarning = false;
		p(source).process();
		if (error != null) {
			error("received error instead of warning: " + error);
		} else if (warning == null) {
			error("got no warning, expected: " + warningMessage);
		} else if (!warning.endsWith(warningMessage)) {
			error("expected warning: \"" + warningMessage + "\"\nbut got: \"" + warning + "\"");
		}
		ignoreWarning  = true;
	}
	
	public static void assertError(String source, String errorMessage) {
		p(source).process();
		assertError(errorMessage);
	}
	public static void assertError(String errorMessage) {
		if (error == null) {
			error("expected an error");
		} else if (!error.endsWith(errorMessage)) {
			error("expected error: \"" + errorMessage + "\"\nbut got: \"" + error + "\"");
		}
	}

	public static void assertError(Expression e, String errorMessage) {
		if (!assertInvalidPostConditions()) error("expected an error");
		assertError(errorMessage);
	}


	public static void assertValid(String source) {
		p(source).process();
		assertValidPostConditions();
	}

	public static void assertValid(Node expr) {
		assertValid(expr, expr.getClass());
	}
	
	
	public static void assertValid(Node expr, Class<? extends Node> clazz) {
		if (expr == null) error("expected a result");
		else if (clazz.isInstance(expr)) assertValidPostConditions();
		else error("expected an instance of type " + clazz.getSimpleName() + " but got " + expr.getClass().getSimpleName());
	}

	private static boolean assertValidPostConditions() {
		if (warning != null) error("received unexpected warning: " + warning);
		if (error != null) error("received unexpected error: " + error);
		else if (!pp.atEOF()) error("preprocessor not at EOF");
		else return true;
		
		return false;
	}


	public static void assertInvalid(String source) {
		p(source).process();
		if (!assertInvalidPostConditions()) error("expected an error");
	}
	
	public static void assertInvalid(Expression expr) {
		if (expr == null || assertInvalidPostConditions()) return;
		else error("expected an error");
	}

	public static boolean assertInvalidPostConditions() {
		if (error != null || !pp.atEOF()) return true;
		return false;
	}

	public static void assertEval(Expression e, int result, Class<? extends Expression> clazz) {
		assertEval(e, Long.valueOf(result), clazz);
	}
	
	public static void assertEval(Expression e, boolean result, Class<? extends Expression> clazz) {
		assertEval(e, Boolean.valueOf(result), clazz);
	}
	
	public static void assertEval(Expression e, Object result, Class<? extends Expression> clazz) {
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


	
	public static void error(String msg) {
		System.err.println("\n");
		StackTraceElement caller = getCallSite();
		System.err.println(caller.toString() + ": " + msg);
		System.exit(-1);
	}
	
	
	private static StackTraceElement getCallSite() {
		String baseClassNamePrefix = "Testing";
		assert (TestingPPBase.class.getSimpleName().startsWith(baseClassNamePrefix)) : "need to adjust prefix of the base class names to make tests work again";
		
		for (StackTraceElement stackElem : Thread.currentThread().getStackTrace()) {
			String className = stackElem.getClassName().replaceAll("[^\\.]*\\.", "");
			if (!className.equals(Thread.class.getSimpleName())
					&& !className.startsWith(baseClassNamePrefix)) {
				return stackElem;
			}
		}
		return null;
	}

	public static String indent(int depth) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < depth; i++) result.append(' ');
		return result.toString();
	}
	



}
