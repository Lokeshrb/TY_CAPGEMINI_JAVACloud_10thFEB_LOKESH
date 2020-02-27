package com.ty.datatypesandvariable;

public class VariablesExample {
	
	static byte sGByte;
	static short sGShort;
	static int sGInt;
	static long sGLong;
	static float sGFloat;
	static double sGDouble;
	static char sGChar;
	static boolean sGIsTrue;
	static String sGString;
	public static void main(String[] args) {
		byte lByte = 5;
		short lShort = 4;
		int lInt = 56;
		long lLong = 45454585485l;
		float lFloat = 10.5f;
		double lDouble = 12.25;
		char lChar = 'L';
		boolean lIsTrue = true;
		String lString = "Banglore";

		System.out.println("*****  Global Variables  *******");
	
		System.out.println(sGByte);
		System.out.println(sGShort);
		System.out.println(sGInt);
		System.out.println(sGLong);
		System.out.println(sGFloat);
		System.out.println(sGDouble);
		System.out.println(sGChar);
		System.out.println(sGIsTrue);
		System.out.println(sGString);
		
		System.out.println("***  Local Variables ******");

		System.out.println(lByte);
		System.out.println(lShort);
		System.out.println(lInt);
		System.out.println(lLong);
		System.out.println(lFloat);
		System.out.println(lDouble);
		System.out.println(lChar);
		System.out.println(lIsTrue);
		System.out.println(lString);
	}
}
