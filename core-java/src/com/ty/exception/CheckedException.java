package com.ty.exception;

import java.io.FileReader;
import java.util.Properties;

public class CheckedException {
	public static void main(String[] args) {
		Properties properties = new Properties();
		
		try {
//			properties.load(new FileReader("application.properties"));
			properties.load(new FileReader("application.properties"));
		} catch (Exception e) {
			System.err.println();
			e.printStackTrace();
		} finally {
			System.out.println("Code in finally block...");
		}
	}
}
