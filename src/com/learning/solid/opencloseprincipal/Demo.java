package com.learning.solid.opencloseprincipal;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree", Color.GREEN, Size.MEDIUM);
		Product house = new Product("House", Color.BLUE, Size.LARGE);

		List<Product> products = Arrays.asList(apple, tree, house);

		ProductFilter pf = new ProductFilter();

		System.out.println("Green Product (old way)");
		pf.filterByColor(products, Color.GREEN)
					.forEach(p -> System.out.println(
							"-" + p.getName() + " is Green"));

		System.out.println("Green Product (New Way)");
		
		BetterFilter bf = new BetterFilter();
		bf.filter(products, new ColorSpecification(Color.GREEN))
		.forEach(p -> System.out.println("-" + p.getName() + " is Green"));
		
		bf.filter(products, new SizeSpecification(Size.SMALL))
		.forEach(p -> System.out.println("-"+ p.getName() + " is small"));
		
		
		System.out.println("Large and blue filter");
		
		bf.filter(products,new AndSpecification<>(
				new ColorSpecification(Color.BLUE), 
				new SizeSpecification(Size.LARGE)))
		.forEach(p -> System.out.println("-" + p.getName() + " is large and blue"));
	}

}
