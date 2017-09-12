package org.cakelab.glsl.pp.tokens;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Node;

/**
 * An identifier can be a language keyword and it may reference a 
 * declaration of a language element or it is an undefined identifier.
 * <p>
 * In preprocessing phase, all identifiers are just undefined 
 * identifiers (unless recognised as MacroReference). Language
 * parsing gains more information about the identifier and adds 
 * it to the token.
 * </p>
 * <p>
 * As a reference, it refers to the declaration of a symbol such as:
 * <ul>
 * <li>data type</li>
 * <li>variable</li>
 * <li>function</li>
 * <li>attribute (of a compound type)</li>
 * <li>method (of a compound type)</li>
 * </ul>
 * <p>
 * In all those cases, the reference ({@link #getReferencedNode()}) points to the 
 * declaration node of this symbol and therefore all available information 
 * about it.
 * </p>
 * <p>
 * Keywords identifiers may or may not reference symbols. For example, 'void'
 * can be interpreted as a data type reference or just a keyword.
 * Method #isKeyword() tells, if an identifier has been recognised as keyword.
 * </p>
 * 
 */
public class TIdentifier extends Token {

	private Node referenced = null;
	private boolean isKeyword = false;
	
	public TIdentifier(Interval interval, String text) {
		super(interval, text);
	}

	public TIdentifier(TIdentifier that) {
		super(that);
	}

	public TIdentifier(String text) {
		super(text);
	}

	@Override
	public Token clone() {
		return new TIdentifier(this);
	}

	public void setReferencedNode(Node referenced) {
		this.referenced = referenced;
	}
	
	public Node getReferencedNode() {
		return referenced;
	}
	
	public void setKeyword(boolean isKeyword) {
		this.isKeyword = isKeyword;
	}
	
	public boolean isKeyword() {
		return isKeyword;
	}
}
