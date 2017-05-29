package org.cakelab.glsl.ast;

import java.util.ArrayList;

public class Struct extends Type {
	public class Member extends Variable {
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
	
	String name;
	Body body;

	public Struct(Scope parent, String name) {
		super(name);
		this.body = new Body(parent);
		this.name = name; 
	}
	
	public void addMember(Member member) {
		body.members.add(member);
	}
	
}
