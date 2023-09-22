package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	     WebDriver driver = new ChromeDriver();
	     
	     String url="https://www.amazon.com/";
		 driver.navigate().to(url);
		 Thread.sleep(2000);
		 
		 
         //there are 8 locators to find the elements in Dom
		 //id, name, className, linkText, partialLinkText, tagName, xPath, cssSelector
		 
		 WebElement searchText = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 searchText.sendKeys("Messi jersey");
		 Thread.sleep(1000);
		 
		 WebElement searchBotton =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 searchBotton.click();
		 Thread.sleep(1000);
		 
		 
		 Thread.sleep(3000);
		 driver.quit();
	}

}
