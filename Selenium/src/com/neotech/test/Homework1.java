package com.neotech.test;

import com.neotech.pages.PaswrdCtBeEmtyFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

//TC 1: Orange HRM blank password validation
//1. Go to https://hrm.neotechacademy.com/
//2. Enter valid username and leave password field empty
//3. Click on login button
//4. Verify error message with text "Password cannot be empty" is displayed
public class Homework1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

	setUp();
	
	wait(1);
	PaswrdCtBeEmtyFactory login = new PaswrdCtBeEmtyFactory();
	
	sendText(login.username, ConfigsReader.getProperty("username"));

	login.loginBtn.click();
	
	wait(2);
	
	String expectedmsg = "Password cannot be empty";
	String actualmsg = login.errorpsd.getText();
	
	if (expectedmsg.equals(actualmsg)) {
		System.out.println("Test Passed! Password cannot be empty is displayed!");
	} else {
		System.out.println("Test Failed!!!");
	}

	wait(4);
	tearDown();

}

}
