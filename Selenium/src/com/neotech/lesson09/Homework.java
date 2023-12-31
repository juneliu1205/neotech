package com.neotech.lesson09;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;
//TC: Update Customer Information
//
//1) Open chrome browser
//2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//3) Login to the application
//4) Verify customer "Susan McLaren" is present in the table
//5) Click on customer details
//6) Update customers last name and credit card info
//7) Verify updated customers name and credit card number is displayed in table
//8) Close browser
public class Homework extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	
		String expected = "Susan McLaren";
		List <WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		
		for (int i = 1; i <rows.size(); i++)
		{
			String rowText = rows.get(i).getText();
			if (rowText.contains(expected))
			{
				System.out.println(expected + "is present in the list");
				System.out.println(expected);
				
				driver.findElement(By.xpath("//tbody/tr[6]/td[13]/input[1]")).click();
				Thread.sleep(2000);
				break; }
			}
		System.out.println("---------------------------------------------------------------");		
		WebElement name = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
		name.clear();
		name.sendKeys("Susan May");
		Thread.sleep(2000);
		WebElement cardInfo = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6"));
		cardInfo.clear();
		cardInfo.sendKeys("999555777666");
		Thread.sleep(2000);
		WebElement cardDate = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1"));
		cardDate.clear();
		cardDate.sendKeys("08/25");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		Thread.sleep(2000);
		
		String updatedInfo = "Susan May"; 
		List <WebElement> rows2 = driver.findElements(By.xpath("//table/tbody/tr"));
		for (int i = 0; i <rows2.size(); i++)
		{
			String info = rows2.get(i).getText();
			if (info.contains(updatedInfo))
			{
		System.out.println(updatedInfo + " in updated on the list");
	     }
		}
		Thread.sleep(1000);
		tearDown();
}
}
	
