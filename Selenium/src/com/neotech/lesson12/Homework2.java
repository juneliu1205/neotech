package com.neotech.lesson12;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods {
//	   https://hrm.neotechacademy.com/  1. Log in using our custom methods
//		2. Go to PIM menu 3. Add an employee
//		4. Go to Employee List 5. Get the list of the employees (Using tables - tr and td) 
//		6. Loop to search for the employee you added 7. When you find the employee - click on it.
//		8. Take a screenshot
	public static void main(String[] args) throws InterruptedException {
		setUp();

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		click(driver.findElement(By.xpath("//span[text()='PIM']")));
		wait(1);
		click(driver.findElement(By.xpath(" //span[text()='Add Employee']")));
		wait(1);
		sendText(driver.findElement(By.id("first-name-box")), "Jerry");
		wait(1);
		sendText(driver.findElement(By.id("last-name-box")), "Liu");
		wait(1);
		sendText(driver.findElement(By.id("employeeId")), "091405");
		wait(1);
		selectDropdown(driver.findElement(By.xpath("//select[@id='location']")), "Australian Regional HQ");
		wait(1);
		click(driver.findElement(By.id("modal-save-button")));
		wait(2);
		waitForVisibility(driver.findElement(By.xpath("//form[@id='pimPersonalDetailsForm']")));
		wait(2);
		click(driver.findElement(By.xpath("//span[text()='Employee List']")));
		wait(1);

		List<WebElement> list = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[3]"));

		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i).getText();
			if (name.equals("Jerry Liu")) {

				int j = i + 1;
				String path = "//table/tbody/tr[" + j + "]/td[3]";
				driver.findElement(By.xpath(path)).click();
				break;
			}
		}
		wait(8);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(sourceFile, new File("screenshots/HRM/Homework12.png"));

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!!!");
		}

		wait(2);

		tearDown();

	}

}