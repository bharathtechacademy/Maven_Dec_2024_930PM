package com.creatio.crm.language.basics;

public class SwitchCaseConditionalStatements {

	public static void main(String[] args) {
		
		
		String env = "prod";
		
		switch (env) {
		
		case "qa" : 
			System.out.println("Launch the application with www.qa.amazon.com");
			System.out.println("Connect the application API with www.qa.api.amazon.com");
			break;
			
		case "dev" : 
			System.out.println("Launch the application with www.dev.amazon.com");
			System.out.println("Connect the application API with www.dev.api.amazon.com");
			break;
			
		case "uat" : 
			System.out.println("Launch the application with www.uat.amazon.com");
			System.out.println("Connect the application API with www.uat.api.amazon.com");
			break;
			
		default: 
			System.out.println("Invalid environment");		
		
		}
		
	

	}

}
