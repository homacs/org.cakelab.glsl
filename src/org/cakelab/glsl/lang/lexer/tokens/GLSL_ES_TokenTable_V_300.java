package org.cakelab.glsl.lang.lexer.tokens;

import java.util.HashMap;
import java.util.HashSet;

import org.cakelab.glsl.GLSLParser;

public class GLSL_ES_TokenTable_V_300 extends GLSLTokenTable {

	protected GLSL_ES_TokenTable_V_300(GLSLTokenTable V_100) {
		super(300, V_100);
		//
		// apply changes to language token set
		//
		
		move("attribute", language, reserved);
		move("varying", language, reserved);
		
	    language.put("layout", GLSLParser.LAYOUT);

	    language.put("centroid", GLSLParser.CENTROID);
	    language.put("flat", GLSLParser.FLAT);
	    language.put("smooth", GLSLParser.SMOOTH);

	    move("switch", reserved, language, GLSLParser.SWITCH);
	    move("case", reserved, language, GLSLParser.CASE);
	    move("default", reserved, language, GLSLParser.DEFAULT);
	    

	}

	private void move(String token, HashSet<String> source, HashMap<String, Integer> target, int code) {
		source.remove(token);
		target.put(token, code);
	}

}
