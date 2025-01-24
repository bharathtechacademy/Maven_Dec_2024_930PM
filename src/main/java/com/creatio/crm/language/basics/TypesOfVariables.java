package com.creatio.crm.language.basics;

public class TypesOfVariables {
	
//	1. Local Variable (Method Level Variable) > The variable declared / initialized inside the method	
//	2. Instance Variable (Class Level Variable) > The variable declared / initialized at class level 
//	3. Global Variable > The variable declared / initialized at class level along with static keyword
	
	String instance = "Anurag";
	
	static String global = "Amit";

	public static void main(String[] args) {
		String local = "Asha"; //Local Variable
		System.out.println(local);
		
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.instance);
		
		System.out.println(global);
	}
	

	

}
