package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	
	
	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String username = "Tester";
	public static String password = "test";
	public static void main(String[] args) throws InterruptedException {
//		Open chrome browser
//		Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		Enter valid username
//		Clear username and enter again valid username
//		Leave password field empty
//		Click on login button
//		Verify error message with text "Invalid Login or Password." is displayed.

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		WebElement un = driver.findElement(By.id("ctl00_MainContent_username"));
		un.sendKeys(username);
		un.clear();
		
		Thread.sleep(5000);
		
		WebElement un2 = driver.findElement(By.id("ctl00_MainContent_username"));
		un2.sendKeys(username);
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		WebElement msg = driver.findElement(By.id("ctl00_MainContent_status"));
		
		String errorMsg = msg.getText();
		String expectedMsg = "Invalid Login or Password";
		
		
		if (errorMsg.equals(expectedMsg)) {
			System.out.println("Test Passed!");

		}else {
			System.out.println("It failed!");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
