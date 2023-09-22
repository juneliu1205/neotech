package com.neotech.lesson25;

public class WebDriverCameraTest {

	public static void main(String[] args) {
		
		
		WebDriver w1 =new ChromeDriver();
		w1.openBrowser();
		w1.closeBrowser();
		w1.findElement();
		w1.maximizeWindow();
		
		Camera c1= new ChromeDriver();
		c1.takePicture();
		
		System.out.println("-----------------------");
		
		WebDriver w2 = new FirefoxDriver();
		w2.openBrowser();
		w2.closeBrowser();
		w2.findElement();

		Camera c2= new FirefoxDriver();
		c2.takePicture();
		
		System.out.println("-----------------------");

		WebDriver Chrome = new ChromeDriver();
		WebDriver Firefox = new FirefoxDriver();
		
		WebDriver[] drivers = { Chrome, Firefox};
		
		WebDriver[] driversArray= {new ChromeDriver(),
				new FirefoxDriver()};

		for (WebDriver w : driversArray) {
			w.openBrowser();
			w.closeBrowser();
			w.findElement();
			w.maximizeWindow();
		}
		
	}

}
