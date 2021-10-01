package com.learning.solid.interfacesegrigation;

public class MultiFunctionalMachine implements MultiFunctionDevice {

	private Printer printer;
	private Scanner scanner;

	public MultiFunctionalMachine(Printer printer, Scanner scanner) {
		super();
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void print(Document d) {
		// TODO Auto-generated method stub
		printer.print(d);
	}

	@Override
	public void scan(Document d) {
		// TODO Auto-generated method stub
		scanner.scan(d);
	}

}
