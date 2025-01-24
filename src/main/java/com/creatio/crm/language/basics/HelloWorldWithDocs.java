package com.creatio.crm.language.basics;

public class HelloWorldWithDocs {
	
	/**
	 * This is a main method added by java. Always JVM execution will begin from here.
	 * This is depending on {@link #master()}
	 * 
	 * 
	 * @param Array of Strings in the form of String [] or String ... (input)
	 * @return It won't return any data . It simply execute the code and stop the execution
	 * @author Bharath (Bharathtechacademy@gmail.com)
	 * @version 1.0 (created new feature)
	 * @throws NullPointerException
	 * @deprecated new version is available, this function is about to remove
	 * @implNote
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(calculateInterst(35000,7.0,12));
	}
	


	public static double calculateInterst(int amount, double interest, int month) {
		double intst = (amount*month*interest/100)/12;
		return intst;
	}

}
