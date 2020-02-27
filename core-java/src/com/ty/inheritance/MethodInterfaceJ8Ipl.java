package com.ty.inheritance;

public class MethodInterfaceJ8Ipl implements MethodsInterface{

	@Override
	public void displaymessage() {
		System.out.println("Overriden displaymessage() of MethodsInterface..");
	}

	@Override
	public void printmessage() {
		System.out.println("Overriden printmessage() of MethodsInterface..");
	}
	public static void main(String[] args) {
		MethodInterfaceJ8Ipl methodInterfaceJ8Ipl = new MethodInterfaceJ8Ipl();
		methodInterfaceJ8Ipl.displaymessage();
		methodInterfaceJ8Ipl.printmessage();
		methodInterfaceJ8Ipl.defaultMethodMessage();
		MethodsInterface.showMessage();
	}
}
