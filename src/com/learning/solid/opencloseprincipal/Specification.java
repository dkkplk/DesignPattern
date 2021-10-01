package com.learning.solid.opencloseprincipal;

public interface Specification<T> {

	boolean isSatisfied(T iteam);
}
