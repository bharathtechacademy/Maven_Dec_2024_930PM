package com.creatio.crm.language.basics;

public class Class2 {

	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		
		System.out.println(new Class1().name);
		System.out.println(new Class1().empId);
		System.out.println(new Class1().havingVisa);
		obj.printAddress();

	}

}
