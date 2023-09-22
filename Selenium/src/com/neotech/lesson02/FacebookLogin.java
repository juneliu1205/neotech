package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver(); // up-casting
		
		driver.get("https://www.facebook.com/");
		
		//type your email in the username box
		driver.findElement(By.id("email")).sendKeys("neo@gmail.com");
		Thread.sleep(1000);
		
		//type your password int the password box
		WebElement pw=driver.findElement(By.id("pass"));
		pw.sendKeys("34dkalkad");
		Thread.sleep(2000);
		
		//it didnt work. because the id is not working
		//driver.findElement(By.id("u_0_5_t4")).click();
		
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}










