package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		
		//Use FluentWait
		
		setUp();

		driver.findElement(By.xpath("//a[normalize-space()='Dynamic Controls']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		Thread.sleep(1000);
		
		WebElement text = driver.findElement(By.xpath("//div//form[2]/input"));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);

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
