package com.functionalInterfacesConcepts3;

import java.util.function.BiPredicate;

public class FunctionalInterfaceWithDefaultPredicate {
	
	
	public static void main (String [] args) {
		BiPredicate<Integer, Integer> status = (a,b) -> a.equals(b);
		System.out.println(status.test(2, 1));
	}
}
