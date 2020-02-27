package com.ty.methods;

public class StaticMethodCallingClass {

	public static void main(String[] args) {
		int sum = BasicArithmetic.add(8,9);
		System.out.println(sum);
		
		System.out.println(BasicArithmetic.sub(9, 5));
		
		System.out.println(BasicArithmetic.mul(9, 6));
		
		System.out.println(BasicArithmetic.div(15, 2));
	}

}
