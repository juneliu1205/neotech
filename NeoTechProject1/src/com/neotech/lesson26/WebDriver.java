package com.neotech.lesson26;

public interface WebDriver {
 
	void open();
	void close();
	String getTitle();
}

interface TakeScreenshot {
	void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakeScreenshot  {
	void navigate();
}

