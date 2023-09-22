package com.neotech.lesson34;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Homework33 {

	public static void main(String[] args) throws IOException {


		/*
		 * Read Homework.xlsx file 
		 * Read Companies sheet
		 * 
		 * 1. Read the third row (row index 2) and create an ArrayList of String. Then
		 * print the ArrayList.
		 * 
		 * 2. Read the fifth column (col index 4) and create an HashSet of Double. Then
		 * print the HashSet.
		 */
		
		
		
		String filePath = System.getProperty("user.dir") + "/test_data/Homework.xlsx";
	//	System.out.println(filePath);
		
		
		// create a data stream with our file
		FileInputStream fis = new FileInputStream(filePath);
		
		
		
		//we want to read from an Excel file, so workbook
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Companies");
		
		
		//task1: read the third row
		
		Row r = sheet.getRow(2);
		int cols = r.getLastCellNum();
		
		List<String> al = new ArrayList<>();
		
		for (int c = 0; c < cols; c++)
		{
			//1st way:
			al.add(r.getCell(c).toString());
			
			//2nd way:
//			String cellData = r.getCell(c).toString();
//			al.add(cellData);
		}
		
		System.out.println(al);
		
		
		
		//task2: Read the fifth column (col index 4) and create an HashSet of Double
		
		Set<Double> hs = new HashSet<>();
		 
		//get the number of rows, so that we know how many times to loop
		int rows = sheet.getPhysicalNumberOfRows();
		
		//we want to start at index 1, get the value of all the rows in column with index 4
		for (int i = 1; i < rows; i++)
		{
			hs.add(sheet.getRow(i).getCell(4).getNumericCellValue());
		}
		System.out.println(hs);
		

	}

}