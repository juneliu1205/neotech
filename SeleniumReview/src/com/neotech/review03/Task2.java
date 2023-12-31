package com.neotech.review03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task2 extends BaseClass {
	    // Go to https://the-internet.herokuapp.com/tables
		// I want you to print all the data from the tbody of the second table
		// Create the path dynamically
		// Don't print the last column
	
	public static void main(String[] args) throws InterruptedException {
	
		setUp();
		
		int rows= driver.findElements(By.xpath("//table[2]//tbody/tr")).size();
		int cols= driver.findElements(By.xpath("//table[2]//tbody/tr[1]/td")).size();
		
		for (int i = 1; i <= rows; i++) { // iterating the row

			for (int j = 1; j <= cols-1; j++) { // iterating the columns
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.println(element.getText()+" | ");
			}
			System.out.println();
		}
		
		Thread.sleep(1000);

		tearDown();
	}

}