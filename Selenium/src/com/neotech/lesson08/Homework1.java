package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		Homework 1: Use WebDriverWait
//        Verify element is enabled
//        Open chrome browser
//        Go to "https://the-internet.herokuapp.com/"
//        Click on the "Dynamic Controls" link
//        Click on enable button
//        Enter "Hello" and verify text is entered successfully
//        Close the browser

		setUp();
		
		driver.findElement(By.xpath("//a[normalize-space()='Dynamic Controls']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement text = driver.findElement(By.xpath("//div//form[2]/input"));
		wait.until(ExpectedConditions.elementToBeClickable(text));
		
		text.sendKeys("Hello");
		Thread.sleep(2000);
	
	    if (text.getAttribute("value").equals("Hello"))
	    {
	    	System.out.println("Passed");
	    }else
	    {
	    	System.out.println("Failed");
	    }
	    

		tearDown();
		
	}

}
