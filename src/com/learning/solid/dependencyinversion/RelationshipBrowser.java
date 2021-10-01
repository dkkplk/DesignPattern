package com.learning.solid.dependencyinversion;

import java.util.List;

public interface RelationshipBrowser {
	
	List<Person> findAllChilderenOf(String name);

}
