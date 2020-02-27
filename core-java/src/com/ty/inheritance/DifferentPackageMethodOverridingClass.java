package com.ty.inheritance;

import com.ty.methods.Methods;

/**
 * visibility -> high -> Public						security -> low
 * 		|				 protected							|	
 * 		|				 package-level/default				|
 * 		|	  -> low ->	 private					highly secured..	
 * 
 *
 */

public class DifferentPackageMethodOverridingClass extends Methods{
	@Override
	public String printMessage() {
		
		return "Overriden DifferentPackageMethodOverridingClass.printmesage";
	}
	
	@Override
	protected String welcomeMessage() {

		return "DifferentPackageMethodOverridingClass.welcomemessage";
	}
	public static void main(String[] args) {
		DifferentPackageMethodOverridingClass differentPackageMethodOverridingClass = 
				new DifferentPackageMethodOverridingClass();
		System.out.println(differentPackageMethodOverridingClass.printMessage());
		System.out.println(differentPackageMethodOverridingClass.welcomeMessage());
	}
}
