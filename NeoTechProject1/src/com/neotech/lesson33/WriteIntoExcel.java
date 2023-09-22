package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("TestData");

		// I want to add a new column called Country
		sheet.getRow(0).createCell(5).setCellValue("Country");

		// I want to create a new row
		sheet.createRow(3).createCell(0).setCellValue("Fulin");
		sheet.getRow(3).createCell(1).setCellValue("Cebe");

		// Can i create a new sheet?
		book.createSheet("June");

		FileOutputStream fos = new FileOutputStream(filePath);
		book.write(fos);

	}

}