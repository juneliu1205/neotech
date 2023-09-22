package com.neotech.lesson13;

public class HomeWork {

	public static void main(String[] args) {
		// Homework 1:
		//Create an array of countries: north America countries, south America countries, 
		//Europe countries, Asian countries, African countries. 
		//Then print all values from that array using 2 different loops and calculate how 
		//many total countries been stored.

		
		String[][] countries = {
				{"canada", "mexico", "greenland"},
				{"brazil", "peru", "chile"},
				{"italy", "greece", "france"},
				{"taiwan", "thailand", "japan"},
				{"nigeria", "togo", "sudan"}
		};
		
		
		for (int row = 0; row < countries.length; row++)
		{
			for (int col = 0; col < countries[row].length; col++)
			{
				System.out.print(countries[row][col]  + " ");
			}
			System.out.println();	
		}
		 
		int sum =0;

		for (int row=0; row<countries.length; row++)
		{
          sum+= countries[row].length;
		}   
		System.out.println("total number of countries: "+ sum);	
		
		
		System.out.println("------------------------------------");	
	
		String[][] countries2 = {
				{"canada", "mexico", "greenland"},
				{"brazil", "peru", "chile"},
				{"italy", "greece", "france"},
				{"taiwan", "thailand", "japan"},
				{"nigeria", "togo", "sudan"}};
		
		
	for (String [] row:countries2)
	{
		for (String col:row)
		{
			System.out.print(col  + " ");
		}
		System.out.println();	
	}
		
		
		
		
		
		
		
		
		
	}

}
