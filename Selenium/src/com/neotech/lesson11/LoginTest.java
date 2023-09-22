package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// https://hrm.neotechacademy.com/ 
		
		setUp();
		
		//sending the username
		
		WebElement username =driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password =driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		
		wait(2);
		
		//click on log in button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait(4);
		
		
		WebElement logo= driver.findElement(By.id("ohrm-small-logo"));
		if (logo.isDisplayed()) {
			System.out.println("Test passed!");
		}else {
			System.out.println("Test Failed!");
		}
		tearDown();
	}

}
