package com.ty.exception;

import java.util.Scanner;

public class CustomExceptionTester {
	public static void main(String[] args) throws InvalidNumberCustomException  {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number...");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if (number >= 0 && number <= 10) {
			System.out.println(number * 10);
		} else 
			throw new InvalidNumberCustomException("CustomException Message");	
//			System.out.println("some message"); does not print any message after throwing the exception 
	}
	
}
