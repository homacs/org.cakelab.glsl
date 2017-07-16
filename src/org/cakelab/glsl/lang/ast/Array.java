package org.cakelab.glsl.lang.ast;

import java.util.Arrays;

import org.cakelab.glsl.lang.ast.Struct.Method;

public class Array extends Type {
	
	public static class QualifiedArrayImpl extends Array implements QualifiedType {
		private Qualifier[] qualifiers;
		
		public QualifiedArrayImpl(Array type, Qualifier[] qualifiers) {
			super(type);
			if (type instanceof QualifiedType) {
				throw new Error("can't add qualifiers to qualified type.");
			}

			this.qualifiers = qualifiers;
		}

		@Override
		public Qualifier[] qualifiers() {
			return qualifiers;
		}
		
	}

	public static final Method LENGTH = null;
	
	Expression[] dimensions;
	/** type without array specification */
	private Type baseType;
	private Type componentType;
	
	public Array(Type baseType, Expression ... dimensions) {
		super(signature(baseType.signature, dimensions.length), KIND_ARRAY);
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
		super(that.signature, KIND_ARRAY);
		this.baseType = that.baseType;
		this.dimensions = that.dimensions;
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
			componentType = new Array(baseType, Arrays.copyOfRange(dimensions, 1, dimensions.length-1));
		}
		return componentType;
	}

	
}
