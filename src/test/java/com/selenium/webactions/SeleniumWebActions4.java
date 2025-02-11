package com.selenium.webactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWebActions4 {

	public static void main(String[] args) throws InterruptedException {
//		1. Launch browser window(Chrome)
		WebDriver driver = new ChromeDriver();

//		2. Maximize the browser window
		driver.manage().window().maximize();

//		3. Delete all the cookies
		driver.manage().deleteAllCookies();

//		4. Enter URL and Launch the application (https://demoqa.com/buttons)
		driver.get("https://demoqa.com/buttons");

//		5. Collect button elements 
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

//		initiate the actions class
		Actions action = new Actions(driver);

//		6. Perform double click action
		action.doubleClick(doubleClickButton).perform();

//		7. Perform Right Click Action
		action.contextClick(rightClickButton).perform();

//		8. Perform Mouse hover action on 'click me' button
		action.moveToElement(clickMeButton).perform();
		Thread.sleep(5000);

//		9. Navigate to drag and drop elements page(https://demoqa.com/droppable)
		driver.navigate().to("https://demoqa.com/droppable");

//		10.Perform drag and drop action
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver
				.findElement(By.xpath("//div[@id='draggable']/following-sibling::div[@id='droppable']"));
		action.dragAndDrop(source, target).perform();

//		11. Navigate to google page(https://www.google.co.in/)
		driver.navigate().to("https://www.google.co.in/");

//		12. Search for information related to 'Selenium' and press 'enter' button
		WebElement googleSearchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));
		action.sendKeys(googleSearchBox, "Selenium" + Keys.ENTER).perform();
		Thread.sleep(3000);

//		13. Select all search results and paste it in the search box (Keyboard actions)
		action.keyDown(Keys.CONTROL).sendKeys("a").perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").perform();
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@type='search']"));
		action.click(searchBox).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").perform();

//		14. Close browser window
		driver.quit();

	}

}
