package com.ty.collectiions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		ArrayList<Integer> arrayList = new ArrayList<Integer>(10);

		arrayList.add(12);
		arrayList.add(15);
		arrayList.add(36);
		arrayList.add(42);
		arrayList.add(18);
		arrayList.add(21);
		arrayList.add(25);
		arrayList.add(31);
//		arrayList.add(null);
//		arrayList.add(0,16);
//		arrayList.add(4,56);
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.get(3)); size of array is 2 right now. //exception ArrayIndexOutOfBound.	
		
//		Collections.sort(arrayList);

		System.out.println("ArrayList Size: " + arrayList.size());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println(arrayList);
		Collections.rotate(arrayList, 6);

		for (Integer integer : arrayList) {
			System.out.print(integer + " ");
		}
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println(arrayList);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();
		arrayList.remove(4);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(arrayList.size());
//		boolean isThere = arrayList.contains(23);
		System.out.println("Output of arrayList.contains(31): " + arrayList.contains(31));
		System.out.println("Output of arrayList.contains(23): " + arrayList.contains(23));
		System.out.println("Output of arrayList.contains(a): " + arrayList.contains('a'));
		System.out.println("Output of arrayList.contains(null): " + arrayList.contains(null));
	}
}
