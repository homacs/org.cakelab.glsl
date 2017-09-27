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
		/** Returns the struct or interface block, which contains this member. */
		Struct getCompoundType();
	}

	
	public static class MemberType extends Type implements Member {
		private Struct struct;

		public MemberType(MemberType that) {
			this(that.struct, that);
		}

		public MemberType(Struct struct, Type type) {
			super(type);
			this.struct = struct;
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

		@Override
		public Struct getCompoundType() {
			return struct;
		}
		
	}

	
	
	public static class MemberVariable extends Variable implements Member {
		private Struct struct;
		public MemberVariable(Struct struct, Type type, String name) {
			super(struct.body, type, name);
			this.struct = struct;
		}
		public MemberVariable(Struct struct, Type type, String name, Qualifiers qualifiers) {
			super(struct.body, type, name, qualifiers);
			this.struct = struct;
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
		public Struct getCompoundType() {
			return struct;
		}
	}

	
	public class Constructor extends Function implements Member {
		public Constructor(Interval interval, Struct struct, ParameterDeclaration[] parameters) {
			super(interval, struct, struct.getName(), parameters);
		}

		@Override
		public Node getNode() {
			return this;
		}

		@Override
		public Struct getCompoundType() {
			return (Struct) super.type;
		}
	}


	
	/** method is a function with a this pointer as implicit first argument */
	public class Method extends Function implements Member {

		private Struct struct;

		public Method(Interval interval, Struct struct, Type returnType, String name, ParameterDeclaration... parameters) {
			super(interval, returnType, name, parameters);
			this.struct = struct;
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

		@Override
		public Struct getCompoundType() {
			return struct;
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
	
	public void addConstructor(Interval interval, ParameterDeclaration ... params) {
		Constructor constructor = new Constructor(interval, this, params);
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
