package com.creatio.crm.language.basics;

public class MethodsConcept2 {

	// Method/ Function ==> Block of code / Collection of Statements inside the
	// block

	// Method inside method is not allowed
	// Types of Methods ==> Method with return type, without return type, with
	// arguments, without argument , constructor method

	public static void main(String[] args) {
		
		MethodsConcept2 obj = new MethodsConcept2();

//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		obj.launchBrowserAndApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		obj.logOutAndCloseBrowser();
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");

//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		obj.launchBrowserAndApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logOutAndCloseBrowser();
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");

//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		obj.launchBrowserAndApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logOutAndCloseBrowser();
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");

//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Invalid");
//		System.out.println("Enter password as invalid123");
//		System.out.println("Click on Login button");
		obj.launchBrowserAndApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logOutAndCloseBrowser();
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");

//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Invalid");
//		System.out.println("Enter password as invalid123");
//		System.out.println("Click on Login button");
		obj.launchBrowserAndApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 4 Steps Related to Accounts Page--");
		obj.navigateToAccountsAndGetBalance();
//		System.out.println("Naviagate to accounts page");
//		System.out.println("Copy Account Bance and Store for future");
		obj.logOutAndCloseBrowser();
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");


	}
	
	//***************END OF MAIN*****************/
	
	//method without return type
	 void launchBrowserAndApplication() {
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url and launch application");
	}

	void loginIntoApplication() {
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}

	void logOutAndCloseBrowser() {
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}

	//method with return type
	 double navigateToAccountsAndGetBalance() {
		System.out.println("Naviagate to accounts page");
		System.out.println("Copy Account Bance and Store for future");
		double balance = 1000.50;
		return balance;
	}

}
