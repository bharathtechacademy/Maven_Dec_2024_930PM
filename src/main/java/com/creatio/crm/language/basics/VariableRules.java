package com.creatio.crm.language.basics;

public class VariableRules {

	public static void main(String[] args) {
		
		String name = "Bharath";
		
		//Rule 1: Identifier can’t be same as reserved words
		//String int = "Bharath";
		
		//Rule 2: Identifier can’t be same as java literal (true, false, null)
		//String true ="Bharath";
		
		//Rule 3: Identifier can’t starts with numbers
		//String 1empName = "Bharath";
		
		//Rule 4: Identifier can’t contain space
		//String emp Name = "Bharath";
		
		//Rule 5: Identifier should not contain special chars
		//String emp@name ="Bharath";
		
		//Rule 6: Identifier/variable should be unique
		//int name =123;
		
		//Rule 7: Identifier/variable is case sensitive
		//String Name = "Amol";
		
		//Rule 8: Identifier/variable should have length between 3 to 15 char 
		//int carNumber = 3344;

	}

}
