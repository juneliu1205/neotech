package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 2: Orange HRM Application Negative Login: 
		 * Open Chrome browser 
		 * Go to https://hrm.neotechacademy.com/ 
		 * Enter valid username 
		 * Leave password field empty 
		 * Verify error message with text "Password cannot be empty" is displayed.
		 */

        setUp();
		
		WebElement un = driver.findElement(By.id("txtUsername"));
		un.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement pw = driver.findElement(By.id("txtPassword"));
		pw.sendKeys("");
		
		driver.findElement(By.xpath("//button")).click();
		
		WebElement password = driver.findElement(By.xpath("//span[@id='txtPassword-error']"));
		
		String emptypw = password.getText();
		String expectmsg = "Password cannot be empty";
		
		if (emptypw.equals(expectmsg)) {
			System.out.println("Test Passed!");

		}else {
			System.out.println("It failed!");
		}
		Thread.sleep(8000);
		tearDown();
	
	}

}
