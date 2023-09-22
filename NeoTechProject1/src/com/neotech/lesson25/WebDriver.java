package com.neotech.lesson25;

public interface WebDriver {
 
	 void openBrowser();
	 void closeBrowser();
     void maximizeWindow();
	 void findElement();
}

interface Camera
{
void takePicture();
}
	
class ChromeDriver implements WebDriver, Camera
{
	@Override
	public void openBrowser() {
		System.out.println("Open Web Browser");
	}
	@Override
	public void closeBrowser() {
		System.out.println("Close Web Browser");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("Maximize Web Window");
	}
	@Override
	public void findElement() {
		System.out.println("Find Web Element");
	}
	@Override
	public void takePicture() {
		System.out.println("Take picture with Chrome");
	}
}

	class FirefoxDriver implements WebDriver, Camera
	{   @Override
		public void openBrowser() {
			System.out.println("Open Firefox Driver Browser");
		}
	    @Override
		public void closeBrowser() {
			System.out.println("Close Firefox Driver Browser");
		}
	    @Override
		public void maximizeWindow() {
			System.out.println("Maximize Firefox Driver Window");
		}
	    @Override
		public void findElement() {
			System.out.println("Find Firefox Driver Element");
		}
	    @Override
		public void takePicture() {
			System.out.println("Take picture with Firefox");
		}

	}
	
