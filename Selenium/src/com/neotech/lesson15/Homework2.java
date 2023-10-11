package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods {
//	Homework 2: OrangeHRM Login
//    Navigate to https://hrm.neotechacademy.com/
//    Login to the application by writing xpath based on "following and preceding siblings"
	
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		WebElement username = driver.findElement(By.xpath("//div[@class='button-holder']/preceding-sibling::div[2]//input[1]"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password = driver.findElement(By.xpath("//div[@class='button-holder']/preceding-sibling::div[1]/input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/following-sibling::form/div[3]/button"));
		
		click(loginBtn);
		
		wait(2);
		
		tearDown();
	}

}
