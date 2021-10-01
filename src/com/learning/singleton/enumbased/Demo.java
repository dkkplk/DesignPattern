package com.learning.singleton.enumbased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.learning.singleton.withserialization.BasicSingleton;

public class Demo {

	
	static void saveToFile(EnumSingleton basicSingleton, String fileName) throws FileNotFoundException, IOException {
		try (FileOutputStream fileOut = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(basicSingleton);
		}
	}

	static EnumSingleton readFromFile(String fileName)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fileIn = new FileInputStream(fileName);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			return (EnumSingleton) in.readObject();
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		System.out.println(enumSingleton.getValue());
		enumSingleton.setValue(111);
		System.out.println(enumSingleton.getValue());

	}

}
