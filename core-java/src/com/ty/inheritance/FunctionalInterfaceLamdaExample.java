package com.ty.inheritance;

public class FunctionalInterfaceLamdaExample {
	
	static String string = "Lambda Expression Example for FunctionalInterfaceExample";
	
	static FunctionalInterfaceExample functionalInterfaceLamdaExample = 
			()->System.out.println(string);
			
	static FunctionalInterfaceExample2 functionalInterfaceExample2 =
			(i,j)->{
				int h = i+j;
				return h;
			};
	
	public static void main(String[] args) {
		functionalInterfaceLamdaExample.displayMessage();
		functionalInterfaceLamdaExample.showMessage();
		
		FunctionalInterfaceExample.printMessage();
		
		System.out.println(functionalInterfaceExample2.add(40, 5));
		functionalInterfaceExample2.messageDisplay();
		
		FunctionalInterfaceExample2.print();
	}
}
