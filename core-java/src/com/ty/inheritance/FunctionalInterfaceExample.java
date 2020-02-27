package com.ty.inheritance;
@FunctionalInterface
public interface FunctionalInterfaceExample {
	public void showMessage();
	
	public static void printMessage() {
		System.out.println("static method in FunctionalInterfaceExample");
	}
	
	default void displayMessage() {
		System.out.println("default method in FunctionalInterfaceExample");
	}
}	
