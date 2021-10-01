package com.learning.solid.dependencyinversion;

public class Demo {

	public static void main(String args[]) {

		Person parent = new Person("Prabhu");
		Person child1 = new Person("Govind");
		Person child2 = new Person("Dhanesh");

		Relationships relationships = new Relationships();
		relationships.addParentAndChild(parent, child1);
		relationships.addParentAndChild(parent, child2);

		new Research(relationships);

	}
}
