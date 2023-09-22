package com.neotech.lesson12;

public class TwoDimensionalArrayLength {

	public static void main(String[] args) {
	
		
	String [] [] months = {
			{"December", "January", "February"},
			{"March", "April", "May"},
			{"June", "July", "August"},
			{"September", "October", "November"},
	};
	
	
	//calling .length on the array, gives us the number of rows
	int rows= months.length; 
	System.out.println("rows --> " + rows);
	
	int lengthOfRowIndex1 = months[1].length;
	System.out.println("The length of the row with index 1 --> " + lengthOfRowIndex1);
	
	
	}

}