package com.learning.builder1;

public class PersonAddressBuilder extends PersonBuilder {
	
	public PersonAddressBuilder(Person person)
	{
		this.person = person;
	}
	
	public PersonAddressBuilder at(String streetAddress)
	{
		person.streetaddress = streetAddress;
		return this;
	}

	public PersonAddressBuilder in(String city)
	{
		person.city = city;
		return this;
	}
	
	public PersonAddressBuilder withPostcode(String postcode)
	{
		person.postcode = postcode;
		return this;
	}
}
