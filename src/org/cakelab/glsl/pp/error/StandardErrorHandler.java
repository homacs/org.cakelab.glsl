package org.cakelab.glsl.pp.error;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.MacroExpandedLocation;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.MacroInvocation;

public class StandardErrorHandler implements ErrorHandler {
	protected ResourceManager resources;

	
	protected void printError(Location origin, String msg) {
		System.err.println(toString(origin) + ": error: " + msg);
	}

	private String toString(Location location) {
		String resource = location.getSourceIdentifier();
		if (resources != null) {
			Resource r = resources.getResourceById(resource);
			if (r != null) resource = r.getPath();
		}
		return resource + ':' + location.getLine() + ':' + location.getColumn();
	}

	protected void printNote(Location origin, String msg) {
		System.out.println(toString(origin) + ": note: " + msg);
	}

	protected void printWarning(Location origin, String msg) {
		System.out.println(toString(origin) + ": warn: " + msg);
	}


	/**
	 * @param location
	 * @param errMsg
	 * @return whether to stop processing or not
	 */
	@Override
	public boolean error(Location location, String errMsg) {
		Location origin = getMacroOrigin(location);
		printError(origin, errMsg);
		handleMacroOrigin(location);
		return true;
	}

	private void handleMacroOrigin(Location location) {
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
	public boolean warning(Location location, String warningMsg) {
		printWarning(getMacroOrigin(location), warningMsg);
		return false;
	}

	@Override
	public boolean error(Node node, String errMsg) {
		return error(node.getStart(), errMsg);
	}

	@Override
	public boolean warning(Interval interval, String message) {
		return warning(interval.getStart(), message);
	}
}
