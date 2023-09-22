package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
//		// Facebook dropdown verification
//        Open chrome browser, Go to https://www.facebook.com/r.php
//
//        Verify:
//        month dd has 12 month options
//        day dd has 31 day options
//        year dd has 118 year options
//        Select your date of birth	
//        Quit browser

		setUp();

		//1st way:
		//create a WebElement for each
		//create a Select for each
		//call the options for each of them
		
		
		
		//2nd way:
		Select selmonth = new Select(driver.findElement(By.id("month")));
		Select selday = new Select(driver.findElement(By.id("day")));
		Select selyear = new Select( driver.findElement(By.id("year")));
		
		System.out.println("The number of options for year is " + selyear.getOptions().size());
		System.out.println("The number of options for month is " + selmonth.getOptions().size());
		System.out.println("The number of options for day is " + selday.getOptions().size());
		
		selmonth.selectByValue("12");
		selday.selectByValue("5");
		selyear.selectByValue("1985");
		
		Thread.sleep(5000);
		
		
		tearDown();
	
	}

}
