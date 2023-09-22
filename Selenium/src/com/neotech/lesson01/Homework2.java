package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
//		HW2: Opening Page on Firefox Browser
//		Open Firefox browser
//		Navigate to “https://www.redfin.com/”
//		Verify that you have navigated to (https://www.redfin.com/)
//		End the Session (close the browser).
	
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redfin.com/");
		
		 String actualURL = driver.getCurrentUrl();
		 String expectedURL = "https://www.redfin.com/";
		
		if(actualURL.equalsIgnoreCase(expectedURL))
		{
			System.out.println("The url is correct!!!");
		}
		else
		{
			System.out.println("The url is wrong!!");
		}
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
