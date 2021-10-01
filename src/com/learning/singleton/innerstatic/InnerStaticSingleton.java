package com.learning.singleton.innerstatic;

public class InnerStaticSingleton {

	private InnerStaticSingleton() {
		// TODO Auto-generated constructor stub
	}

	private static class impl
	{
		private static final InnerStaticSingleton INSTANCE 
			= new InnerStaticSingleton(); 
	}
	
	public static InnerStaticSingleton getInstance() {
		return impl.INSTANCE;
	}
}
