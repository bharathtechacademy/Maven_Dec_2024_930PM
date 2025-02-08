package com.selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumWaitMethods {
	
	//implicit wait ==> wait for the next line element by holding NoSuchElement exception for specific time
	//explicit wait ==> wait for specific condition along with specific wait time
	//fluent wait ==> wait for specific condition along with specific wait time and also by using fluent wait we can control the interval to check for condition

	public static void main(String[] args) {
		
//		1. Launch browser window(Chrome)
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https:parabank.parasoft.com/parabank/index.htm)
		driver.get("https:parabank.parasoft.com/parabank/index.htm");
		
//		5. Verify application title (ParaBank | Welcome | Online Banking)
		String actualTitle = driver.getTitle();
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(actualTitle, expectedTitle);
		
//		Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='logo']"), 0));
		
//		Fluent Wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
		fluentWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='logo']"), 0));
		
	}

}
