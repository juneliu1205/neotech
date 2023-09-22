package com.neotech.lesson30;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {

	public static void main(String[] args) {

		/*
		 * Create a map of countries with its capital that will store countries in
		 * alphabetical order. Add them randomly in the map. 
		 * Example: 
		 * "France" -> "Paris" 
		 * "Kosovo" -> "Prishtina" 
		 * "Turkiye" -> "Ankara" 
		 * "USA" -> "Washington DC"
		 * "Albania" -> "Tirana" 
		 * "Italy" -> "Rome"
		 * 
		 * - Print the list and check the order of the countries. 
		 * - Verify if you have your country (Albania, Turkiye) in the list ( use containsKey() method ) -
		 * Verify if a specific capital city is in the list ( use containsValue() method
		 * ) 
		 * - Get all the keys (countries names) in a Set. Print all country names
		 * using for each loop. 
		 * - Get all the values (capital names) in a Collection.
		 * Print all capital names using iterator.
		 */
		
		
		Map<String, String> countries = new TreeMap<>();
		countries.put("France",	"Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkiye","Ankara");
		countries.put("USA", "DC");
		countries.put("Albania", "Tiran");
		countries.put("Italy", "Rome");
		
		
		//Print the list and check the order of the countries.
		System.out.println(countries);
		
		//Verify if you have your country (Albania, Turkiye) in the list
		System.out.println("Does the map contain Albania");
		System.out.println(countries.containsKey("Albania"));
		
	//**************SCANNER***********************************	
	/*
	 * //can a user ask for an entry: Scanner scan = new Scanner(System.in);
	 * System.out.println("Check if a country is in the map: "); String country =
	 * scan.next();
	 * 
	 * 
	 * //checking if it is in the map: System.out.println("Does the map contains: "
	 * + country); System.out.println(countries.containsKey(country));
	 */	//**************SCANNER***********************************	

		
		//Verify if a specific capital city is in the list 
		System.out.println("Does the map include Valetta?");
		System.out.println(countries.containsValue("Valetta"));
		
		
		
		//Get all the keys (countries names) in a Set. Print all country names using for each loop. 
		
		//1st way
		Set<String> set = countries.keySet();
		
		for (String c : set)
		{
			System.out.print(c + " ");
		}
		System.out.println();
		
		//2nd way: 
		
		for (String s: countries.keySet())
		{
			System.out.print(s + " ");
		}
		System.out.println();
		
	//	Get all the values (capital names) in a Collection. Print all capital names using iterator.
		
		//1st way:
		Collection<String> values = countries.values();
		
		Iterator<String> it = values.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//2nd 
		Iterator<String> it2 = countries.values().iterator();
		while(it2.hasNext())
		{
			System.out.print( it2.next() + " ");
		}
		
		
	}

}