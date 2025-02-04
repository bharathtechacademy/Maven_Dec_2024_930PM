package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//Xpath ==> Xml path
	
	//Absolute xpath ==> xml path starts with /html till target element (full xpath)  ==> /html/body/div[1]/div[1]/a[2]/img
	//Relative xpath ==>  starts with // and will locate the element based on target element attributes and text values
	
	
	/**********Basic Xpath (Level 1)*************/
	
	// Syntax 1 : //tagName [ @Attribute = 'Attribute Value']
	// Syntax 2 : //tagName [ text() = 'Text Value']
	
	/**********Level 2 - Cut-short the xpath using contains and starts-with *************/
	// Syntax 3 : //tagName [ contains(@Attribute , 'Partial Attribute Value')]
	// Syntax 4 : //tagName [ contains(text() , 'Text Value')]
	
	// Syntax 5 : //tagName [ starts-with(@Attribute , 'Partial Attribute Value')]
	// Syntax 6 : //tagName [ starts-with(text() , 'Text Value')]

	/**********Level 3 - combine multiple attributes and text values using 'and' *************/
	// Syntax 7 : //tagName [ @Attribute1 = 'Attribute Value' and @Attribute2 = 'Attribute Value' and text()='Text value']
	
	/**********Level 4 - Advanced xpath with relationships *************/
	//Syntax 8 : reference xpath /relationship::targetElemen Xpath
	
//	child
//	parent
//	ancestor
//	following-sibling
//	preceding-sibling
//	following
//	preceding
//	//(with in the family)
	
//	sibling > parent > ancestor > ancetor's parent
	
	// ancestor : //ul[@class='leftmenu']
	//parent : //li
	//sibling : N/A
	//target : //a[text()='Services']
	
	
	//ul[@class='leftmenu']/child::li/child::a[text()='Services']
	//ul[@class='leftmenu']//a[text()='Services']
	//li[text()='Solutions']/following-sibling::li[2]/child::a

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		2. Maximize the browser window  
		driver.manage().window().maximize();

//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)  
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate the WebElement Logo using 'xpath' Locator - Syntax 1
		driver.findElement(By.xpath("//img[@class ='logo']"));
		
//		6. Locate the WebElement Caption using 'xpath' Locator - Syntax 2
		driver.findElement(By.xpath("//p[text()='Experience the difference']"));
		
//		7. Locate the WebElement Logo using 'xpath' Locator - Syntax 3
		driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		
//		8. Locate the WebElement Caption using 'xpath' Locator - Syntax 4
		driver.findElement(By.xpath("//p[contains(text(),'difference')]"));
		
//		9. Locate the WebElement Logo using 'xpath' Locator - Syntax 5
		driver.findElement(By.xpath("//img[starts-with(@src,'images/logo')]"));
		
//		10. Locate the WebElement Caption using 'xpath' Locator - Syntax 6
		driver.findElement(By.xpath("//p[starts-with(text(),'Experience')]"));

//		11. Locate the WebElement Logo using 'xpath' Locator - Syntax 7
		driver.findElement(By.xpath("//img[contains(@src,'logo') and @alt='ParaBank' and@class='logo' and @title='ParaBank']"));
		
//		12. Locate the WebElement Caption using 'xpath' Locator - Syntax 7
		driver.findElement(By.xpath("//p[@class='caption' and text()='Experience the difference']"));
		
//		13. Locate the WebElement Services element using 'xpath' Locator - Syntax 8
		driver.findElement(By.xpath("//ul[@class='leftmenu']/child::li/child::a[text()='Services']"));		

	}

}
