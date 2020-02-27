package com.ty.inheritance;

public interface MethodsInterface {
	public void displaymessage();
	public void printmessage();
	public static void showMessage() {
		System.out.println("public static showMessage() of MethodsInterface...");
	}
	
	default void defaultMethodMessage() {
		System.out.println("defaultMethodMessage() of MethodsInterface...");
	}
}
