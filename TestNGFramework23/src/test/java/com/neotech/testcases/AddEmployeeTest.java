package com.neotech.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;
import com.neotech.pages.AddEmployeePageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.ExcelUtility;

public class AddEmployeeTest extends CommonMethods {

	@Test(dataProvider = "excelData", groups = "addEmp" )
	public void AddEmployee(String firstName, String lastName, String userName, String passWord, String eid) {

		AddEmployeePageElements login = new AddEmployeePageElements();
		
		// send username
		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);
		
		// send password
		sendText(login.password, ConfigsReader.getProperty("password"));
		wait(1);
	
		// click on login
		click(login.loginButton);
		wait(1);
		
		click(login.pmi);
		click(login.addemployee);
		wait(2);
	
		sendText(login.fName, firstName);
		sendText(login.lName, lastName);
		sendText(login.eid, eid);
		selectDropdown(login.location, "Australian Regional HQ");
		wait(2);
		click(login.switchbutton);
		wait(2);
		sendText(login.uName, userName);
		sendText(login.pw, passWord);
		sendText(login.confirmpassWord, passWord);
		wait(2);
		click(login.save);
		waitForVisibility(login.waitvisibility);
		
		SoftAssert softAssert = new SoftAssert();
		WebElement empl = driver.findElement(By.id("pim.navbar.employeeName"));
		AssertJUnit.assertTrue(empl.isDisplayed());
		softAssert.assertAll();
		
		test.info("Tasking Screenshots");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String path ="screenshots/"+lastName+".png";
		
		try {
			Files.copy(sourceFile, new File(path));
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!!!");
		}
	
	}
		
		@DataProvider (name = "excelData")
		public Object [][] getExcelData(){
		   String filePath  = System.getProperty("user.dir") + "/src/test/resources/testdata/Hw2.xlsx";
		   String sheetName ="Employee";
		   return ExcelUtility.excelIntoArray(filePath, sheetName);
		}
		
	}