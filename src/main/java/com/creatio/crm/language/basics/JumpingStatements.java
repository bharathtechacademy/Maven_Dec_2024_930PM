package com.creatio.crm.language.basics;

public class JumpingStatements {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i > 4 && i < 7) {
				//break; //break the loop
				continue; //skip the current iteration
			}
			
			System.out.println(i);
		}
		
		System.out.println("Execution Completed");

	}

}
