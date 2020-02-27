package com.ty.exception;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		
		
		try(Scanner scanner = new Scanner(System.in)) {
			int i = 10;
			int j = scanner.nextInt();
			System.out.println(i / j);
		} catch (Exception e) {
			System.err.println("Should not  divide number by zero...");
//			System.err.println(e.getMessage());
		}
	}
}
