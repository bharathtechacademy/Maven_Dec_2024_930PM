package com.creatio.crm.language.basics;

public class IfElseConditionalStatements {

	public static void main(String[] args) {
		// if-else conditional statements

		// if(condition)
		// statement
		
		//if one statement added along with condition no curly brackets required
		//if more than one statement you want to execute then curly brackets required

//	if(condition)
//		statement;
//	else
//		statement;

//		if(condition1)
//			statement;
//		else if(condition2)
//			statement;
//		else if(condition3)
//			statement;
//		else
//			statement;

//		if(condition)
//			if(condition)
//				statement;
//			else
//				statement;
//		
//		else
//		statement;

		double percentage = 17.37;

		if (percentage >= 85) {
			System.out.println("You will get IIT");
			if (percentage >= 90) {
				System.out.println("You will get IT");
			} else {
				System.out.println("You will get Mechanical");
			}
		} else if (percentage >= 80 && percentage < 85) {
			System.out.println("You will get NIT");
		} else if (percentage >= 75 && percentage < 80) {
			System.out.println("You will get University");
		} else {
			System.out.println("You will get Normal College");
		}

	}

}
