package com.ty.threads;

public class PrintingValues1 extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing value: " + i);
		}
	}
}
