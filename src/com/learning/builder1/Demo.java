package com.learning.builder1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonBuilder pb = new PersonBuilder();
		Person person = pb
		.lives()
			.at("Nehru Colony")
			.in("Balotra")
			.withPostcode("344022")
		.works()
			.at("Rocket")
			.asA("Software Engineer III")
			.earning(1000000000)
		.build();
		
		System.out.println(person);
		
		
	}

}
