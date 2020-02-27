package com.ty.loops;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
	
		if (n%2==0) {
			for (int i = 1; i <=n; i++) {
				System.out.println("Number is Even "+n);
			}	
		}
		else {
			System.out.println("Number "+ n +" is Odd ");
		}
		sc.close();	
	}
}
