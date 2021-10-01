package com.learning.prototype;

public class Sample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Person john = new Person(new String[] { "john", "smith" }, new Address("London Road", 123));

		Person jane = (Person) john.clone();
		jane.names[0] = "jane";
		jane.address.houseNumber = 124;

		System.out.println(john+" \n "+ jane );
	}

}
