package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//// Go to https://demoqa.com/text-box
//Fill the form and submit
//Use xPath or CSS Selector
public class TaskwithXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	     WebDriver driver = new ChromeDriver();
	     
	     String url="https://demoqa.com/text-box";
		 driver.navigate().to(url);
		 
		 WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
		 fullName.sendKeys("Mickey Mouse");
		 Thread.sleep(500);
		 
		 WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		 email.sendKeys("MickeyMouse@gmail.com");
		 Thread.sleep(500);
		 
		 WebElement Caddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		 
		//*[@id="currentAddress"]
		 
		 Caddress.sendKeys("123 main street");
		 Thread.sleep(500);
		 
		 WebElement Paddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		 Paddress.sendKeys("123 main street");
		 Thread.sleep(500);
		 
		 WebElement searchBotton =driver.findElement(By.xpath("//button[@id='submit']"));
		 searchBotton.click();
		 Thread.sleep(1000);
		 
		 
		 driver.quit();
	}

}
