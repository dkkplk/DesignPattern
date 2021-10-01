package com.learning.builder2;


public class ComputerBuilder{

	
	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public ComputerBuilder(String hdd, String ram){
		this.HDD=hdd;
		this.RAM=ram;
	}

	public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		return this;
	}

	public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
		return this;
	}
	
	public Computer build(){
		
		Computer computer = new Computer();
		computer.setHDD(this.HDD);
		computer.setRAM(this.RAM);
		computer.setBluetoothEnabled(this.isBluetoothEnabled);
		computer.setGraphicsCardEnabled(this.isGraphicsCardEnabled);
		return computer;
	}

	@Override
	public String toString() {
		return "ComputerBuilder [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
	

}