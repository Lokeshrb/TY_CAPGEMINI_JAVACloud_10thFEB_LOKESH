package com.ty.methods;

public class MethodCallingClass {

	public static void main(String[] args) {
		AreaCalculator area = new AreaCalculator();
		System.out.println("area of square : "+area.calAreaOfSquare(4));
		System.out.println("area of rectangle : "+area.calAreaOfRectangle(4, 5));
		System.out.println("area of circle : "+area.calAreaOfCirlce(4));
	}

}
