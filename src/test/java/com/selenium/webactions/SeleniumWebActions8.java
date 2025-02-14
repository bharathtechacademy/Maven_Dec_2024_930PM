package com.selenium.webactions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SeleniumWebActions8 {
	

	static WebDriver driver;


	public static void test(String[] args) throws IOException { 
		
//		1. Launch browser window(Chrome)
		driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https:parabank.parasoft.com/parabank/index.htm)
		driver.get("https://demoqa.com/elements");
		
//		5. copy all menu names
		List<WebElement> menuList = driver.findElements(By.xpath("//div[text()='Elements']/ancestor::div[@class='element-group']//ul[@class='menu-list']//li//span"));
		
		for(WebElement menu : menuList) {
			System.out.println(menu.getText());
		}
		
		
	}

}
