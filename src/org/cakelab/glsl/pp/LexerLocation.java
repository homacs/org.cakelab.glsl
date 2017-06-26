package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;

public class LexerLocation extends Location {

	public LexerLocation(Location that) {
		super(that);
	}

	public LexerLocation(String sourceIdentifier, int pos, int line, int column) {
		super(sourceIdentifier, pos, line, column);
	}

	public LexerLocation(String sourceIdentifier) {
		super(sourceIdentifier);
	}

	void nextLine() {
		pos++;
		line++;
		column = COLUMN_START;
	}
	
	void next() {
		pos++;
		column++;
	}

	void setPosition(int lastConsumedPos) {
		pos = lastConsumedPos;
	}


}
