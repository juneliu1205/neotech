package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCSS {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	     WebDriver driver = new ChromeDriver();
	     
	     String url="https://www.amazon.com/";
		 driver.navigate().to(url);
		 Thread.sleep(2000);
		 
		 
		 //#(hashtag) means id
		 //#twotabsearchtextbox-> any element with id = twotabsearchtextbox
		 //input#twotabsearchtextbox -> any input with id = twotabsearchtextbox
		 
		 // . (period) means class
		 // input.mango - > input with class mango
		 
		 WebElement searchText = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		 searchText.sendKeys("Messi jersey");
		 Thread.sleep(1000);
		 
		     // span#nav-search-submit-text > input
			// Locate the span with id = nav-search-submit-text
			// Locate the direct-child input
			// Method chaining: locating the element and clicking on it
		 
		 WebElement searchBotton =driver.findElement(By.cssSelector("#nav-search-submit-button"));
		 searchBotton.click();
		 Thread.sleep(1000);
		 
		 driver.quit();
	}

}
