package com.ty.inheritance;

public class SubClassL1 extends SuperClass{
	
	@Override
	public String print() {
		
		return "some other string";
	}
	public void display() {
		System.out.println("dislay() of subclassL1...");
	}
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		SubClassL1 subClassL1 = new SubClassL1();
		SuperClass subClassL12 = new SubClassL1();//upcasting.
		SubClassL1 subClassL13 = (SubClassL1) subClassL12;//downcasting.
		System.out.println(superClass.print());
		System.out.println(subClassL1.print());
		System.out.println(subClassL12.print());
		System.out.println(subClassL13.print());
		subClassL1.display();
		subClassL13.display();
		
	}
}
