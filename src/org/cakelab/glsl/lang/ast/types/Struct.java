package org.cakelab.glsl.lang.ast.types;

import java.util.ArrayList;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Constructor;
import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.Method;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.lang.ast.ParameterDeclaration;
import org.cakelab.glsl.lang.ast.Qualifiers;
import org.cakelab.glsl.lang.ast.Variable;
import org.cakelab.glsl.lang.ast.impl.ScopeImpl;

public class Struct extends Type implements CompoundType {

	// TODO: MemberType does not work with compound types
	public static class MemberType extends Type implements Member {
		private CompoundType struct;

		public MemberType(MemberType that) {
			this(that.struct, that);
		}

		public MemberType(CompoundType struct, Type type) {
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
		public CompoundType getCompoundType() {
			return struct;
		}
		
	}

	
	
	public static class MemberVariable extends Variable implements Member {
		private Struct struct;
		public MemberVariable(Interval interval, Struct struct, Type type, String name) {
			super(interval, struct.body, type, name);
			this.struct = struct;
		}
		public MemberVariable(Interval interval, Struct struct, Type type, String name, Qualifiers qualifiers) {
			super(interval, struct.body, type, name, qualifiers);
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

	
	public class CompoundTypeConstructor extends Constructor implements Member {
		public CompoundTypeConstructor(Interval interval, Struct struct, ParameterDeclaration[] parameters) {
			super(interval, struct, parameters);
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


	
	public static class Body extends ScopeImpl {
		// FIXME: Struct body unfinished: it is supposed to translate declarations into member declarations
		ArrayList<Member> members = new ArrayList<Member>();
		
		public Body(Struct compoundType, IScope parentScope) {
			super(parentScope);
		}

		public void addMember(Member member) {
			members.add(member);
			if (member instanceof Method) {
				super.addFunction(((Method)member));
			} else if (member instanceof Constructor){
				super.addFunction((Constructor) member);
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

	public Struct(Interval interval, IScope parentScope, String name, Qualifiers qualifiers) {
		super(interval, name, KIND_STRUCT, Rank.NON_SCALAR, qualifiers);
		this.body = new Body(this, parentScope);
	}
	
	public Struct(Struct that) {
		super(that);
		this.body = that.body;
	}

	public Struct clone() {
		return new Struct(this);
	}
	
	public Constructor addConstructor(Interval interval, ParameterDeclaration ... params) {
		CompoundTypeConstructor constructor = new CompoundTypeConstructor(interval, this, params);
		addMember(constructor);
		return constructor;
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
		String fqn = "struct " + this.getSignature();
		if (!qualifiers.isEmpty()) {
			fqn = qualifiers.toString() + " " + fqn;
		}
		return fqn;
	}

	@Override
	public Constructor getConstructor(Type[] argumentTypes) {
		Constructor constructor = super.getConstructor(argumentTypes);
		if (constructor == null) {
			constructor = (Constructor) body.getFunction(this.getName(), argumentTypes);
		}
		return constructor;
	}

	
}
