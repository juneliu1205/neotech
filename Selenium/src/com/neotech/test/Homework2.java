package com.neotech.test;

import com.neotech.pages.PaswrdCtBeEmtyFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods {
//	TC 2: Orange HRM wrong password validation
//	1. Go to https://hrm.neotechacademy.com/
//	2. Enter valid username and wrong password
//	3. Click on login button
//	4. Verify error message with text "Invalid credentials" is displayed
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		wait(1);
		
		PaswrdCtBeEmtyFactory login = new PaswrdCtBeEmtyFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		login.loginBtn.click();
		
		wait(2);	

		String expectedmsg = "Invalid Credentials";
		String actualmsg = login.msg.getText();
		
		if (actualmsg.equals(expectedmsg)) {
			System.out.println("Test Passed! Invalid Credentials is displayed!");
		} else {
			System.out.println("Test Failed!!!");
		}

		wait(2);
		tearDown();

	}

	}
