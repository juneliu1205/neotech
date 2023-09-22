package com.neotech.lesson12;

public class Task3 {
	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values 
		//from an array print capital for each country.

		String[] countries = {"Albania", "Turkiye", "Ukraine", "Mongolia", "Burkina Faso"};
		

		
		//1st way
		
		for (int i = 0; i < countries.length; i++)
		{
			if (countries[i].equals("Albania"))
			{
				System.out.println(countries[i] + "-Tirana");
			}
			else if(countries[i].equals("Turkiye"))
			{
				System.out.println(countries[i]+ "-Ankara");
			}
			else if (countries[i].equals("Ukraine"))
			{
				System.out.println(countries[i] + "-Kiev");
			}
			else
			{
				System.out.println("I do not know!");
			}

		}
		
		System.out.println("------------------------");
		
		for (String country : countries)
		{
			if (country.equals("Albania"))
			{
				System.out.println(country + "-Tirana");
			}
			else if (country.equals("Turkiye"))
			{
				System.out.println(country+ "-Ankara");
			}
			else if (country.equals("Ukraine"))
			{
				System.out.println(country + "-Kiev");
			}
			else
			{
				System.out.println("I do not know!");
			}
			
				
		}
		
		
		
		
	
		
	}

}