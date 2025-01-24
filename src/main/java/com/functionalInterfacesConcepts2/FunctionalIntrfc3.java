package com.functionalInterfacesConcepts2;

public class FunctionalIntrfc3 {

	public static void main(String[] args) {
		FunctionalIntrfc1 status = (a, b) -> a == b;
		System.out.println(status.checkBothAreEqual(1, 2));
	}

}
