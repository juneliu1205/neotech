package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {
	
	// We are going to read
	// Make changes
	// Write to the same file
	
	public static void main(String[] args) throws IOException {
		
		// 1. Locate your .properties file
		String filePath = "/Users/admin/Downloads/Untitled/NeoTechProject/configs/example.properties";

		// 2. Create an object of FileInputStream
		FileInputStream fis = new FileInputStream(filePath);
		
		// 3. To handle .properties files; we need to use Properties class in Java
		Properties prop = new Properties();
		
		// 4. load information from .properties files using load() method
		// if we forget to load the file, we will loose the informatio
		prop.load(fis);
		
		// Changing the state to Florida
		prop.setProperty("state", "Florida");
		
		//Adding a new property
		prop.setProperty("phone", "1234567890");
		
		// To write to the file, we need to use FileOutputStream
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "We just updated the file");
	}

}