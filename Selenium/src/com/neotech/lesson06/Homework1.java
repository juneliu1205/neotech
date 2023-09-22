package com.neotech.lesson06;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
//		 Amazon Department List Verification
//	     Open chrome browser
//	     Go to "http://amazon.com/"
//	     Verify how many department options available.
//	     Print each department 
//	     Select Computers
//	     Quit browser

		setUp();
		
		WebElement dp = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select selDD = new Select(dp);
		
		List<WebElement> options = selDD.getOptions();
		System.out.println("The department options list is: " + options.size());

		for (int i = 0; i < options.size(); i++)
		{
			System.out.println(options.get(i).getText());
			Thread.sleep(2000);
		}
		
		
		selDD.selectByValue("search-alias=computers");
		Thread.sleep(3000);
		
		tearDown();
		
	}

}
