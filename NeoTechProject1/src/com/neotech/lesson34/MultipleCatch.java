package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args)  {
	
		String filePath = System.getProperty("user.dir") + "/configs/example.properties";

		try {
			FileInputStream fis = new FileInputStream(filePath);
			
			fis.close(); //causing an IOExceptions -- intentionally
			
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println(prop);
			
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
			System.out.println("Check you filePath");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			System.out.println("Could not load properties!!");
		}
		
		
		System.out.println("End of code!");
	}

}