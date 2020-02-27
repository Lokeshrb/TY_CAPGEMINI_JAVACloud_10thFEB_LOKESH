package com.ty.loops;

import java.util.Scanner;

public class PowerOfTwoNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int x = sc.nextInt();
		System.out.println("enter the second number");
		int y = sc.nextInt();
		int power=1;
		
		for (int i = 1; i <=y; i++) 
		{
			power = power*x;
		}
		System.out.println(x+" to the power "+ y +" is = "+power);
		sc.close();
	}

}
