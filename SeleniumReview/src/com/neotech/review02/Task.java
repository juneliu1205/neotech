package com.neotech.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass {

	public static void main(String[] args)  throws InterruptedException {
		// Login to SIS Web Application
		// http://neotechacademy-sis.com:9000/Test/
		// username -> Admin
		// password -> Neotech$123

		setUp();
		
		WebElement un = driver.findElement(By.id("tUsername"));
		un.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement pw = driver.findElement(By.id("tPassword"));
		un.sendKeys("Neotech$123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("bLogin")).click();;
		
		
		
		
		tearDown();
		
		
	}

}
