package com.learning.solid.opencloseprincipal;

public class ColorSpecification implements Specification<Product> {

	private Color color;

	public ColorSpecification(Color color) {
		super();
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product iteam) {
		// TODO Auto-generated method stub
		return iteam.getColor() == color;
	}

}
