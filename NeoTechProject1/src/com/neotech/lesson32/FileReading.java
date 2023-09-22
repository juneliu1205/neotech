package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {
	
	public static void main(String[] args) throws IOException {
		
		// Full path
		String fullPath = "/Users/admin/Downloads/Untitled/NeoTechProject/configs/example.properties";
		System.out.println(fullPath);
		
		// Find the user directory
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		// Find the user name
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		// Find the operating system
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		System.out.println("--------------------------------");

		//Let's create a dynamic path
		String dynamicFilePath = System.getProperty("user.dir") + "/configs/conf.properties";
		System.out.println(dynamicFilePath);
		
		FileInputStream fis = new FileInputStream(dynamicFilePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		System.out.println(prop.getProperty("browser"));
		
	}

}