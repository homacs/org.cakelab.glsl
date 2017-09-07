package org.cakelab.glsl.pp.parser;

import java.util.ArrayList;

import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.ast.Pragma;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.parser.pragmas.IgnoredPragmaParser;
import org.cakelab.glsl.pp.parser.pragmas.PragmaParser;

public class PragmaParserSet extends Parser {

	@SuppressWarnings("unused")
	private Preprocessor control;
	
	private ArrayList<PragmaParser> parsers = new ArrayList<PragmaParser>();

	private PragmaParser result;

	private IgnoredPragmaParser ignore;
	
	
	public PragmaParserSet(Preprocessor control) {
		super(control.getState());
		ignore = new IgnoredPragmaParser(control);
	}
	
	
	
	@Override
	public boolean parse() {
		// TODO [1] implement pragma
		result = null;
		if (IDENTIFIER("pragma")) {
			while(WHITESPACE());
			
			try {
				for (PragmaParser parser : parsers) {
					if (parser.parse()) {
						result = parser;
						break;
					}
				}
			} catch (Recovery e) {
				// just fall through and parse as ignored pragma
			}
			
			if (result == null) {
				ignore.parse();
				result = ignore;
			}

			while(WHITESPACE());
			
			mandatory_endl();
			
			return true;
		} else {
			return false;
		}
	}
	
	public Pragma getResult() {
		return result.getPragma();
	}



	public void appendPragma(PragmaParser pragmaParser) {
		this.parsers.add(pragmaParser);
	}
	
	public void prependPragma(PragmaParser pragmaParser) {
		this.parsers.add(0, pragmaParser);
	}
	
}
