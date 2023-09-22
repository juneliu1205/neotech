package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3_1 {

	public final static String url = "https://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {
//	        Using xPath ONLY    TC 2: Mercury Tours Registration: 
//	        Open chrome browser
//	        Go to “http://demo.guru99.com/test/newtours/”
//	        Click on Register Link
//	        Fill out all required info
//	        Click Submit
//	        User successfully registered
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//a[contains(text(), 'REGISTER')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Julia");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Smith");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("333-444-5555");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("js@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Main Street");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("St. Charles");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("MO");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("63303");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("john123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("john123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
