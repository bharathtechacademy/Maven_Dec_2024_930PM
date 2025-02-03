package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocators {
	
//	Syntax 1 : tagName#id

//	Syntax 2 : tagName.className

//	Syntax 3 : tagName[Attribute='attribute-value’]

//	Syntax 4 : parentCssLocator > childCssLocator  (Ex:  ul[class='leftmenu'] > li > a[href='services.htm’]) (Advanced Css Selector)


	public static void main(String[] args) {

//		1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		2. Maximize the browser window  
		driver.manage().window().maximize();

//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		4. Enter URL and Launch the Application (https://www.google.co.in/)  
		driver.get("https://www.google.co.in/");
		
//		5. Locate the WebElement google search text box using 'cssSelector' Locator syntax 1
		driver.findElement(By.cssSelector("textarea#APjFqb"));
		
//		6. Locate the WebElement google search text box using 'cssSelector' Locator syntax 2
		driver.findElement(By.cssSelector("textarea.gLFyf"));
		
//		7. Locate the WebElement google search text box using 'cssSelector' Locator syntax 3
		driver.findElement(By.cssSelector("textarea[title='Search']"));

	}

}
