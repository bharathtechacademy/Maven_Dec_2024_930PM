package com.selenium.concepts;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class BrowserActions {

	public static void main(String[] args) {
		
//		Browser settings
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		
//		1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver(options);

//		2. Minimize browser window    
		driver.manage().window().minimize();

//		3. Maximize to specific resolution(430x932) 
		driver.manage().window().setSize(new Dimension(430,932));

//		4. Maximize the browser window  
		driver.manage().window().maximize();
		
//		5. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		6. Enter URL and Launch the Application (https://www.google.co.in/)  
		driver.get("https://www.google.co.in/");

//		7. Verify the application title (Google) 
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		Assert.assertEquals(actualTitle, expectedTitle);

//		8. Navigate to Different application (https://www.selenium.dev/)
		driver.navigate().to("https://www.selenium.dev/");

//		9. Go back to previous application
		driver.navigate().back();

//		10. Move forward to next application 
		driver.navigate().forward();

//		11. Refresh the application 
		driver.navigate().refresh();

//		12.collect the main window id 
		String mainWindowId = driver.getWindowHandle(); // main window id
		System.out.println(mainWindowId);

//		13.Launch new tab and Launch the application in new tab (https://in.search.yahoo.com/)   
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.search.yahoo.com/");

//		14. Switch back to the main window
		driver.switchTo().window(mainWindowId);

//		15.Launch new window and Launch the application in new window (https://parabank.parasoft.com/parabank/index.htm)  
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		16.Switch back to main window  
		driver.switchTo().window(mainWindowId);
		
//		collect the all window ids
		Set<String> windows = driver.getWindowHandles(); //4 windows ids
		windows.remove(mainWindowId); //remove main window first
		
		for(String wind : windows) { //3 windows remaining in windows variable
			driver.switchTo().window(wind);//switch to window
			driver.close(); //closing the window
		}
		
		driver.switchTo().window(mainWindowId); //go to main window
		
		System.out.println(windows);
		
//		17.Print browser window URL  
		String windowUrl = driver.getCurrentUrl();
		System.out.println(windowUrl);

//		18. Get the Size of window   
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		System.out.println("Size of the window :"+width+"x"+height);

//		19. Close Current Window   
		driver.close();

//		20. Close all remaining windows
		driver.quit();

	}

}
