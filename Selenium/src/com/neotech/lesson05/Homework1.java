package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		* HW1: Orange HRM Application Login: Open Chrome browser 
//		 * Go to https://hrm.neotechacademy.com/ 
//		 * Enter valid username and password 
//		 * Click on login button 
//		 * Then verify that "span with id account-name" has the text
//		 * "Jacqueline White". 
//		 * Quit the browser
//		 */

		setUp();
		Thread.sleep(8000);
		
		WebElement un = driver.findElement(By.id("txtUsername"));
		un.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement pw = driver.findElement(By.id("txtPassword"));
		pw.sendKeys("Neotech@123");
		
		driver.findElement(By.xpath("//button")).click();
		
		WebElement accountName = driver.findElement(By.id("account-name"));
		
		String erroran = accountName.getText();
		String expectedan = "Jacqueline White";
		
		Thread.sleep(8000);
		tearDown();
	
		
	}

}
