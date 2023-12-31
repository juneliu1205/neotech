package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class AmericanAirlines extends BaseClass {

//	Open chrome browser
//	Go to https://www.aa.com/homePage.do
//	Enter From and To
//	Select departure as December 14 of 2022
//	Select arrival as December 22 of 2022
//	Click on search
//	Close browser
	public static void main(String[] args) throws InterruptedException {

		// https://www.aa.com/homePage.do

		setUp();
		WebElement from=driver.findElement(By.xpath("//input[@id=\"reservationFlightSearchForm.originAirport\"]"));
		from.clear();
		from.sendKeys("IAD");

		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("TPE");

		driver.findElement(By.xpath("//form[@id='reservationFlightSearchForm']/div[4]/div[1]/div/button")).click();

		String departmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

		while (!departmonth.equals("November")){
			driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
			
			departmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		
		List<WebElement>ddays=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement dday:ddays) {
			String ddayNum=dday.getText();
			if(ddayNum.equals("15")) {
				dday.click();
				break;
			}			
		}		
		driver.findElement(By.xpath("//form[@id='reservationFlightSearchForm']/div[4]/div[2]/div/button")).click();
		// return month

		String returnMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

		while (!returnMonth.equals("March")){
			driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
			returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		List<WebElement>rDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement rday : rDays) {
			String rdayNum = rday.getText();
			if (rdayNum.equals("20")) {
				rday.click();
				break;
			}
		}
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']")).click();
		Thread.sleep(10000);
		tearDown();

	}
}