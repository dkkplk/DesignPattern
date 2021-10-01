package com.learning.singleton.staticblock;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() throws IOException {

		System.out.println("doing somthing here");
		File.createTempFile(".", ".");
	}

	static
	{
		try 
		{
			instance = new StaticBlockSingleton();
		}
		catch(Exception e)
		{
			System.out.println("Exception occred");
		}
	}
	public StaticBlockSingleton getInstance() {
		return instance;
	}
}
