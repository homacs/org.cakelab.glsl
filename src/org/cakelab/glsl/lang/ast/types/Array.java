package org.cakelab.glsl.lang.ast.types;

import java.util.Arrays;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Method;
import org.cakelab.glsl.lang.ast.Value;

public class Array extends Type implements CompoundType {

	public static class ArrayLengthMethod extends Method {

		public ArrayLengthMethod(Array array) {
			super(Interval.NONE, array, _int, "length");
		}

		@Override
		public Value call(Value _this, Value[] args) throws EvaluationException {
			Array array = (Array) _this.getType();
			// TODO: array.length() can evaluate on constant expressions only
			return array.dimensions[0].eval().value();
		}

		
	}

	public static Method DEFAULT_LENGTH_METHOD = new ArrayLengthMethod(null);
	
	Expression[] dimensions;
	Method length;
	/** type without array specification */
	private Type baseType;
	private Type componentType;
	
	
	public Array(Interval interval, Type baseType, Expression ... dimensions) {
		super(interval, signature(baseType.getSignature(), dimensions.length), KIND_ARRAY, Rank.NON_SCALAR, baseType.getQualifiers().clone());
		if (baseType instanceof Array) {
			Array that = ((Array)baseType);
			this.baseType = that.baseType;
			this.dimensions = Arrays.copyOf(that.dimensions, dimensions.length);
			for (int i = that.dimensions.length, j = 0; i < dimensions.length; i++, j++) {
				this.dimensions[i] = dimensions[j];
			}
		} else {
			this.baseType = baseType;
			this.dimensions = dimensions;
		}
		length = DEFAULT_LENGTH_METHOD;
	}

	public Array(Array that) {
		super(that.interval, that.getSignature(), KIND_ARRAY, Rank.NON_SCALAR, that.getQualifiers().clone());
		this.baseType = that.baseType;
		this.dimensions = that.dimensions;
		
	}

	public String toString() {
		StringBuffer str = new StringBuffer();
		if (super.hasQualifiers()) {
			str.append(qualifiers.toString()).append(' ');
		}
		return str.append(this.getSignature()).toString();
	}
	
	public Array clone() {
		return new Array(this);
	}
	
	
	public String getName() {
		return baseType.getName();
	}
	
	private static String signature(String name, int dimensions) {
		StringBuffer result = new StringBuffer(name);
		for (int i = 0; i < dimensions; i++) {
			result.append("[]");
		}
		return result.toString();
	}

	public Type getComponentType() {
		if (componentType != null) {
			return componentType;
		} else if (dimensions.length == 1) {
			componentType = baseType;
		} else {
			componentType = new Array(Interval.NONE, baseType, Arrays.copyOfRange(dimensions, 1, dimensions.length-1));
		}
		return componentType;
	}

	@Override
	public void addMember(Member member) {
		throw new Error("not supported");
	}

	@Override
	public Member getMember(String identifier) {
		if (identifier.equals(length.getName())) {
			return length;
		}
		return null;
	}

	
}
