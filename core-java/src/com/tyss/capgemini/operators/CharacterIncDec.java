package com.tyss.capgemini.operators;

public class CharacterIncDec {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'a';
		
		System.out.println("value of c1 with post-increment" + c1++);
		System.out.println(c1);
		
		System.out.println("value of c2 with pre-increment "+ ++c2);
		System.out.println(c2);
		
		System.out.println("value of c2 with pre-decrement "+ --c1);
		System.out.println(c1);
		
		c1='A';
		System.out.println("value of c2 with post-decrement "+ c1--);
		System.out.println(c1);
	}

}
