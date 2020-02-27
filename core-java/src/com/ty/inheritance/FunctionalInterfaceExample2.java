package com.ty.inheritance;
@FunctionalInterface
public interface FunctionalInterfaceExample2 {
	public int add(int i,int j);
	
	public static void print() {
		System.out.println("static method in FunctionalInterfaceExample2");
	}
	
	default void messageDisplay() {
		System.out.println("default method in FunctionalInterfaceExample2");
	}
}
