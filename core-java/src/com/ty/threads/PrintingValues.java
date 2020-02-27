package com.ty.threads;

public class PrintingValues {
	
	public static void main(String[] args) {
		System.out.println("++++++++Application Started++++++++");
//		new PrintingValues1().start();
//		new PrintingValues2().start();
		
		PrintingValues1 printingValues1 = new PrintingValues1();
		
		try {
			printingValues1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		printingValues1.start();
		
		Thread thread = new Thread(new PrintingValues2());
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();
		
		try {
			thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("++++++++Application Ended++++++++");

	}
}
