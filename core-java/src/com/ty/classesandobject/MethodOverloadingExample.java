package com.ty.classesandobject;

public class MethodOverloadingExample {

	public static void displayMessage() {
		System.out.println("Public static void displaymessage()...");
	}
	
	public static void displayMessage(String string) {
		System.out.println("Public static void displaymessage(String string)...");
		System.out.println(string);
	}
	
	public void displayMessage(String string,int i) {
		System.out.println("Public static void displaymessage(String string,int i)...");
		System.out.println(string + " "+i);
	}
	
	public void displayMessage(int i,String string) {
		System.out.println("Public static void displaymessage(int i,String string)...");
		System.out.println(i+" "+string);
	}
	public static void main(String[] args) {
		MethodOverloadingExample.displayMessage();
		displayMessage("Banglore");
		MethodOverloadingExample example1 = new MethodOverloadingExample();
		example1.displayMessage("Banglore", 10);
		example1.displayMessage(20, "Manglore");
		
	}

}
