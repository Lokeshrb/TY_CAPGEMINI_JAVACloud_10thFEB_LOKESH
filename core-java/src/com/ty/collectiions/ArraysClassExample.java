package com.ty.collectiions;

import java.util.Arrays;

public class ArraysClassExample {
	public static void main(String[] args) {
		int[] intArray = { 34, 456, 21, 45, 98, 345, 0, 476 };
//		for (int i = 0; i < intArray.length; i++) {
//			for (int j = i+1; j < intArray.length; j++) {
//				if (intArray[j]<intArray[i]) {
//					intArray[i] = intArray[i]^intArray[j];
//					intArray[j] = intArray[i]^intArray[j];
//					intArray[i] = intArray[i]^intArray[j];
//				}
//			}
//		}
		
		Arrays.sort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//		System.out.println(intArray.length);
		
		int[] intArray2 = Arrays.copyOf(intArray, 10);
		Arrays.fill(intArray2, 8, 9, 98);
		Arrays.fill(intArray2, 9, 10, 78);

		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		
		System.out.println(intArray.equals(intArray2));
		
		System.out.println(Arrays.equals(intArray, intArray2));
	}
}
