package com.ty.methods;

public class MethodOverridingClass extends Methods {
	@Override
	public String printMessage() {
		return "non-static MethodOverridingClass.printmessage()...";
	}
	
	//@Override ***** static methods cannot be overriden. ******
	public static String displaymessage() {
		return "static MethodOverridingClass.display()...";
		
	}
	
	@Override
	int addingTwoIntegers(int i, int j) {

		return super.addingTwoIntegers(i, j);
	}
	@Override
	protected String welcomeMessage() {

		return super.welcomeMessage();
	}
	
	public static void main(String[] args) {
		 MethodOverridingClass methodOverridingClass = new MethodOverridingClass();
		 System.out.println(methodOverridingClass.printMessage());
		 System.out.println(Methods.displayMessage());
		 System.out.println(displaymessage());
		 System.out.println(methodOverridingClass.addingTwoIntegers(12, 45));
		 System.out.println(methodOverridingClass.welcomeMessage());
	}
}
