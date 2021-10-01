package com.learning.solid.liskovesubstitution;

public class Demo {
	
	static void useIt(Rectangle r) {
		
		int width = r.getWidth();
		r.setHight(10);
		//area = width * 10;
		System.out.println("Expected area of " + (width * 10) + ", got "+r.getArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rc = new Rectangle(3,2);
		
		useIt(rc);
		
		Square sq = new Square(5);
		useIt(sq);
		

	}

}
