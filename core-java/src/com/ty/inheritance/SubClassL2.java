package com.ty.inheritance;

public class SubClassL2 extends SubClassL1{
	@Override
	public void display() {

		super.display();
		System.out.println("display() of SubclassL2...");
	}
	
	@Override
	public String print() {
		System.out.println("overriden print() of superclass in subclassL2");
		return super.print();
	}
	
	{
	   super.i=2;
	}
	
	public static void main(String[] args) {
		SubClassL2 subClassL2 = new SubClassL2();
		subClassL2.display();
		System.out.println(subClassL2.print());
		System.out.println("int i of Superclass "+subClassL2.i);
	}
}
