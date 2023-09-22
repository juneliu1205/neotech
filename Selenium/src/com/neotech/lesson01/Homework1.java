package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {

//		HW1: Amazon Page Title Verification: 
//			Open chrome browser
//			Go to “https://www.amazon.com/”
//			Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//			End the Session (close the browser).
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver" );
		
		WebDriver driver = new ChromeDriver(); //up-casting
		
		driver.get("https://www.amazon.com/");
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("The actual title is: " + driver.getTitle());
		}
		else
		{
			System.out.println("The expected title is wrong and the title is "+ actualTitle);
		}
		
		Thread.sleep(5000);
		

		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
