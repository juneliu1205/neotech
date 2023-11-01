package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class AddEmployeeWithDataProvider extends CommonMethods {

	/*
	 * Add 3 Employees with using DataProvider Open chrome browser and navigate to
	 * Orange HRM website Login with valid credentials Navigate to addEmployee tab
	 * Add 3 different employees using data Provider
	 */
	@Test (dataProvider = "userData")
	public void addEmployee(String firstName, String lastName) {

		// test if you are getting the data correctly from the dataProvider
		System.out.println(firstName + " " + lastName);

		// login
		wait(2);
		sendText(driver.findElement(By.id("txtUsername")),
				ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")),
				ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		// navigate to PIM
		wait(1);
		click(driver.findElement(By.xpath("//span[normalize-space()='PIM']")));
		wait(2);
		// click on AddEmployee
		click(driver.findElement(By.xpath("//span[normalize-space()='Add Employee']")));
		wait(2);
		// send employee data
		sendText(driver.findElement(By.id("first-name-box")),firstName);
		sendText(driver.findElement(By.id("last-name-box")),lastName);
		click(driver.findElement(By.xpath("//button[@class='btn']")));
		selectDropdown(driver.findElement(By.id("location")),"Australian Regional HQ");
		wait(2);
		
		// save employee
		wait(2);
		click(driver.findElement(By.id("modal-save-button")));
		wait(2);
	}

	@DataProvider (name = "userData")
	public Object[][] employeeData()
	{
		
		Object[][] data = {{"Jasmine", "Liu"}, {"June", "Liu"}, {"James", "Liu"}};
		return data;
	}
	
	
	
}
