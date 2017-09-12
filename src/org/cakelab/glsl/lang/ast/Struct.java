package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;

import org.cakelab.glsl.Interval;

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

	/** method is a function with a this pointer as implicit first argument */
	public class Method extends Member {
		Function function;

		public Method(Type returnType, Function function) {
			super(returnType, function.name);
			this.function = function;
		}
		public Method(Type returnType, Function function, Qualifier ... qualifiers) {
			super(returnType, function.name, qualifiers);
		}
		public Value call(Value _this, Value[] args) {
			// TODO [interpreter]
			throw new Error("not yet implemented");
		}
		
	}

	
	public static class Body extends Scope {
		// FIXME: this is supposed to translate declarations into member declarations
		ArrayList<Member> members = new ArrayList<Member>();
		
		public Body(Scope parent) {
			super(parent);
		}
	}
	
	Body body;

	public Struct(Interval interval, Scope parent, String name) {
		super(name, KIND_STRUCT);
		this.body = new Body(parent);
	}
	
	public Struct(Struct that) {
		super(that);
		this.body = that.body;
	}
	
	
	public void addMember(Member member) {
		body.members.add(member);
	}
	public Member getMember(String identifier) {
		/// TODO [6] optimise lookup?
		for (Member member : body.members) {
			if (member.name.equals(identifier)) return member;
		}
		return null;
	}
}
