package com.ty.operators;

public class Unary {
	public static void main(String[] args) {
		int i =10;
		boolean isTrue = true;
		 
		int j = 10;
		System.out.println(j);
		System.out.println("value of i pre-increment" + ++i); //pre-increment
		System.out.println(i);
		
		System.out.println("value of i post-increment" + j++);//post-increment
		System.out.println(j);
		
		System.out.println("value of pre-decrement of i is : " + --i);//pre-decrement
		System.out.println(i);
		System.out.println("value of post-decrement of j is : " + j--);//post-decrement
		System.out.println(j);
	}

}
