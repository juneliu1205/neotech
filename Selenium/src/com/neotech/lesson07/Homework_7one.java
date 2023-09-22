package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework_7one extends BaseClass {
	
//Handling Multiple Windows
//	1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//	3) On the Child Window, Enter your email ID and submit.
//	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//	5) Close the Child window on which credentials are displayed.Switch to the parent window.
//	6) Quit all browsers
//	
	public static void main(String[] args) throws InterruptedException {
	
		setUp();
		Thread.sleep(1000);
		System.out.println("Title -> " + driver.getTitle());
		System.out.println("Handle -> " + driver.getWindowHandle());

		driver.findElement(By.linkText("Click Here")).click();

		Thread.sleep(2000);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("The number of open windows/tabs -> " + allWindowHandles.size());
	
		Iterator<String> it = allWindowHandles.iterator();
		String w1 = it.next();
		String w2 = it.next();
	
		System.out.println("Window1 -> " + w1);
		System.out.println("Window2 -> " + w2);
		driver.switchTo().window(w2);
		
		driver.findElement(By.name("emailid")).sendKeys("junejuneliu@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(w1);
	
	
	    Thread.sleep(2000);
	
	    tearDown();
	
}
}