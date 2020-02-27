package com.ty.exception;

public class TryFinally {
	
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} finally {
			System.out.println("Code inside finally block....");
		}
	}
	
}

// finally inside finally is not possible
//try inside try is OK
// try with finally inside the finally is fine
//try catch inside the try is OK
//try catch inside catch is OK
//multiple finally is not possible


//the class should be implementing autocloseable or extending autocloseable
//scanner class implements closable ->closable extends autocloseable