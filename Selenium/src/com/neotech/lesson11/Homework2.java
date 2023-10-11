package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods {
//	Homework 2:
//	    WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java

	public static void main(String[] args) throws InterruptedException {
		// https://accounts.google.com/signup
		
		setUp();
		
		System.out.println("Title  of the main window-> " + driver.getTitle());
		System.out.println("Handle of the main window-> " + driver.getWindowHandle());
		click(driver.findElement(By.linkText("Help")));
		
		wait(2);
		
		switchToChildWindow();
		wait(2);
		
		System.out.println("Title of the child window-> " + driver.getTitle());
		System.out.println("Handle of the child window-> " + driver.getWindowHandle());
		wait(2);
		tearDown();
}
}