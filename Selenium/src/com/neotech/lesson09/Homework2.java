package com.neotech.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {
	
//	TC: Delete Orders
//
//	1) Open chrome browser
//	2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	3) Login to the application
//	4) Click on the checkbox of all orders with product FamilyAlbum
//	5) Delete Selected orders
//	6) Verify the orders have been deleted
//	7) Quit the browser
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
		
		String expectedname = "FamilyAlbum";
		List <WebElement> rows = driver.findElements(By.xpath("//table[@class= 'SampleTable']/tbody/tr"));
	
		for (int i = 0; i <rows.size(); i++)
		{
			String rowstext = rows.get(i).getText();
			
			if (rowstext.contains(expectedname))
			{
			List <WebElement> checkbox = driver.findElements(By.xpath("//table[@class= 'SampleTable']/tbody/tr["+ (i+1) + "]/td[1]/input"));
			checkbox.get(0).click();
			}
			Thread.sleep(500);
			}
		
		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
		Thread.sleep(2000);
		
		WebElement updatelist = driver.findElement(By.xpath("//table[@class='SampleTable']"));
		if (!updatelist.getText().contains(expectedname)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
		Thread.sleep(1000);
		tearDown();
}
}
	
