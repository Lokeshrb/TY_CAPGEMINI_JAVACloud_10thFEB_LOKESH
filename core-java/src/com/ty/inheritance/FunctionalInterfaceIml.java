package com.ty.inheritance;

public class FunctionalInterfaceIml implements FunctionalInterfaceExample,FunctionalInterfaceExample2{

	@Override
	public void showMessage() {
		System.out.println("override showMessage() of FunctionalInterfaceExample");
	}

	@Override
	public int add(int i, int j) {

		return i+j;
	}
	public static void main(String[] args) {
		FunctionalInterfaceIml functionalInterfaceIml = new FunctionalInterfaceIml();
		functionalInterfaceIml.showMessage();
		functionalInterfaceIml.displayMessage();
		FunctionalInterfaceExample.printMessage();
		System.out.println(functionalInterfaceIml.add(5, 4));
		
		FunctionalInterfaceExample2.print();
		functionalInterfaceIml.messageDisplay();

	}

	
}
