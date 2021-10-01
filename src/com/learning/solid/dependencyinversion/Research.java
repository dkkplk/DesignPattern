package com.learning.solid.dependencyinversion;

import java.util.List;

import org.javatuples.Triplet;

class Research {

	/*public Research(Relationships relationships)
	{
		List<Triplet<Person,Relationship,Person>> relations = relationships.getRelations();
		relations.stream()
		.filter(x -> x.getValue0().getName().equals("Prabhu")
				&& x.getValue1() == Relationship.PARENT)
		.forEach(ch -> System.out.println(
				"Prabhu has child called " + ch.getValue2().getName()
				));
	}*/
	
	public Research(RelationshipBrowser relationshipBrowser)
	{
		List<Person> children = relationshipBrowser.findAllChilderenOf("Prabhu");
		for (Person child : children) {
			System.out.println("Prabhu has child Called " + child.getName());
		}
		
	}
}
