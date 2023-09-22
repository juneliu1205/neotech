package com.neotech.review11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
	//Search in google:apache poi read excel file example
	
		String fullPath = System.getProperty("user.dir")+ "/extra/Excel.xlsx";
		
		FileInputStream fis = new FileInputStream (fullPath);
		
		//Get the whole excel file
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		//Get row index2 from the whole sheet
		Row row2=sheet.getRow(2);
		
		//Get the cell from index1 from the row
		Cell cell1= row2.getCell(1);
		
		//Print the information of the cell
	System.out.println(cell1.toString());
	
	//Lets get the headers of the sheet and print them
	Row headerRow=sheet.getRow(0);
	
	//How many cell are in the headerrow?
	int cellNumber = headerRow.getLastCellNum();
	
	System.out.println("--------------------------------------------------------------------------------");
	
	for (int i=0; i<cellNumber; i++) {
		String cellData=headerRow.getCell(i).toString();
		System.out.print(cellData+ "\t");
	}
	System.out.println();
	System.out.println("--------------------------------------------------------------------------------");
	
	//How many row are in the sheet?
	int rows=sheet.getPhysicalNumberOfRows();
	
	//I am skipping the row with index0, becasue i already print it
	for (int row=1; row<rows; row++) {
		//for each row, iterate from (cell 0) to the (last cell)
		for (int cell=0; cell<4;cell++) {
			String cellInfo=sheet.getRow(row).getCell(cell).toString();
			System.out.print(cellInfo+ "\t");
		}
		System.out.println();
	}
		
	}

}
