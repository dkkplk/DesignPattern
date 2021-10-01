package com.learning.solid.liskovesubstitution;

public class RectangleFactory {
	
	public static Rectangle newRectangle(int hight, int width)
	{
		return new Rectangle(hight,width);
		
	}
	
	public static Rectangle newSquare(int side)
	{
		return new Rectangle(side, side);
	}

}
