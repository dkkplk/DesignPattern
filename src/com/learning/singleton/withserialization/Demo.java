package com.learning.singleton.withserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	static void saveToFile(BasicSingleton basicSingleton, String fileName) throws FileNotFoundException, IOException {
		try (FileOutputStream fileOut = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(basicSingleton);
		}
	}

	static BasicSingleton readFromFile(String fileName)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fileIn = new FileInputStream(fileName);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			return (BasicSingleton) in.readObject();
		}

	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		BasicSingleton singleton = BasicSingleton.getInstance();
		singleton.setValue(123);

		String fileName = "singleton.bin";
		saveToFile(singleton, fileName);

		singleton.setValue(222);
		
		BasicSingleton singleton2 = readFromFile(fileName);

		System.out.println(singleton == singleton2);
		System.out.println(singleton.getValue());
		System.out.println(singleton2.getValue());
	}

}
