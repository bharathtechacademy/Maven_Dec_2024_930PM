package com.selenium.webactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumWebActions2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
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
		
//		6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed());
		
//		7. Verify application caption (Experience the difference)
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String actualCaption = caption.getText();
		String expectedCaption = "Experience the difference";
		Assert.assertEquals(actualCaption, expectedCaption);
		
//		8. Enter Invalid credentials in Username and Password textboxes
		WebElement usernameTxtb = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordTxtb = driver.findElement(By.xpath("//input[@name='password']"));
		
		usernameTxtb.clear();
		passwordTxtb.clear();
		
		usernameTxtb.sendKeys("Invalid User");
		passwordTxtb.sendKeys("Invalid Password");
		
//		9. Verify button label (LOG IN) and Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		String actualLabel = loginButton.getAttribute("value").toUpperCase();
		String expectedLabel = "LOG IN";
		Assert.assertEquals(actualLabel, expectedLabel);
		
		loginButton.click();
		
//		10. Verify error message is coming
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error1']"), 0));		
		
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

}
