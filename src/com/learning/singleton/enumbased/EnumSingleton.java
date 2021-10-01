package com.learning.singleton.enumbased;

enum EnumSingleton {

	INSTANCE;
	
	private EnumSingleton() {
		value = 42;
	}
	private int value;

	public int getValue()
	{
		return value;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
}

