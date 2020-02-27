package com.ty.cfs;

public class ElseIfExample 
{
	public static void main(String[] args) 
	{
		int num = 18;
		
		if(num<13)
			System.out.println(num+" Not a Teen Number...");
		else if(num>=13 && num<=19)
			System.out.println(num+ " Is a Teen Number...");
		else
			System.out.println(num+" Not a Teen Number...");
	}

}
