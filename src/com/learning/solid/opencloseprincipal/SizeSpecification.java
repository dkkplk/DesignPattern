package com.learning.solid.opencloseprincipal;

public class SizeSpecification implements Specification<Product> {

	private Size size;

	public SizeSpecification(Size size) {
		super();
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product iteam) {
		// TODO Auto-generated method stub
		return iteam.getSize() == size;
	}

}
