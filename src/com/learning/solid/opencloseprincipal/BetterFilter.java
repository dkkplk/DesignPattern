package com.learning.solid.opencloseprincipal;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {

	@Override
	public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
		// TODO Auto-generated method stub
		return items.stream().filter( p -> spec.isSatisfied(p));
	}

}
