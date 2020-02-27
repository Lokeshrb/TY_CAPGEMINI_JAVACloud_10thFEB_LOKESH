package com.ty.inheritance;

import com.ty.methods.BasicArithmetic;

public class DifferentPackageMethodExample extends BasicArithmetic{
	public DifferentPackageMethodExample(String string) {
		super(string);
	}

	public static void main(String[] args) {
	
		DifferentPackageMethodExample differentPackageMethodExample = new DifferentPackageMethodExample(null);
		System.out.println(differentPackageMethodExample.toString());
		System.out.println(differentPackageMethodExample.hashCode());
		System.out.println(differentPackageMethodExample.getClass());
	
		System.out.println("add method of superclass: "+add(8,9));
		System.out.println("sub method of superclass: "+sub(45,16));
		System.out.println("mul method of superclass: "+mul(45,7));
		System.out.println("div method of superclass: "+div(5,13));
	}
}
