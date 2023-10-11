package com.neotech.review04;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class ScreenshotExample extends CommonMethods {

	public static void main(String[] args) {
		// https://www.facebook.com/
		setUp();

		wait(1);

		// Taking the screenshot of the whole page
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenshots/FacebookLogin.png");
		
		try {
			Files.copy(source, destination);
		} catch (IOException e) {
			System.out.println("Couldn't save the screenshot!");
			e.printStackTrace();
		}

		tearDown();

	}
}