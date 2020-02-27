package com.ty.loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b);
		for (int i = 1; i <=n; i++) 
		{
			int c=0;
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+ b);
		}
		sc.close();
	}

}
