package com.neotech.lesson15;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends CommonMethods {
//	Homework 1: OrangeHRM Login
//    Navigate to https://hrm.neotechacademy.com/
//    Login to the application by writing xpath based on "parent and child relation"
	
	public static void main(String[] args) throws InterruptedException {

	
		setUp();
	
		WebElement username = driver.findElement(By.xpath("//child::form/div[1]/input"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password = driver.findElement(By.xpath("//child::form/div[2]/input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//parent::form/child::div[3]/button"));
		
		click(loginBtn);
		
		wait(2);
		
		tearDown();
	}

}
