package com.creatio.crm.language.basics;

public class ConstructorClass1 {
	
	int empId = 0;	
	String department ="";
	
	ConstructorClass1(int id){
		empId = id;
	}

	ConstructorClass1(String value){
		department = value;
	}
	
	ConstructorClass1(int id, String dept){
		empId = id;
		department = dept;
	}
	
	public void printEmpDetails(String empName) {
		System.out.println(empId);
		System.out.println(empName);
	}

	public void printEmpAddress(String empAddress) {
		System.out.println(empId);
		System.out.println(empAddress);
	}

	public void printEmpMarks(int empMarks) {
		System.out.println(empId);
		System.out.println(empMarks);
	}
	
	public void printEmpNameAndDept(String empname) {
		System.out.println(empname);
		System.out.println(department);
	}
	
	public void printEmpRoleAndDept(String empRole) {
		System.out.println(empRole);
		System.out.println(department);
	}

}
