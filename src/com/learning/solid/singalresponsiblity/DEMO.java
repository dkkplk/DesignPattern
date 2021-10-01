package com.learning.solid.singalresponsiblity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Journal {

	private final List<String> entries = new ArrayList<>();
	private static int count = 0;

	public void addEntry(String text) 
	{
		entries.add("" + (++count) + ":" + text);
	}
	
	public void removEntry(int index) 
	{
		entries.remove(index);
	}
	
	public void save(String filename) throws FileNotFoundException
	{
	}

	@Override
	public String toString() 
	{
		return String.join(System.lineSeparator(), entries);	
	}
}

class Persisitance
{
	public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {

		if(overwrite || new File(filename).exists())
		{
			try(PrintStream out = new PrintStream(filename))
			{
				out.println(toString());
			}
		}
	}
}


public class DEMO {
	public static void main(String args[]) throws Exception 
	{

		Journal j = new Journal();
		j.addEntry("I am rich");
		j.addEntry("I am Happy");
		
		System.out.println(j);
		
		Persisitance p = new Persisitance();
		String filename = "c:\\temp\\sample.txt";
		p.saveToFile(j, filename, true);
		
		Runtime.getRuntime().exec("notepad.exe" + filename);
	}
}