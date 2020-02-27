package com.ty.methods;

public class VaragsInputExample {
	public int add(int... input) {  //Var args is used to create dynamic array.
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("sum: " + new VaragsInputExample().add(1, 2, 544, 6564, 245));
	}

}
