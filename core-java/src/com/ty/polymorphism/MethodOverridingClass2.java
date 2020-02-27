package com.ty.polymorphism;

public class MethodOverridingClass2 implements MethodsInterface{

	@Override
	public String displayMessage() {
		return "Overriden displayMessage() of MethodInterface from MethodOverridingClass2";
	}

	@Override
	public String printMessage() {
		return "Overriden printMessage() of MethodInterface from MethodOverridingClass2";
	}

}
