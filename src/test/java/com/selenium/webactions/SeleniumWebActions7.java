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

public class SeleniumWebActions7 {
	
//	 ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
//	 ExtentXReporter extentx = new ExtentXReporter("localhost");
//	 
//	 ExtentReports extent = new ExtentReports();
//	 extent.attachReporter(html, extentx);
//	 
//	 extent.createTest("TestName").pass("Test Passed");
//	 
//	 extent.flush();
	
	static WebDriver driver;
	
	public static ExtentReports extent = null; //printer
	public static ExtentHtmlReporter html= null; //white paper
	public static ExtentTest logger= null; //ink
	

	public static void main(String[] args) throws IOException { 
		
		html = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\AutomationTestResults.html");
		extent = new ExtentReports();
		extent.attachReporter(html);
		
		logger = extent.createTest("Verify Logo and Caption");
		
//		1. Launch browser window(Chrome)
		driver = new ChromeDriver();
		
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
		logger.pass("Application Launched Successfully");
		
//		6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed());
		logger.pass("Application Logo Displayed Successfully");
		logger.addScreenCaptureFromPath(takeElementScreenshot(logo, "logo.png"));
		
//		7. Verify application caption (Experience the difference)
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String actualCaption = caption.getText();
		String expectedCaption = "Experience the difference";
		Assert.assertEquals(actualCaption, expectedCaption);
		logger.pass("Application Caption is displayed as per the requirement");
		
		//stop printing
		extent.flush();
		
		
		logger = extent.createTest("Verify Application Login");
//		8. Enter Invalid credentials in Username and Password textboxes
		WebElement usernameTxtb = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordTxtb = driver.findElement(By.xpath("//input[@name='password']"));
		
		usernameTxtb.clear();
		passwordTxtb.clear();
		
		usernameTxtb.sendKeys("Invalid User");
		passwordTxtb.sendKeys("Invalid Password");
		logger.info("User entered Username as 'Invalid User' and Password as 'Invalid Password '");
		
//		9. Verify button label (LOG IN) and Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		String actualLabel = loginButton.getAttribute("value").toUpperCase();
		String expectedLabel = "LOG IN";
		Assert.assertEquals(actualLabel, expectedLabel);
		
		loginButton.click();
		logger.pass("Clicked on Login Button");
		
//		10. Verify error message is coming
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));	
		
		WebElement errorMessage = driver.findElement(By.xpath("//p[@class='error']"));
		logger.error("Error message is displayed as "+errorMessage.getText());
		logger.addScreenCaptureFromPath(takeWindowScreenshot(driver, "ErrorMessage.png"));
		extent.flush();
		
//		11. Click on Admin page link
		WebElement adminLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminLink.click();
		
//		12. Wait for admin page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		
//		13. Select Data access mode as ' SOAP'
		selectDBAMode("soap");
		
//		14. Scroll-down till Loan provider
//		15. Select Loan provider as 'Web Service'
		selectOption("Web Service");
		
//		16. Click on Submit button
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		
//		17. wait for Successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
		
//		18. Click on Services Link
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		servicesLink.click();
		
//		19. Wait for Services page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		
//		20. Scroll-down till Bookstore services
		WebElement bookstoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", bookstoreServices);
		
//		21. Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr[1]//td"));
		int totalRows = rows.size();
		int totalColumns = columns.size();
		
//		22. Get Column headers of book store services table
		for(int i=1; i<=totalColumns; i++) {
			cell(1, i);
		}
		
//		23. Get all the data from book store service table
		for(int r=1; r<=totalRows; r++) {
			for(int c=1; c<=totalColumns; c++) {
				cell(r, c);
			}
		}
		
//		24. Close browser window
		driver.quit();

	}
	
	public static void selectDBAMode(String option) {
		WebElement dbaMode = driver.findElement(By.xpath("//input[@value='"+option+"']"));
		dbaMode.click();
	}
	
	public static void selectOption(String option){
//		14. Scroll-down till Loan provider
		WebElement loanProviderDropdown = driver.findElement(By.xpath("//select[@name='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", loanProviderDropdown);
		
//		15. Select Loan provider as 'Web Service'
		Select s = new Select(loanProviderDropdown);
		s.selectByVisibleText(option);
	}
	
	public static void cell(int row, int col) {
		WebElement cellElement = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr["+row+"]//td["+col+"]"));
		System.out.println("Value of Row "+row+" Column "+col+" is : "+cellElement.getText());
	}
	
	public static String takeWindowScreenshot(WebDriver driver, String screenshotNameAlongWithFormat) {
		String filePath = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotNameAlongWithFormat;
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filePath;
	}
	
	public static String takeElementScreenshot(WebElement element, String screenshotNameAlongWithFormat) {
		String filePath = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotNameAlongWithFormat;
		File screenshotFile = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filePath;
	}

}
