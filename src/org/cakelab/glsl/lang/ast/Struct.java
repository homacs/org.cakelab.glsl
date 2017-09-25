package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;

public class Struct extends Type {

	public static interface Member {
		String toString();
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
		
		public MemberType clone() {
			return new MemberType(this);
		}
		
	}

	
	
	public static class MemberVariable extends Variable implements Member {
		public MemberVariable(Type type, String name) {
			super(type, name);
		}
		public MemberVariable(Type type, String name, Qualifiers qualifiers) {
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

	
	public class Constructor extends Function implements Member {
		public Constructor(Type type, ParameterDeclaration[] parameters) {
			super(type, type.getName(), parameters);
		}

		@Override
		public Node getNode() {
			return this;
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

	
	public static class Body extends ScopeImpl {
		// FIXME: Struct body unfinished: it is supposed to translate declarations into member declarations
		ArrayList<Member> members = new ArrayList<Member>();
		
		public Body(IScope parent) {
			super(parent);
		}

		public void addMember(Member member) {
			members.add(member);
			if (member instanceof Method) {
				super.addFunction(((Method)member));
			} else if (member instanceof MemberVariable){
				super.addVariable((Variable) member);
			} else if (member instanceof Type) {
				super.addType((Type) member);
			} else {
				throw new Error("internal error: unrecognized kind of member in struct");
			}
		}

		public Member getMember(String identifier) {
			Member m = (Member) super.getType(identifier);
			if (m != null) return m;
			return (Member) super.getVariable(identifier);
		}

		public Method getMethod(String name, Type[] parameterTypes) {
			Method m = (Method) getFunction(name, parameterTypes);
			return m;
		}
		
		
		public ArrayList<Member> getMembers() {
			return members;
		}
	}
	
	Body body;

	public Struct(Interval interval, IScope parent, String name, Qualifiers qualifiers) {
		super(interval, name, KIND_STRUCT, qualifiers);
		this.body = new Body(parent);
	}
	
	public Struct(Struct that) {
		super(that);
		this.body = that.body;
	}

	public Struct clone() {
		return new Struct(this);
	}
	
	public void addConstructor(ParameterDeclaration ... params) {
		Constructor constructor = new Constructor(this, params);
		addMember(constructor);
	}
	
	public void addMember(Member member) {
		body.addMember(member);
	}
	public Member getMember(String identifier) {
		return body.getMember(identifier);
	}

	public IScope getBody() {
		return body;
	}
	
	public String toString() {
		String fqn = "struct " + this.signature;
		if (!qualifiers.isEmpty()) {
			fqn = qualifiers.toString() + " " + fqn;
		}
		return fqn;
	}
	
}
