package com.ty.threads;

public class ComputerSystem2 extends Thread{
	PrintingApplication printerApplication;
	
	public ComputerSystem2(PrintingApplication localPrinterMachine) {
		this.printerApplication = localPrinterMachine;
	}
	
	@Override
	public void run() {
		System.err.println(">> Printing from ComputerSystem2...");
		printerApplication.printingDocuments("SomeOtherDocument.pdf", 10);
	}
}
