package com.ty.methods;

public class BasicArithmetic {
	
	public BasicArithmetic(String string) {
		
		System.out.println("BasicArithmetic constructor..");
	}
	
	/**
	 * This method give the sum of given two numbers.
	 * @param i
	 * @param j
	 * @return int i + int j
	 */
	public static int add(int i,int j) {
		return i+j;
		// a method can have only one return statement...
		//multiple return statement are not allowed...
	}
	/**
	 * This method give the diffirence of two numbers.
	 * @param i
	 * @param j
	 * @return int i - int j
	 */
	public static int sub(int i, int j) {
		return i-j;
		
	}
	/**
	 * This method gives division of two given numbers.
	 * @param i 
	 * @param j
	 * @return int i / double j
	 */

	public static double div(int i,double j) {
		return i/j;
	}
	/**
	 * This method gives the multiplication of given two numbers.
	 * @param i
	 * @param j
	 * @return int i * int j
	 */
	public static int mul(int i,int j) {
		return i*j;
	}
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the two numbers..");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		System.out.println("sum : "+add(45,65));
		System.out.println("diffrence : "+sub(67,34));
		System.out.println("result :"+div(15,2));
		System.out.println("result : "+mul(87,6));
	}

}
