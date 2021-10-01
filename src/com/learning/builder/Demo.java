package com.learning.builder;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hello = "Hello";
		System.out.println("<p>" + hello + "</p>");
		
		String [] words = {"Hello","World"};
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>\n");
		
		for(String word : words)
		{
			sb.append(String.format("  <ul>%s</ul>\n", word));
		}
		sb.append("</ul>");
		
		System.out.println(sb);
	}

}
