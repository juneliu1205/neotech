package com.neotech.lesson26;

class FireFoxDriver implements RemoteWebDriver {

	String driver = "FireFox Driver";

	@Override
	public void open() {
		System.out.println("Open a browser with " + driver);
	}

	@Override
	public void close() {
		System.out.println("CLose a browser with " + driver);
	}

	@Override
	public String getTitle() {
		return driver;
		}

	@Override
	public void navigate() {
		System.out.println("Navigate with " + driver);
	}

	@Override
	public void getScreenshot() {
		System.out.println("Get screenshot with " + driver);
	}
}
class ChromeDriver implements RemoteWebDriver
	{

	String driver ="Chrome Driverr";

		@Override
		public void open() {
			System.out.println("Open a browser with "+ driver);
		}
		@Override
		public void close() {
			System.out.println("CLose a browser with "+ driver);
		}
		@Override
		public String getTitle() {
			return driver;
		} {
	}
		@Override
		public void navigate() {
			System.out.println("Navigate with "+ driver);
		}
		@Override
		public void getScreenshot() {
			System.out.println("Get screenshot with "+ driver);
		}
		}
class SafariDriver implements  RemoteWebDriver
		{

		String driver ="SafariDriver";

			@Override
			public void open() {
				System.out.println("Open a browser with "+ driver);
			}
			@Override
			public void close() {
				System.out.println("CLose a browser with "+ driver);
			}
			@Override
			public String getTitle() {
				return driver;
			} {
		}
			@Override
			public void navigate() {
				System.out.println("Navigate with "+ driver);
			}
			@Override
			public void getScreenshot() {
				System.out.println("Get screenshot with "+ driver);
			}
		}
