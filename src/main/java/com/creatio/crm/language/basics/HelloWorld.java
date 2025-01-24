package com.creatio.crm.language.basics;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] alex) {	
		

		//Print the data and ends with new line
		System.out.println("Hello World"); //sysout+space
		
		//Print the data and stay on same line
		System.out.print("Hello"); 
		System.out.print(" World");
		System.out.println();
		
		//Print statements to print with specific format 
		System.out.printf("My Name is %s and My Age is %d and having visa status is %b.%n","Bharath", 32, true);
		
		//Print statements to print explicit format of digits
		System.out.format("Pi value is approx %.2f",3.14159);
		System.out.println();
		
		//Print the char based on ASCII 
		System.out.write(65);
		System.out.println();

		
		//Print the error messages 
		System.err.println("Error while converting ASCII to normal Char");
		
		//Print informational message along with time stamp
		Logger.getLogger("MyLogger").info("Error while converting ASCII to normal Char");
	}

}
