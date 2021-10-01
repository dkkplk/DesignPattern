package com.learning.prototype.copyconstructor;

public class Demo {
	
	public static void main(String[] args) {
	
		Employee john = new Employee("john",new Address("Test1","Test2","Test3"));
	
		Employee chris = new Employee(john);
		chris.name = "Chris";
		System.out.println(john);
		System.out.println(chris);
	}
	
}
