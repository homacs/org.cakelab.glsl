package org.cakelab.glsl.lang.ast.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.cakelab.glsl.lang.ast.Function;

/**
 * Type representation of a subroutine function prototype.
 * <p>
 * Subroutine prototypes are used as type of the uniform variable, 
 * which selects the definition of a subroutine out of a set of 
 * available definitions associated with the subroutine prototype.
 * </p>
 * 
 * 
 * @author homac
 *
 */
public class SubroutineType extends Type {
	private Function prototype;
	private ArrayList<Function> definitions = new ArrayList<Function>();

	public SubroutineType(Function f) {
		super(f.getInterval(), f.getName(), Type.KIND_SUBROUTINE, Type.Rank.NON_SCALAR, f.getType().qualifiers);
		this.prototype = f;
	}
	
	public Function getPrototype() {
		return prototype;
	}

	public void addDefinition(Function f) {
		this.definitions.add(f);
	}

	/**
	 * Returns the n-th (index) definition of this subroutine prototype.
	 * @param index
	 * @return
	 */
	public Function getDefinition(int index) {
		return definitions.get(index);
	}

	/**
	 * Returns a list with all definitions associated with this subroutine prototype.
	 * <p>Returned list is immutable</p>
	 * @return
	 */
	public List<Function> getDefinitions() {
		return  Collections.unmodifiableList(definitions);
	}
}
