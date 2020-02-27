package com.ty.collectiions;

public class ArrayExample {
	public static void main(String[] args) {
		
		int[] intArray1 = new int[6];
		int[] intArray2 = {10,20,30,40,50,60};
		
//		int intArray2[] = new int[6];   //NOT the proper way of creating an array.

		intArray1[0] = 1;
		intArray1[1] = 2;
		intArray1[2] = 3;
		intArray1[3] = 4;
		intArray1[4] = 5;
		intArray1[5] = 'A';
//		intArray1[5] = Integer.parseInt("L"); // It won't convert the string or char to integer, As it convert the number
//		intArray1[5] = Integer.parseInt("123"); //  or integer value present inside the string into integer value.

		for (int i = 0; i < intArray1.length; i++) {
			System.out.println("Element at index: " + i + " = " + intArray1[i]);
		}
		
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println("Element at index: " + i + " = " + intArray2[i]);
		}
		
		for (int i : intArray2) {
			System.out.print(i+" ");
		}

	}
}
