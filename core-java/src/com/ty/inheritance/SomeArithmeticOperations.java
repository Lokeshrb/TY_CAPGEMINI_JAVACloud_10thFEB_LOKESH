package com.ty.inheritance;

import com.ty.methods.BasicArithmetic;

public class SomeArithmeticOperations extends BasicArithmetic{

	public SomeArithmeticOperations() {
		super("a");
	//	super();
	}

	public static void main(String[] args) {
		
		SomeArithmeticOperations someArithmeticOperations = new SomeArithmeticOperations();
		
		System.out.println("add method of superclass: "+add(45, 87));
		System.out.println("sub method of superclass: "+sub(45, 44));
		System.out.println("mul meyhod of superclass: "+mul(13, 4));
		System.out.println("div method of superclass: "+div(45, 4));
	}
}
