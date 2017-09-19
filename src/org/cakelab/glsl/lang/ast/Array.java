package org.cakelab.glsl.lang.ast;

import java.util.Arrays;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Struct.Method;

public class Array extends Type {
	
	public static final Method LENGTH = null;
	
	Expression[] dimensions;
	/** type without array specification */
	private Type baseType;
	private Type componentType;
	
	public Array(Interval interval, Type baseType, Expression ... dimensions) {
		super(interval, signature(baseType.signature, dimensions.length), KIND_ARRAY, baseType.getQualifiers().clone());
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
	}

	public Array(Array that) {
		super(that.interval, that.signature, KIND_ARRAY, that.getQualifiers().clone());
		this.baseType = that.baseType;
		this.dimensions = that.dimensions;
		
	}

	public String toString() {
		return this.signature;
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

	
}
