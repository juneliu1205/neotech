package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends CommonMethods {
	//FrameDemo at com.neotech.lesson07 using the CommonMethods.java
	
	public static void main(String[] args) throws InterruptedException {
		// https://jqueryui.com/tooltip/
		setUp();
		wait(2);
		
		switchToFrame(0);
		WebElement ageTxt = driver.findElement(By.id("age"));
		sendText (ageTxt,"Abril");
		
		wait(2);
		
		driver.switchTo().defaultContent();
		
		switchToFrame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		sendText (driver.findElement(By.id("age")), "25");
		
		wait(2);
		driver.switchTo().defaultContent();
		
		tearDown();
}
	}
