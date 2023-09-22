package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Homework {

	public static void main(String[] args) throws IOException {

		// 1. Locate your .properties file
		String filePath = "/Users/admin/Downloads/Untitled/NeoTechProject/configs/Property";

		// 2. Create an object of FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		// 3. To handle .properties files; we need to use Properties class in Java
		Properties prop = new Properties();

		// 4. load information from .properties files using load() method
		prop.load(fis);

		String browser = prop.getProperty("browser");
		System.out.println("browser -> " + browser);

		String url = prop.getProperty("url");
		System.out.println("url -> " + url);

		String username = prop.getProperty("username");
		System.out.println("username -> " + username);

		String password = prop.getProperty("password");
		System.out.println("password -> " + password);

		System.out.println("--------------------------------------------------");
		Set<Object> keys = prop.keySet();

		for (Object key : keys) {
			System.out.println(key+"----->"+ prop.get(key));
		}
	}

}