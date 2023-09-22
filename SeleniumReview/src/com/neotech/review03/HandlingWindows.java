package com.neotech.review03;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/windows

		setUp();

		String window1 = driver.getWindowHandle();
		System.out.println(window1);

		driver.findElement(By.id("google")).click();

		Thread.sleep(1000);

		System.out.println("--------------------------------");

		// I am NOT able to Locate elements. The focus is still on the first page
		// driver.findElement(By.name("q")).sendKeys("Como estas?");

		Set<String> allWindows = driver.getWindowHandles();

		for (String windowId : allWindows) {
			System.out.println(windowId);

			if (!windowId.equals(window1)) {
				// if the windowId is NOT equal to the first Window ID
				driver.switchTo().window(windowId);
			}
		}

		// Now I am able to Locate elements. The focus is on the second page
		driver.findElement(By.name("q")).sendKeys("Como estas?");
		Thread.sleep(2000);

		// HW for Nur
		// Switch using iterator

		tearDown();

	}

}