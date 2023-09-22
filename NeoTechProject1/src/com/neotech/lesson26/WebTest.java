package com.neotech.lesson26;

public class WebTest {

	public static void main(String[] args) {
		FireFoxDriver fd = new FireFoxDriver();
		System.out.println(fd.getTitle());
		fd.open();
		fd.close();
		fd.navigate();
		fd.getScreenshot();
		System.out.println("------------------------------------");
		ChromeDriver cd = new ChromeDriver();
		System.out.println(cd.getTitle());
		cd.open();
		cd.close();
		cd.navigate();
		cd.getScreenshot();
		System.out.println("------------------------------------");
		SafariDriver sd = new SafariDriver();
		System.out.println(sd.getTitle());
		sd.open();
		sd.close();
		sd.navigate();
		sd.getScreenshot();
	}

}
