package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        
		WebDriver driver = new ChromeDriver();
		
		String url="https://www.instagram.com/";
		// driver.get(url);
		// will wait for the page and elements to be loaded
		// will NOT keep the history
		
		driver.navigate().to(url);
		// will NOT wait for the page and elements to be loaded
		// will keep the history
		
		driver.manage().window().maximize();//make full screen
		Thread.sleep(1000);
		
		driver.manage().window().minimize();//will minimize screen
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.mlssoccer.com/");
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.fifa.com/");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
