package com.learning.solid.opencloseprincipal;

public class AndSpecification<T> implements Specification<T>{

	private Specification<T> first,second;
	
	
	public AndSpecification(Specification<T> first, Specification<T> second) {
		super();
		this.first = first;
		this.second = second;
	}


	@Override
	public boolean isSatisfied(T iteam) {
		// TODO Auto-generated method stub
		return first.isSatisfied(iteam) && second.isSatisfied(iteam);
	}

}
