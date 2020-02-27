package com.ty.classesandobject;
//java.lang package is by default package in java programs the method can be invoked without import.
// system.out.println we no need import of java.io bcuz system.out import printstream class from java.io.

public class ObjectClassMethodExample {
	public static void main(String[] args) {
		ObjectClassMethodExample objectClassMethodExample1 = new ObjectClassMethodExample();
		ObjectClassMethodExample objectClassMethodExample2 = new ObjectClassMethodExample();
		System.out.println(objectClassMethodExample1.getClass());
		System.out.println(objectClassMethodExample1.toString());
		System.out.println(objectClassMethodExample2.toString());
		System.out.println(objectClassMethodExample1.hashCode());
		System.out.println(objectClassMethodExample2.hashCode());
		System.out.println(objectClassMethodExample1.equals(objectClassMethodExample2));
	}
}
