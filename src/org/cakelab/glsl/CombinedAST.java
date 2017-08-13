package org.cakelab.glsl;

import java.util.ArrayList;
import java.util.List;

import org.cakelab.glsl.lang.ast.Scope;
import org.cakelab.glsl.lang.ast.Struct;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.pp.ast.PPGroupScope;

public class CombinedAST {
	public interface Filter<T, R> {
		R pass(T obj);
	}

	// TODO [1] implement proper combined ast
	private List<PPGroupScope> ppAST;
	private Scope langAST;

	public CombinedAST(List<PPGroupScope> ppAST, Scope langAST) {
		this.ppAST = ppAST;
		this.langAST = langAST;
	}

	public List<PPGroupScope> getPpAST() {
		return ppAST;
	}

	public Scope getLangAST() {
		return langAST;
	}

	public List<Struct> getStructs() {
		List<Struct> structs = new ArrayList<Struct>();
		getTypes(langAST, new Filter<Type, Struct>() {

			@Override
			public Struct pass(Type type) {
				if (type instanceof Struct) return (Struct)type;
				else return null;
			}
			
		}, structs);
		return structs;
	}

	private <R extends Type> void getTypes(Scope scope, Filter<Type, R> filter, List<R> result) {
		for (Type type : scope.getTypes()) {
			R passed = filter.pass(type);
			if (passed != null) result.add(passed);
		}
		for (Scope s : scope.getChildren()) {
			getTypes(s, filter, result);
		}
	}

}
