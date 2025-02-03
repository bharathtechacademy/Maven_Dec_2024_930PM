package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {
	
//Basic Locators 
	//1.id ==> id attribute value of element
	//2.name ==> name attribute value of element
	//3.className ==> class attribute value of element
	//4.tagName ==> HtmlTag value of element
	//5.linkText ==> will work only for hyper-links ==> Text value of Hyperlink
	//6.partialLinkText ==> will work only for hyper-links ==> Partial text value of Hyperlink
	
	// Locator ==> By.id("")  ==> data type 'By'
	// WebElement ==>driver.findElement(By.id(""));  ==> data type 'WebElement'

	public static void main(String[] args) {
//		1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		2. Maximize the browser window  
		driver.manage().window().maximize();

//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		4. Enter URL and Launch the Application (https://www.google.co.in/)  
		driver.get("https://www.google.co.in/");
		
//		5. Locate the WebElement google search text box using 'id' Locator
		driver.findElement(By.id("APjFqb"));
		
//		6. Locate the WebElement google search text box using 'name' Locator
		driver.findElement(By.name("q"));		
		
//		7. Locate the WebElement google search text box using 'className' Locator
		driver.findElement(By.className("gLFyf"));
		
//		8. Locate the WebElement google search text box using 'tagName' Locator
		driver.findElement(By.tagName("textarea"));
				
//		9. Locate the WebElement 'How Search Works' hyperlink using 'linkText' Locator
		driver.findElement(By.linkText(" How Search works "));
		
//		10. Locate the WebElement 'How Search Works' hyperlink using 'partialLinkText' Locator
		driver.findElement(By.partialLinkText("How Search"));

	}

}
