package com.ty.methods;

public class MethodExample 
{
	//called method...
	public static void displayMessage() {
		System.out.println("Hello World..");
	}
	//calling method...
	public static void main(String[] args) {
		System.out.println("************");
		displayMessage();
		System.out.println("**********");
	}
	
	// we cannot create a method inside another method...
	/*
	 * public void name() { public void name() {
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
}
