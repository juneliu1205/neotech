package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass{
//	    Alert text verification
//      Open chrome browser
//      Go to https://demoqa.com/
//      Click on "Alerts, Frame & Windows" link
//      Click on "Alerts" links on the left side
//      Click on button to see Alert
//      Verify alert box with text "You clicked a button" is present
//      Click on 3rd button in the page
//      Verify alert box with text "Do you confirm action?" is present and click "confirm"
//      Click on 4 th button in the page and enter your name and click ok.
//      Quit browser
	
	public static void main(String[] args) throws InterruptedException {
	
		setUp();
	
		driver.findElement(By.xpath("(//div[@class='card-body'])[3]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//li[@id='item-1'])[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("alertButton")).click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		String alertText = simpleAlert.getText();
		if (simpleAlert.getText().equals("You clicked a button")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed!");
		}
		simpleAlert.dismiss();
		
		
		driver.findElement(By.id("confirmButton")).click();
		Alert secondAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText2 = secondAlert.getText();
		if (secondAlert.getText().equals("Do you confirm action?")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed!");
		}
		simpleAlert.dismiss();
		
		
		driver.findElement(By.id("promtButton")).click();
		Alert lastAlert = driver.switchTo().alert();
		lastAlert.sendKeys("June");
		lastAlert.accept();
		Thread.sleep(8000);
		
		tearDown();
		
}

}