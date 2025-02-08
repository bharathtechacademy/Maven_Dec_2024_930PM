package com.selenium.webactions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebActions {

	public static void main(String[] args) throws IOException {

//		1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		2. Maximize the browser window  
		driver.manage().window().maximize();

//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		4. Enter URL and Launch the Application (https://www.google.co.in/)  
		driver.get("https://www.google.co.in/");
		
//		5. Locate the element
		WebElement element = driver.findElement(By.xpath("//buton"));
		
		/********** Common WebElement Actions **********/
        // Check if the element is displayed on the page
		boolean isElementDisplayed = element.isDisplayed();
		
        // Check if the element is enabled
		boolean isElementEnabled = element.isEnabled();
		
		// Check if the element is selected
		boolean isElementSelected = element.isSelected();
		
        /************* Regular Element Actions *************/

        /********** Button Element **********/
		
		// Get the label of the button
		String label1 = element.getAttribute("value"); //if label is added as attribute value
		String label2 = element.getText();//it label is added as textvalue
		
		// Click on the button
		element.click(); //normal click on visible window		

		//Actions click
		Actions actions = new Actions(driver);
		actions.click(element).perform();
		actions.doubleClick(element).perform();
		actions.moveToElement(element).perform();
		actions.dragAndDrop(element,element).perform();
		
		//Hidden element click
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		
		//Scroll to element and click
		js.executeScript("arguments[0].scrollToElement()", element);
		element.click();
		
		 /********** Textbox Element **********/
		
		// Clear the textbox
		element.clear();
		
		// Enter text into the textbox
		element.sendKeys("Text");
		
		//Using actions class
		actions.sendKeys(element, "Text").perform();
		actions.sendKeys(element, "Text"+Keys.ENTER+Keys.F12).perform();
		
		//Type of hidden / disabled textboxes
		js.executeScript("arguments[0].value='Text'", element);
		
		
		 /********** Dropdown Element **********/
		Select s = new Select(element);
		
		// Get all options available in the dropdown
		List<WebElement> options = s.getOptions();
		
		for(WebElement option: options) {
			System.out.println(option.getText());
		}
		
		// Select options from a dropdown
		s.selectByIndex(1);
		s.selectByValue("ws");
		s.selectByVisibleText("WebService");
		
		// Verify the selected option
		WebElement selectedOption = s.getFirstSelectedOption();
		System.out.println(selectedOption.getText());
		
		// Verify whether dropdown is multi-select dropdown
		boolean isMultipleSelectionAllowed = s.isMultiple();
		
		 // Select and deselect options
		s.selectByIndex(1);
		s.selectByValue("ws");
		s.selectByVisibleText("WebService");
		
		s.deselectByIndex(1);
		s.deselectByValue("ws");
		s.deselectByVisibleText("WebService");
		
		/********** Checkbox Element **********/
		
		// Check if the element is selected , if not selected then click on the checkbox
		boolean isElementChecked= element.isSelected();
		if(!isElementChecked) {
			element.click();
		}
		
		/********** Radio Button Element **********/
		// Click the radio button
		element.click();
		
		/********** Image Element **********/
		
		// Verify if the image element is displayed
		boolean isImageDisplayed = element.isDisplayed();
		
		// Get the source of the image
		String imageSource = element.getAttribute("src");
		
		// Verify the image dimensions
		int imageWidth = element.getSize().getWidth();
		int imageHeight = element.getSize().getHeight();
		
		// Get the position of the image
		Point imagePosition = element.getLocation();
		int x = imagePosition.getX();
		int y = imagePosition.getY();
		
		// Load the image and verify a specific pixel color
		int colorCode = ImageIO.read(new File(imageSource)).getRGB(10, 20);
		
		/********** Text Element **********/
		
		//get text of element
		String text = element.getText();
		
		 /********** Hyperlink Element **********/

        // Verify the URL in the hyperlink
		String url = element.getAttribute("href");
		
		 // click on the link and verify the url
		element.click();
		String URL = driver.getCurrentUrl();
		
		/********** Alerts **********/
		Alert alert = driver.switchTo().alert();
		
		//click on ok
		alert.accept();
		
		//click on cancel
		alert.dismiss();
		
		//get Text
		alert.getText();
		
		//enter text
		alert.sendKeys("Text");
		
		/********** Frames **********/
		
		//Switch to frame from main window
		driver.switchTo().frame(0); //using index
		
		driver.switchTo().frame("frame1"); //using id or name
		
		driver.switchTo().frame(element);//using web element

	}

}
