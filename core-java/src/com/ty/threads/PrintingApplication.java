package com.ty.threads;

public class PrintingApplication {
	public void printingDocuments(String document, int numOfCopies) {
		for (int i = 1; i <= numOfCopies; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {  
				e.printStackTrace();
			}
			System.out.println(" >> printing " + document + " # "+ i);
		}
	}
}
