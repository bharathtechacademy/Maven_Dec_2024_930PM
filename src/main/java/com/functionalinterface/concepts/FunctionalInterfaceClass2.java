package com.functionalinterface.concepts;

public class FunctionalInterfaceClass2 implements FunctionalInterfaceClass1{

	@Override
	public boolean checkBothAreEqual(int a, int b) {
		boolean status = false;		
		if(a==b) {
			status = true;
		}
		return status;
	}

	public int sum(int a, int b) {
		int c = a+b;
		return c;
		
	}
	
	

}
