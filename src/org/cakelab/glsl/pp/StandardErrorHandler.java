package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.MacroInvocation;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.error.SyntaxError;

/**
 * Standard error handler implementation which writes errors to
 * stderr and warnings or notes to stdout.
 * 
 * It supports the two modes:
 * <lu>
 * <li>Report and proceed: Default behaviour.</li>
 * <li>Stop on first error: Available through {@link #StandardErrorHandler(boolean)}</li>
 * </lu>
 * 
 * 
 * @author homac
 *
 */
public class StandardErrorHandler implements ErrorHandler {
	protected ResourceManager resources;
	private boolean stopOnFirstError;

	
	public StandardErrorHandler() {
		this(false);
	}
	
	public StandardErrorHandler(boolean stopOnFirstError) {
		this.stopOnFirstError = stopOnFirstError;
	}

	protected void printError(Location origin, String msg) {
		System.err.println(toString(origin) + ": error: " + msg);
	}

	protected void printNote(Location origin, String msg) {
		System.out.println(toString(origin) + ": note: " + msg);
	}

	protected void printWarning(Location origin, String msg) {
		System.out.println(toString(origin) + ": warn: " + msg);
	}

	private String toString(Location location) {
		String resource = location.getSourceIdentifier();
		if (resources != null) {
			Resource r = resources.getResourceById(resource);
			if (r != null) resource = r.getPath();
		}
		return resource + ':' + location.getLine() + ':' + location.getColumn();
	}

	@Override
	public void error(Location location, String errMsg) throws SyntaxError {
		Location origin = getMacroOrigin(location);
		printError(origin, errMsg);
		handleMacroOrigin(location);
		if (stopOnFirstError) throw new SyntaxError(origin, errMsg);
	}


	@Override
	public void error(Node node, String errMsg) throws SyntaxError {
		error(node.getStart(), errMsg);
	}

	@Override
	public void warning(Location location, String warningMsg) throws SyntaxError {
		printWarning(getMacroOrigin(location), warningMsg);
	}

	@Override
	public void warning(Interval interval, String message) throws SyntaxError {
		warning(interval.getStart(), message);
	}
	
	public void warning(Node t, String warningMsg) {
		warning(t.getStart(), warningMsg);
	}


	
	
	protected void handleMacroOrigin(Location location) {
		while (location instanceof MacroExpandedLocation) {
			MacroInvocation invocation = ((MacroExpandedLocation) location).getMacroInvocation();
			location = invocation.getStart();
			Location origin = getMacroOrigin(location);
			printNote(origin, "in expansion of macro ´" + invocation.getMacro().getName() + "´");
		}
	}

	protected Location getMacroOrigin(Location location) {
		if (location instanceof MacroExpandedLocation) {
			MacroExpandedLocation macroLocation = ((MacroExpandedLocation)location);
			MacroInvocation invocation = macroLocation.getMacroInvocation();
			Macro macro = invocation.getMacro();
			Location macroStart = macro.getStart();
			location = macroStart.add(location);
		}
		return location;
	}

	@Override
	public void setResourceManager(ResourceManager resources) {
		this.resources = resources;
	}
}
