package com.learning.solid.liskovesubstitution;

public class Rectangle {
	
	protected int hight;
	protected int width;
	
	public Rectangle() {}
	

	public Rectangle(int hight, int width) {
		this.hight = hight;
		this.width = width;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea()
	{
		return hight*width;
	}
	@Override
	public String toString() {
		return "Rectangle [hight=" + hight + ", width=" + width + "]";
	}
	
	

}
