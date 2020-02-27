package com.ty.inheritance;

public class InterfacesImplClass implements MethodsInterface,MethodInterface2{

	@Override
	public void messageDisplay() {
		System.out.println("Overriden messageDisplay() of MethodsInterface2..");
	}

	@Override
	public void displaymessage() {
		System.out.println("Overriden displaymessage() of MethodsInterface..");
		
	}

	@Override
	public void printmessage() {
		System.out.println("Overriden printmessage() of MethodInterface..");
		
	}
	
	public static void main(String[] args) {
//		one way of creating the object for interface. And accessing them.
		MethodsInterface methodsInterface = new InterfacesImplClass();
		methodsInterface.displaymessage();
		methodsInterface.printmessage();
		
		MethodInterface2 methodInterface2 = new InterfacesImplClass();
		methodInterface2.messageDisplay();
		
		System.out.println();
		
//		Second way of creating the object for interface. And accessing them.		
		InterfacesImplClass interfacesImplClass = new InterfacesImplClass();
		interfacesImplClass.displaymessage();
		interfacesImplClass.printmessage();
		interfacesImplClass.messageDisplay();
	}
	
}
