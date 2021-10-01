package com.learning.singleton;

public class Demo {

	public static void main(String[] args) {
		BasicSingleton singleton = BasicSingleton.getInstance();
		singleton.setValue(123);
		System.out.println(singleton.getValue());
		BasicSingleton singleton2 = BasicSingleton.getInstance();
		System.out.println(singleton == singleton2);
		System.out.println(singleton2.getValue());
	}

}
