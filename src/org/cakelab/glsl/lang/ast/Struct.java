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

	public static interface Member {
		String getSignature();
		Node getNode();
		String getName();
		Type getType();
	}

	
	public static class MemberType extends Type implements Member {
		public MemberType(Type type) {
			super(type);
		}

		@Override
		public Node getNode() {
			return this;
		}

		@Override
		public Type getType() {
			return this;
		}
		
	}

	
	
	public static class MemberVariable extends Variable implements Member {
		public MemberVariable(Type type, String name) {
			super(type, name);
		}
		public MemberVariable(Type type, String name, Qualifier ...qualifiers) {
			super(type, name, qualifiers);
		}
		@Override
		public Node getNode() {
			return this;
		}
		@Override
		public String getName() {
			return super.getName();
		}
	}

	/** method is a function with a this pointer as implicit first argument */
	public class Method extends Function implements Member {

		public Method(Type type, String name, ParameterDeclaration... parameters) {
			super(type, name, parameters);
		}

		public Value call(Value _this, Value[] args) {
			// TODO [interpreter]
			throw new Error("not yet implemented");
		}
		
		@Override
		public Node getNode() {
			return this;
		}
		@Override
		public String getName() {
			return super.getName();
		}

		@Override
		public Type getType() {
			return super.getType();
		}
		
		
	}

	
	public static class Body extends Scope {
		// FIXME: Struct body unfinished: it is supposed to translate declarations into member declarations
		ArrayList<Member> members = new ArrayList<Member>();
		
		public Body(Scope parent) {
			super(parent);
		}

		public void addMember(Member member) {
			members.add(member);
			if (member instanceof Method) {
				super.addFunction(((Method)member));
			} else if (member instanceof MemberVariable){
				super.addVariable(member.getName(), (Variable) member);
			} else if (member instanceof Type) {
				super.addType(member.getName(), (Type) member);
			} else {
				throw new Error("internal error: unrecognized kind of member in struct");
			}
		}

		public Member getMember(String identifier) {
			Member m = (Member) getFunction(identifier);
			if (m != null) return m;
			m = (Member) super.getType(identifier);
			if (m != null) return m;
			return (Member) super.getVariable(identifier);
		}
		
		public ArrayList<Member> getMembers() {
			return members;
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
		body.addMember(member);
	}
	public Member getMember(String identifier) {
		return body.getMember(identifier);
	}
}
