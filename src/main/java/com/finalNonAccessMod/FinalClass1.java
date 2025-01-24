package com.finalNonAccessMod;

public  class FinalClass1 {
	
	//final value cannot be modified
	//final method cannot be over-rided
	//final class cannot be extended
	
	double pi = 3.14;
	
	public void changePiValue(double newValue) {
		pi = newValue;
		System.out.println(pi);
	}

}
