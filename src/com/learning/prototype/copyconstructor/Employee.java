package com.learning.prototype.copyconstructor;

public class Employee {
	
	public String name;
	public Address address;
	
	public Employee(String name, Address addres)
	{
		this.name = name;
		this.address = addres;
	}

	
	public Employee(Employee other) {
		// TODO Auto-generated constructor stub
		this(other.name, new Address(other.address));
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

	
}
