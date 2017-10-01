package org.cakelab.glsl;

import java.util.ArrayList;
import java.util.List;

import org.cakelab.glsl.lang.ast.IScope;
import org.cakelab.glsl.lang.ast.types.Struct;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.pp.ast.PPGroupScope;

public class CombinedAST {
	public interface Filter<T, R> {
		R pass(T obj);
	}

	// TODO [1] implement proper combined ast
	private List<PPGroupScope> ppAST;
	private IScope langAST;

	public CombinedAST(List<PPGroupScope> ppAST, IScope langAST) {
		this.ppAST = ppAST;
		this.langAST = langAST;
	}

	public List<PPGroupScope> getPpAST() {
		return ppAST;
	}

	public IScope getLangAST() {
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

	private <R extends Type> void getTypes(IScope scope, Filter<Type, R> filter, List<R> result) {
		for (Type type : scope.getTypes()) {
			R passed = filter.pass(type);
			if (passed != null) result.add(passed);
		}
		for (IScope s : scope.getChildren()) {
			getTypes(s, filter, result);
		}
	}

}
