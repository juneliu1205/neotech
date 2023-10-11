package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework3 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
//	Homework 3: 
//		Go to url: https://hrm.neotechacademy.com/
//		Log in using our custom methods
//		Go to PIM menu
//		Add an employee
//		Upload another image in the employee photo

		setUp();
		
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.xpath("//button[@type='submit']")));

		click(driver.findElement(By.xpath("//span[text()='PIM']")));
		wait(1);
		click(driver.findElement(By.xpath(" //span[text()='Add Employee']")));
		wait(1);
		sendText(driver.findElement(By.id("first-name-box")), "June");
		wait(1);
		sendText(driver.findElement(By.id("last-name-box")), "Liu");
		wait(1);
		sendText(driver.findElement(By.id("employeeId")), "090752");
		wait(1);
		selectDropdown(driver.findElement(By.xpath("//select[@id='location']")), "Australian Regional HQ");
		wait(1);
		click(driver.findElement(By.id("modal-save-button")));
		wait(2);
		waitForVisibility(driver.findElement(By.xpath("//form[@id='pimPersonalDetailsForm']")));
		wait(2);
		
		click(driver.findElement(By.xpath("//img[@class='circle profile-photo valign tooltipped']")));
		
		String filePath = System.getProperty("user.dir") + "/screenshots/HRM/Homework12.png";
		sendText(driver.findElement(By.id("employeePicture")), filePath);
		
		
		wait(5);
		click(driver.findElement(By.xpath("//a[normalize-space()='Save']")));
		
		tearDown();

	}

}
		
		
		
		
		
		
		