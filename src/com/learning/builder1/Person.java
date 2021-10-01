package com.learning.builder1;

public class Person {

	// address
	public String streetaddress, postcode, city;

	// employment
	public String companyName, position;
	public int annualIncome;

	@Override
	public String toString() {
		return "Person [streetaddress=" + streetaddress + ", postcode=" + postcode + ", city=" + city + ", companyName="
				+ companyName + ", position=" + position + ", annualIncome=" + annualIncome + "]";
	}

}
