package org.cakelab.glsl.ast;

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
	
	public InterfaceBlock(Scope parent, String name) {
		super(parent, name);
	}

	public InterfaceBlock(InterfaceBlock block) {
		super(block);
	}

}
