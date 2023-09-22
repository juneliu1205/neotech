package com.neotech.lesson27;

public class Homework2 {

		public static void main(String[] args) {
			// you can not create an object from an interface
			// RemoteWebDriver rwd = new RemoteWebDriver();

			ChromeDriver cd = new ChromeDriver();
			cd.open();

			FirefoxDriver fd = new FirefoxDriver();
			fd.open();

			SafariDriver sd = new SafariDriver();
			sd.open();

			System.out.println(" ---upcasting---");
			RemoteWebDriver rwd1 = cd; // up-casting
			rwd1.open();

			RemoteWebDriver rwd2 = fd; // up-casting
			rwd2.open();

			RemoteWebDriver[] remoteArray = new RemoteWebDriver[3];
			remoteArray[0] = cd;
			remoteArray[1] = fd;
			remoteArray[2] = sd;

			for (RemoteWebDriver driver : remoteArray) {
				System.out.println("---------");
				driver.open();
				driver.getScreenShot();
				System.out.println(driver.getTitle());
				driver.navigate();
				driver.close();
			}
		}

	}