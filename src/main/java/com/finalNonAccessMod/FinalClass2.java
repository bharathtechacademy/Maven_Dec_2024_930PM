package com.finalNonAccessMod;

public class FinalClass2 extends FinalClass1 {
	
	public void changePiValue(double newValue) {
		pi = newValue+0.1;
		System.out.println(pi);
	}

	public static void main(String[] args) {		
//		FinalClass2 obj = new FinalClass2();
		FinalClass1 obj = new FinalClass1();
		obj.changePiValue(3.14159);
	}

}
