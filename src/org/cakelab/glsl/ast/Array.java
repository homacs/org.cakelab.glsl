package org.cakelab.glsl.ast;

import java.util.Arrays;

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
	
	Expression[] dimensions;
	private Type baseType;
	
	public Array(Type baseType, Expression ... dimensions) {
		super(signature(baseType.signature, dimensions.length));
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
		super(that.signature);
		this.baseType = that.baseType;
		this.dimensions = that.dimensions;
	}
	
	private static String signature(String name, int dimensions) {
		StringBuffer result = new StringBuffer(name);
		for (int i = 0; i < dimensions; i++) {
			result.append("[]");
		}
		return result.toString();
	}

	
}
