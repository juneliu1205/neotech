package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//1. Read the third row (row index 2) and create an ArrayList of String. 
//Then print the ArrayList.

//2. Read the fifth column (col index 4) and create an HashSet of Double. 
//Then print the HashSet.


public class Homework {

	public static void main(String[] args) throws IOException {

		String filePath=System.getProperty("user.dir")+"/test_data/Homework.xlsx";
		
		FileInputStream fis= new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Companies");
		
		int rows = sheet.getPhysicalNumberOfRows();
		
		ArrayList<String> row2= new ArrayList<>();
		
		for (int i=0; i<rows; i++) {
			row2.add(sheet.getRow(2).getCell(i).toString());		
		}
		System.out.println(row2);
		
		HashSet<Double> col4= new HashSet<>();
		
		int cols = sheet.getRow(0).getLastCellNum();
		
		for (int j=1; j<cols; j++) {
			col4.add(Double.valueOf(sheet.getRow(j).getCell(4).toString()));
		}
		System.out.println(col4);
		
	}

}
