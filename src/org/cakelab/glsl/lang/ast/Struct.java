package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;

public class Struct extends Type {
	public static class QualifiedStructImpl extends Struct implements QualifiedType {

		private Qualifier[] qualifiers;

		public QualifiedStructImpl(Struct struct, Qualifier[] qualifiers) {
			super(struct);
			this.qualifiers = qualifiers;
		}

		@Override
		public Qualifier[] qualifiers() {
			return qualifiers;
		}

	}


	public static class Member extends Variable {
		public Member(Type type, String name) {
			super(type, name);
		}
		public Member(Type type, String name, Qualifier ...qualifiers) {
			super(type, name, qualifiers);
		}
	}

	
	public static class Body extends Scope {
		ArrayList<Member> members = new ArrayList<Member>();
		
		public Body(Scope parent) {
			super(parent);
		}
	}
	
	Body body;

	public Struct(Scope parent, String name) {
		super(name);
		this.body = new Body(parent);
	}
	
	public Struct(Struct that) {
		super(that);
		this.body = that.body;
	}
	
	
	public void addMember(Member member) {
		body.members.add(member);
	}
	
}
