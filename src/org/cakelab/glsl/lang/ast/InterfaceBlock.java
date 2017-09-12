package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public class InterfaceBlock extends Struct {

	public static class QualifiedInterfaceBlockImpl extends InterfaceBlock implements QualifiedType {

		private Qualifier[] qualifiers;

		public QualifiedInterfaceBlockImpl(InterfaceBlock block, Qualifier[] qualifiers) {
			super(block);
			
			this.qualifiers = qualifiers;
		}

		@Override
		public Qualifier[] qualifiers() {
			return qualifiers;
		}
		
	}
	
	public InterfaceBlock(Interval interval, Scope parent, String name) {
		super(interval, parent, name);
	}

	public InterfaceBlock(InterfaceBlock block) {
		super(block);
	}

}
