package com.ty.threads;

public class PrintingValues2 implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.err.println("Printing value: " + i);
		}
	}
}
