package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2_2 extends CommonMethods {
//	HW2: OrangeHRM Add Employee:
//	    Open chrome browser
//	    Go to "https://hrm.neotechacademy.com/"
//	    Login into the application
//	    Click on Add Employee
//	    Verify labels: Employee Full Name*, Employee Id, Location* are displayed
//	    Provide Employee First and Last Name
//	    Select a Location
//	    Verify Employee has been added successfully
//	    Close the browser

	@BeforeMethod
	public void openAndNavigate() throws InterruptedException {
		setUp();
	}
	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
	@Test
	public void loginValidation() throws Exception {
		sendText(driver.findElement(By.id("txtUsername")),ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")),ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		wait(1);
		click(driver.findElement(By.xpath("//span[normalize-space()='PIM']")));
		wait(2);
		click(driver.findElement(By.xpath("//span[normalize-space()='Add Employee']")));
		
		wait(2);
		SoftAssert softAssert = new SoftAssert();
		
		boolean firstName = driver.findElement(By.id("first-name-box")).isDisplayed();
		softAssert.assertTrue(firstName);
		boolean midtName = driver.findElement(By.id("middle-name-box")).isDisplayed();
		softAssert.assertTrue(midtName);
		boolean lastName = driver.findElement(By.id("last-name-box")).isDisplayed();
		softAssert.assertTrue(lastName);
		boolean empID = driver.findElement(By.id("employeeId")).isDisplayed();
		softAssert.assertTrue(empID);
		boolean location = driver.findElement(By.xpath("//button[@data-id=\"location\"]")).isDisplayed();
		softAssert.assertTrue(location);
		wait(3);
	
		sendText(driver.findElement(By.id("first-name-box")),"Jasmine");
		sendText(driver.findElement(By.id("last-name-box")),"Liu");
		click(driver.findElement(By.xpath("//button[@class='btn']")));
		selectDropdown(driver.findElement(By.id("location")),"Australian Regional HQ");
		wait(2);
		click(driver.findElement(By.id("modal-save-button")));
		wait(5);
		waitForClickability(driver.findElement(By.id("pim.navbar.employeeName")));
		
		String expected = "Jasmine Liu";
		String actual = driver.findElement(By.id("pim.navbar.employeeName")).getText();
		softAssert.assertEquals(expected, actual);
		softAssert.assertAll();
		System.out.println("Employee has been added successfully");
		
		wait(5);
}
	}
