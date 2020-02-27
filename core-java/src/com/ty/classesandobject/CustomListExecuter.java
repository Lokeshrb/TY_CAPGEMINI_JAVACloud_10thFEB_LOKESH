package com.ty.classesandobject;

import com.ty.collectiions.CustomList;

public class CustomListExecuter {

	public static void main(String[] args) {
		CustomList customList = new CustomList(4);
		customList.add("Banglore");
		customList.add("MAnglore");
		customList.add("25");
//		customList.add(null);
		customList.add("2545");
		customList.add("Delhi");
		

		System.out.println("CustomList size: " + customList.size());
		System.out.println("*******************************");
		
		for (int i = 0; i < customList.size(); i++) {
			System.out.println(customList.get(i));
		}
		System.out.println("*******************************");
		System.out.println("CustomList.contains(25): "+ customList.contains("null"));
		System.out.println("*******************************");
		System.out.println(customList.getIndex("manglore"));
	}
}
