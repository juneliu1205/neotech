package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework_7two extends BaseClass {
	//HW_2_Handling Frames
//	1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
//	2) Verify on the page header "Not a Friendly Topic" displayed
//	3) Click on the Inner Frame Check box
//	4) Choose baby Cat from Animals dropdown
	
	public static void main(String[] args) throws InterruptedException {
	
		setUp();
	 
        WebElement header = driver.findElement(By.xpath("//div[@class='card mb-3']/label/span"));
		
		String hd = header.getText();
		String expecthd = "Not a Friendly Topic";
		
		if (hd.equals(expecthd)) {
			System.out.println("Test Passed!");

		}else {
			System.out.println("It failed!");
		}
	
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(childFrame);

		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(2000);
	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement aniamalFrame = driver.findElement(By.id("animals"));
	
		Select selDD = new Select(aniamalFrame);
		selDD.selectByVisibleText("Baby Cat");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		tearDown();
	}
}
