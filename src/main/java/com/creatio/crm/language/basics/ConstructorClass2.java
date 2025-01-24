package com.creatio.crm.language.basics;

public class ConstructorClass2 {

	public static void main(String[] args) {
		
		ConstructorClass1 obj = new ConstructorClass1(1234, "IT");
		
		obj.printEmpDetails("Bharath Reddy");
		obj.printEmpAddress("Hyderabad");
		obj.printEmpMarks(94);
		obj.printEmpNameAndDept("Bharath Reddy");
		obj.printEmpRoleAndDept("QA");
	}

}
