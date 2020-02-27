package com.ty.string;

public class StringMethodExample {
	public static void main(String[] args) {
		String string1 = "Some String";
		String string2 ="";
		String string3 = "SOmE STrInG";
		
		int length = string1.length();//return type is integer.
		System.out.println("Length of string1 is: "+length);//or
		System.out.println(string1.length());
		System.out.println("isEmpty() of string1: "+string1.isEmpty());
		System.out.println("isEmpty() of string2: "+string2.isEmpty());
		System.out.println("charAt() of string: "+string1.charAt(7));
		System.out.println("charAt() of string: "+string1.charAt(string1.length()-1));
		System.out.println("indexOf() of strin: "+string1.indexOf('n'));
		System.out.println("equals() of string: "+string1.equals(string3));
		System.out.println("equalsIgnoreCase() of string: "+string1.equalsIgnoreCase(string3));
		System.out.println("concat() of string: "+string1.concat(string3));
		System.out.println(string1);
		
		//string value doesn't change that is nothing but the concept of immutable.

		System.out.println(string1.replace('S','G'));
		System.out.println(string1);
		System.out.println("uppercase: "+string1.toUpperCase());
		System.out.println("lowercase: "+string3.toLowerCase());
		System.out.println(string1.substring(6));
		System.out.println(string1.substring(2, 7));
		System.out.println(string1.startsWith("S"));
		System.out.println(string1.endsWith("h"));
	}
}
