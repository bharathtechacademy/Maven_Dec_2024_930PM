package com.framework.concepts;

public class TestClass {

	public static void main(String[] args) {
		
		WebCommons commons = new WebCommons();
		AppCommons app = new AppCommons();		
		
		commons.startReporting();
		
		commons.launchBrowserAndApplication("Chrome","www.amazon.com");
		app.TestCase1();
		commons.closeBrowser();
		
		commons.launchBrowserAndApplication("Chrome","www.amazon.com");
		app.TestCase2();
		commons.closeBrowser();
		
		commons.launchBrowserAndApplication("Chrome","www.amazon.com");
		app.TestCase3("Anurag", "Anurag123");
		commons.closeBrowser();
		
		commons.launchBrowserAndApplication("Chrome","www.amazon.com");
		app.TestCase3("abcd", "abcd123-invalid");
		commons.closeBrowser();
		
		commons.stopReporting();

	}

}
