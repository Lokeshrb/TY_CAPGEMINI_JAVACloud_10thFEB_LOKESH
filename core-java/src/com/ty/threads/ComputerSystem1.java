package com.ty.threads;

public class ComputerSystem1 extends Thread{
	PrintingApplication printerApplication;
	
	public ComputerSystem1(PrintingApplication localPrinterMachine) {
		this.printerApplication = localPrinterMachine;
	}
	
	@Override
	public void run() {
		System.out.println(">> Printing from ComputerSystem1...");
		printerApplication.printingDocuments("AnyDocument.pdf", 10);
	}
}
