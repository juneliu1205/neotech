package com.neotech.lesson25;

public class FileTest {

		public static void main(String[] args) {
			
			//File f = new File();
			
			
			File java = new JavaFile();
			File pdf = new PdfFile();
			
			//1st way: putting existing object in the array
			File[] files = {java, pdf};
			
			//2nd way: creating the object in the array
			File[] fileArray = {new JavaFile(),
					new PdfFile(), new WordFile(), 
					new JavaFile()};
			
			for ( File f : fileArray)
			{
				//I am able to call open for each 
				//file type
				f.open();
			}
			
			
		}

	}