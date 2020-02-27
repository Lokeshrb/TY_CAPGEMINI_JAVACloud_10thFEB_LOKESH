package com.ty.string;

public class StringBufferExample {
	public static void main(String[] args) {
		
  //	StringBuffer stringBuffer1 = "STring buffer";  cannot create stringbuffer value directly.
		//StringBuffer stringBuffer  = new StringBuffer("Some StringBuffer");
		
	// we can assign the value of string  to stringBuffer using below
		String string = "Some STring";
		StringBuffer stringbuffer = new StringBuffer(string);
	//	System.out.println(stringBuffer.getClass());
	//	System.out.println(stringBuffer.length());
		
		String str = "MALAYALAM";
		System.out.println(stringbuffer.length());
		
		stringbuffer.append("Buffer");
		System.out.println(stringbuffer);
		
	//	System.out.println(stringbuffer.reverse());
		
	// replacing the character in string 
		stringbuffer.replace(0, 1,"o");
		System.out.println(stringbuffer);
		
		stringbuffer.insert(5, "ABC");
		System.out.println(stringbuffer);
		
		int index = stringbuffer.indexOf("B");
		System.out.println(index);
		
		stringbuffer.delete(2, 7);
		System.out.println(stringbuffer);
		
		
	}
}
