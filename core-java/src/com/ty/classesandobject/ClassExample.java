package com.ty.classesandobject;

public class ClassExample {
	// Zero-argument constructor..????//yes..
	public ClassExample() {
		System.out.println("Zero-argument Constructor...");
	}

	// Parameterised constructor; constructor Overloading.
	public ClassExample(String string) {
		System.out.println("Constructor with one String argument...");
	}
	
	// Parameterised constructor; constructor Overloading.
	public ClassExample(String string, int i) {

		System.out.println("Constructor with string and Int parameters");
	}

	// Parameterised constructor; constructor Overloading.
	public ClassExample(int i, String string) {

		System.out.println("Constructor with Int and string parameters");
	}

	public static void main(String[] args) {
		ClassExample classexample1 = new ClassExample();
		ClassExample classexample2 = new ClassExample("Banglore");
		ClassExample classexample3 = new ClassExample("Banglore",1234);
		ClassExample classexample4 = new ClassExample(1234,"Banglore");
	}

}
