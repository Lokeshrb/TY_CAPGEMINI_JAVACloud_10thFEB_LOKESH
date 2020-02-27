package com.ty.cfs;

public class SwitchCaseExample2
{
	public static void main(String[] args) 
	{
		int daynum = 7;
		
		//in switch we can use only integer and string values....
		  // the switch case statement the datatypes like float,double,long are not allowed....
		
		switch (daynum) {
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednsday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("invalid day");
		}
	}

}
