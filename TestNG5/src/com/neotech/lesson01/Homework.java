package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework extends CommonMethods {
	// Homework 1: HRMS Application Negative Login:
	//
//		    1. Open Chrome browser
//		    2. Go to "https://hrm.neotechacademy.com/"
//		    3. Enter valid username
//		    4. Leave password field empty
//		    5. Verify error message with text "Password cannot be empty" is displayed.

	@BeforeMethod
	public void openAndNavigate() throws InterruptedException {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void negativeLoginTest() throws InterruptedException {
		
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), "");
		click(driver.findElement(By.xpath("//button[@type='submit']")));

		wait(2);

		String expected = "Password cannot be empty";
		String actual = driver.findElement(By.id("txtPassword-error")).getText();

		if (actual.equals(expected)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}
	}
}