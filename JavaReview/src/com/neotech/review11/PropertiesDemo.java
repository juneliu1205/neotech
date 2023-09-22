package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main (String [] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		
		//I created the full path to the file
		String filePath = projectPath + "/extra/demo.properties";
		System.out.println(filePath);
		
		//fileIS will help me read the file
		FileInputStream fileIS = new FileInputStream (filePath);
		
		//proper is a Map (kay-value pairs)
		Properties proper = new Properties();
		
		//load method will help me read from the file to the proprt-map
		
		proper.load(fileIS);
		System.out.println(proper);
		
		//1st way
		Object FirstName = proper.get("FirstName");
		System.out.println(FirstName);
		
		Object LastName = proper.get("LastName");
		System.out.println(LastName);
		
		
		//2nd way
		String school = proper.getProperty("School");
		System.out.println(school);
		
		//I will get age as a String because of the getProperty()
		String age =proper.getProperty("Age");
		System.out.println(age);
		
		String lastname =proper.getProperty("LastName");
		System.out.println(lastname);
		
		
		//add more key-value pairs
		proper.setProperty("SS", "543-678-3457");
		System.out.println(proper);
		
		//Re-assign the Age
		proper.setProperty("Age", "55");
		System.out.println(proper);
		
		
		//Now let us save into a new file
		//The oath to the new file
		String newPath = projectPath + "/extra/NewFile.txt";
		FileOutputStream fileOS= new FileOutputStream(newPath);
		proper.store(fileOS, "Onder is very happy");
		
		
		
		
		
	}
	
}
