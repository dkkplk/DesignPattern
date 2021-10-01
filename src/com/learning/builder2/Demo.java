package com.learning.builder2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerBuilder cb = new ComputerBuilder("500GB","8GB");
		Computer cp = cb.build();
		System.out.println(cp);
		cb.setBluetoothEnabled(true);
		cb.setGraphicsCardEnabled(true);
		
		System.out.println(cb);
		
	}

}
