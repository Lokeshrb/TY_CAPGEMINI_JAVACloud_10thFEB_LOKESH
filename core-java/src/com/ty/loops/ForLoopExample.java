package com.ty.loops;

public class ForLoopExample 
{
	public static void main(String[] args)
	{
		System.out.println("*********For Loop-1*********");
		for (int j = 1; j <=10; j++) 
		{
			System.out.println(" "+(j+1)*13);
		}
		System.out.println("*******For Loop-2********");
		int i=0;
		for (; i < 10; i++) {
			System.out.println((i+1)*12);
		}
		
		System.out.println("******For Loop-3*********");
		int k=0;
		for (; k<10; k++) {
			System.out.println((k+1)*14);
		}
	}

}
