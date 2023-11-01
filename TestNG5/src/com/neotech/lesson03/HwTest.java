package com.neotech.lesson03;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.ExcelUtility;

public class HwTest extends CommonMethods {
//	Open chrome browser
//	Go to "https://hrm.neotechacademy.com/"
//	Login to the application
//	Add 3 different Employees and Create Login Details by providing:
//	First Name
//	Last Name
//	Username
//	Password
//	Verify Employee has been added successfully and take screenshot (you must have 3 different screenshots)
//	Close the browser
//	Specify a group for this test case, add it into specific suite and execute from the xml file.

	@Test(dataProvider = "excelData")
	public void addEmployee(String firstName, String lastName, String userName, String passWord) {
		wait(2);
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		// navigate to PIM
		wait(1);
		click(driver.findElement(By.xpath("//span[normalize-space()='PIM']")));
		wait(2);
		// click on AddEmployee
		click(driver.findElement(By.xpath("//span[normalize-space()='Add Employee']")));
		wait(3);
		// send employee data
		sendText(driver.findElement(By.id("first-name-box")), firstName);
		sendText(driver.findElement(By.id("last-name-box")), lastName);
		click(driver.findElement(By.xpath("//button[@class='btn']")));
		selectDropdown(driver.findElement(By.id("location")), "Australian Regional HQ");
		wait(2);
		
		click(driver.findElement(By.xpath("//div[@class='custom-control custom-switch']")));
		wait(1);
		sendText(driver.findElement(By.id("username")), userName);
		sendText(driver.findElement(By.id("password")), passWord);
		sendText(driver.findElement(By.id("confirmPassword")), passWord);
		wait(2);
		click(driver.findElement(By.id("modal-save-button")));
		
		waitForVisibility(driver.findElement(By.id("pim.navbar.employeeName")));
		
		WebElement empl = driver.findElement(By.id("pim.navbar.employeeName"));
		Assert.assertTrue(empl.isDisplayed());
		wait(2);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String path ="screenshots/HRM/"+lastName+".png";
		
		try {
			Files.copy(sourceFile, new File(path));
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!!!");
		}
	
	}
	
	@DataProvider (name = "userData")
	public Object[][] employeeData()
	{
		
		Object[][] data = {{"Ailan", "Cline", "Ailani5", "AilaniCline123"}, 
				{"Romin", "Shaw", "Romina1", "RominaShaw123"}, 
				{"Emor", "Day", "Emory3", "EmoryDay123"}};
		return data;
	}

	@DataProvider (name = "excelData")
	public Object [][] getExcelData(){
	   String filePath  = System.getProperty("user.dir") + "/testdata/Excel.xlsx";
	   String sheetName ="Employee";
	   return ExcelUtility.excelIntoArray(filePath, sheetName);
	}
	
}