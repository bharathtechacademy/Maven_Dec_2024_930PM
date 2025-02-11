package com.selenium.webactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWebActions3 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
//      1. Launch browser window(Chrome)
		driver = new ChromeDriver();
	       
//      2. Maximize the browser window
		driver.manage().window().maximize();

//      3. Delete all the cookies
		driver.manage().deleteAllCookies();
     
//      4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");
     
//      5. Wait for Page-load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//      6. Enter First name and Last name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		firstName.sendKeys("Bharath");
		lastName.sendKeys("Reddy");
         
//      7. Enter Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("BharathTechAcademy@gmail.com");
		
//      8. Select Gender (Male)
		selectGender("Male");
		
//      9. Enter mobile number
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("9553220022");
             
//      10.Select DOB (1-Feb-1991)
		selectDOB("1","February","1991");
             
//      11.Search and Select Computer Science
		selectSubject("Computer Science");
             
//      12.Select Hobbies as Sports and Reading
		String [] hobbies = {"Sports", "Reading"};
		selectHobbies(hobbies);
             
//      13.Upload photo
//		WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
//		uploadButton.sendKeys(System.getProperty("user.dir")+"\\Files\\11.png");
		
		WebElement uploadWindow = driver.findElement(By.xpath("//label[@for='uploadPicture']"));
		uploadWindow.click();
             
//      14. Wait till window open to upload the file
		Thread.sleep(5000);
             
//      15. Upload file
		String filePath="C:\\Training\\Dec_2024\\AutomationTraining\\AutomationMavenProject\\Files\\11.png";
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(filePath), null);//copy file path
		
		//paste file path and press enter button
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
             
//      16. Wait till file upload
		Thread.sleep(5000);
		
//      17.Submit Details
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", submitButton);
             
//      18. Close browser window
//		driver.quit();

	}
	
	public static void selectGender(String option) {
		WebElement gender = driver.findElement(By.xpath("//label[text()='"+option+"']"));
		gender.click();
	}
	
	public static void selectDOB(String day, String month, String year) {
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();//click and open calendar
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[contains(@class,'month')]"), 0));//wait until year dropdown loads successfully
		
		WebElement monthDropdown = driver.findElement(By.xpath("//select[contains(@class,'month')]"));
		Select selectMonth = new Select(monthDropdown);
		selectMonth.selectByVisibleText(month);
		
		WebElement yearDropdown = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText(year);
		
		WebElement date = driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"') and text()='"+day+"']"));
		date.click();
	}
	
	public static void selectSubject(String subjectName) {
		WebElement subjects = driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", subjects);
		
		Actions action = new Actions(driver);
		action.sendKeys(subjects,subjectName).perform();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='"+subjectName+"' and contains(@class,'option')]"), 0));
		
		WebElement suggestion = driver.findElement(By.xpath("//div[text()='"+subjectName+"' and contains(@class,'option')]"));
		suggestion.click();
	}
	
	public static void selectHobbies(String [] options) {
		for(String option : options) {
			WebElement element = driver.findElement(By.xpath("//label[text()='"+option+"']"));
			if(!element.isSelected()) {
				element.click();
			}
		}
	}

}
