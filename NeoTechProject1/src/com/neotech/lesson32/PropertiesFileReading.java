package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		// Tell Java where the file is located

		// 1. Locate your .properties file
		String filePath = "/Users/admin/Downloads/Untitled/NeoTechProject/configs/confi.properties";

		// 2. Create an object of FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		// 3. To handle .properties files; we need to use Properties class in Java
		Properties prop = new Properties();

		// 4. load information from .properties files using load() method
		prop.load(fis);

		String name = prop.getProperty("name");
		System.out.println("name -> " + name);

		// Keys are case-sensitive 
		String lastName = prop.getProperty("lastname");
		System.out.println("lastName -> " + lastName);

		System.out.println("--------------------------------");

		Set<Object> keys = prop.keySet();
		Collection<Object> values = prop.values();

		for (Object key : keys) {
			System.out.println(key);
		}

		System.out.println("--------");

		for (Object value : values) {
			System.out.println(value);
		}

	}

}