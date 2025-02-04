package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorConcepts {
	
	// Syntax : RelativeLocator.with(targetElementLocator).DIRECTION(referenceElementLocator)

//	above
//	below
//	toLeftOf
//	toRightOf
//	near
	
	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		2. Maximize the browser window  
		driver.manage().window().maximize();

//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)  
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate the WebElement Services element using 'Relative Locator' 
		driver.findElement(RelativeLocator.with(By.linkText("Services")).above(By.linkText("Products")));		

	}

}
