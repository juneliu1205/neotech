package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task extends CommonMethods {
	// https://the-internet.herokuapp.com/key_presses
	// Press TAB, ESC & ENTER

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement searchBox = driver.findElement(By.id("target"));

		wait(1);

		searchBox.sendKeys(Keys.TAB);

		wait(1);

		searchBox.sendKeys(Keys.ESCAPE);

		wait(1);

		searchBox.sendKeys(Keys.ENTER);

		wait(1);
		
		//key chaining
		//searchBox.sendKeys(Keys.TAB.ESCAPE.ENTER);
		
		wait(2);
		tearDown();

	}

}
