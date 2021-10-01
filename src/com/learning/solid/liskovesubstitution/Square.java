package com.learning.solid.liskovesubstitution;

public class Square extends Rectangle {

	public Square() {
	}

	public Square(int side) {
		width = hight = side;
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHight(width);
	}
	
	@Override
	public void setHight(int hight) {
		super.setHight(hight);
		super.setWidth(hight);
	}
}
