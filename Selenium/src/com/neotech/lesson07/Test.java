package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Test extends BaseClass {
//	TC 1: Frame verification
//	Open chrome browser
//	Go to https://demoqa.com/frames
//	Verify the headers in both frames
//	Quit the browser
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();

		
		//driver.switchTo().frame(0);
		driver.switchTo().frame("frame1");
		
		String frame1Text = driver.findElement(By.id("sampleHeading")).getText(); 
		System.out.println("The text inside the parent frame -> " + frame1Text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		String frame2Text = driver.findElement(By.id("sampleHeading")).getText(); 
		System.out.println("The text inside the child frame -> " + frame2Text);
		
		
		
		Thread.sleep(5000);
		
		tearDown();
	}

}