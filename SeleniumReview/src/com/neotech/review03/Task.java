package com.neotech.review03;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass {
	    // BREAK & TASK Until 12:40
		// Open https://neotech.vercel.app/windows
		// Click on the button that opens NeoTech Academy page
		// Switch the focus back and forth 10 times
		// Hint: You switch the two handles that you have in the set

		// Find the time for the best disco movement
	public static void main(String[] args) throws InterruptedException {
	 //https://neotech.vercel.app/windows
		
		setUp();
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		
		driver.findElement(By.xpath("//button[@id='neo']")).click();
		Thread.sleep(1000);

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> it = allWindows.iterator();
		String w1 = it.next();
		String w2 = it.next();

		for (int i=0; i<=10; i++) {
			driver.switchTo().window(w2);
			Thread.sleep(2000);
			driver.switchTo().window(w1);
			Thread.sleep(2000);
		}
		
		driver.close();// will close the ONLY current tab/window
		//driver.quit(); // will close ALL tab/window
		tearDown();
		
		//HW click on all buttons
		//and close one by one
		
		
	
	}
}
