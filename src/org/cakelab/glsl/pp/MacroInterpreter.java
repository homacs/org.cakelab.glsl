package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;

public interface MacroInterpreter {

	String macro_expand_argument(Location start, String string);

}
