package com.ty.abstraction;

public class TesterClass extends AbstractClassExample{

	@Override
	public String displayMessage() {
		return "displayMessage() of MethodsInterface";
	}

	@Override
	String display() {
		return "display() method of AbstractClassExample";
	}

	@Override
	String print() {
		return "print() of AbstractClassExample";
	}

	public static void main(String[] args) {
		AbstractClassExample abstractClassExample = new TesterClass();
		
		System.out.println(abstractClassExample.display());
		System.out.println(abstractClassExample.displayMessage());
		System.out.println(abstractClassExample.print());
		System.out.println(abstractClassExample.printMessage());
	}
	
}
