package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class GoogleTest extends CommonMethods {
	//https://www.google.com/
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement searchBox= driver.findElement(By.name("q"));
		
		sendText(searchBox, "bitcin");
		
		wait(2);
		
		searchBox.sendKeys(Keys.ENTER);
		
		wait(2);
		
		tearDown();

	}

	}
