package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//	Homework 1: File Upload
//	Upload a file:
//	http://webdriveruniversity.com/File-Upload/index.html

		setUp();

		String filePath = System.getProperty("user.dir") + "/screenshots/HRM/Homework12.png";

		sendText(driver.findElement(By.id("myFile")), filePath);

		wait(4);

		click(driver.findElement(By.id("submit-button")));

		wait(4);

		tearDown();
	}

}