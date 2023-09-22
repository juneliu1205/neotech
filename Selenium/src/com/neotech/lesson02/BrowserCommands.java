package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

//	1. Open chrome browser
//	2. Navigate to “https://www.zillow.com/”
//	3. Navigate to “https://www.google.com/”
//	4. Navigate back to Zillow Page
//	5. Refresh current page
//	6. Verify url contains “Zillow”
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver(); // up-casting

	
        //1st way
		//there is no history, waits foe the page to be fully loaded
		//driver.get("https://www.zillow.com/");
		
		//2nd way
		//keeps history
		//does not wait for the page to be loaded
		driver.navigate().to("https://www.zillow.com/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();//makes full screen
		//driver.manage().window().fullscreen();//makes full screen
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.navigate().back();//bring us back to Zillow
		Thread.sleep(1000);
		
		driver.navigate().forward();//bring us back to Google
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
	}

}
