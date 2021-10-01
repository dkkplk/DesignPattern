package com.learning.prototype;

import java.util.Arrays;

public class Person implements Cloneable {
	
	public String [] names;
	public Address address;
	
	public Person(String[] names, Address address)
	{
		this.names = names;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [names=" + Arrays.toString(names) + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Person(names.clone(), (Address) address.clone());
	}
	
	

}
