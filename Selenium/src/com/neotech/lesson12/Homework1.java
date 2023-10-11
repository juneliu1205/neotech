package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//          Open chrome browser
//		    Go to https://demo.guru99.com/test/drag_drop.html
//			Drag the following blocks in different ways
//			Drag BANK to DEBIT SIDE
//			Drag SALES to CREDIT SIDE
//			Drag 5000 to DEBIT SIDE
//			Drag 5000 to CREDIT SIDE
//			Close the browser
		
		setUp();
		Actions act = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]/a"));
		WebElement drop = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		act.dragAndDrop(drag, drop).perform();
		
		wait(1);
		WebElement drag2 = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[6]/a"));
		WebElement drop2 = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		act.dragAndDrop(drag2, drop2).perform();
		
		wait(1);
		WebElement drag3 = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]/a"));
		WebElement drop3 = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		act.dragAndDrop(drag3, drop3).perform();
		
		wait(1);
		WebElement drag4 = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[4]/a"));
		WebElement drop4 = driver.findElement(By.xpath(" //ol[@id='amt8']//li[@class='placeholder']"));
		act.dragAndDrop(drag4, drop4).perform();
		
		
		
		
		
		wait(3);
		
		tearDown();
	}

}