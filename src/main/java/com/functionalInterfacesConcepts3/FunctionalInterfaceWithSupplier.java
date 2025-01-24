package com.functionalInterfacesConcepts3;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class FunctionalInterfaceWithSupplier {

	public static void main(String[] args) {
//		FunctionalInterfaceWithSupplier obj = new FunctionalInterfaceWithSupplier();
//		System.out.println(obj.getTime());
		
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println(supplier.get());
	}
	
	
//	public LocalDateTime getTime() {
//		LocalDateTime time  = LocalDateTime.now();
//		return time;	
//	}

}
