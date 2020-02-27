package com.ty.methods;

public class Methods {

	public static String displayMessage() {
		return "static Methods.displayMessage";
	}
	
	public String printMessage() {
		return "Non-static Methods.printMessage";
	}
	
	int addingTwoIntegers(int i, int j) {
		return i + j;
	}
	
	protected String welcomeMessage() {
		return "Hello World";
	}
	
	private String messageDisplay() {
		return "privateMessageDisplay()";
	}
}
