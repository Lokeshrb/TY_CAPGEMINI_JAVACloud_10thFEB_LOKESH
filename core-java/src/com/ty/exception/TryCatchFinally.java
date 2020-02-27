package com.ty.exception;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
//			System.exit(0);    //will not be executed bcuz before line only send it to the catch block.
		} catch (Exception e) {
//  		System.err.println("Exception Caught in the code...");
			System.exit(0);  // finally block will not get executed bcuz of jvm is getting terminated..
		} finally {
			System.out.println("Code will be executed be there any exception or not");
		}
		
		System.out.println("some code...");
	}
}
