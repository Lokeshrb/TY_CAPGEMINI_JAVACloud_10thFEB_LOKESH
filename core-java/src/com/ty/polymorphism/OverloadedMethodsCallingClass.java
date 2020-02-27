package com.ty.polymorphism;

public class OverloadedMethodsCallingClass {
	public static void main(String[] args) {
		OverloadedmethodsClass overloadedmethodsClass = new OverloadedmethodsClass();
		System.out.println("add(int i, int j): "+overloadedmethodsClass.add(4, 5));
		System.out.println("add(int i, int j, int k): "+overloadedmethodsClass.add(4, 5, 6));
		System.out.println("add(int i, double d): "+overloadedmethodsClass.add(4, 5.4));
		System.out.println("add(double d, int i): "+overloadedmethodsClass.add(4.4, 5));
	}
	
	
}
