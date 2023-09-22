package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		// Open chrome browser
		// Go to “https://demo.guru99.com/test/newtours/”
		// Click on Register Link
		//
		// Fill out just
		// First Name:
		// Last Name:
		// Phone:
		// Email:
		// And Click Submit

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver(); // up-casting
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstName")).sendKeys("June");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastName")).sendKeys("Liu");
		Thread.sleep(1000);
		
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		Thread.sleep(1000);
		
		driver.findElement(By.name("userName")).sendKeys("gl123@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
