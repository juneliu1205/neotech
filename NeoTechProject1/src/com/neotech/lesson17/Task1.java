package com.neotech.lesson17;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class
		 * today?”
		 * 
		 * How would you find out how many sentences are in that String?
		 */

		
		/*
		 * 
		 * " \n, \t, \?  ---> those have a special meaning to Java.
		 *  We can use \\?, or regex [?]
		 */
	
		//recall:
		System.out.println("\"Sabah\"");
		
		String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] array = str.split("\\?");
		System.out.println("Array length is: " + array.length);
		
		for (String sentence : array)
		{
			System.out.println(sentence);
		}
		
		//Is it saturday! Is it Raining? We have a class today.
		
		
		String str2 = "Is it saturday! Is it Raining? We have a class today.";
		
		String[] array2 = str2.split("[?!.]"); //split when you see one of these characters
	
		for(String sentence2 : array2)
		{
			System.out.println(sentence2);
		}
		
		//how can I get the number of sentences?
		int num = array2.length;
		
		
		
	}

}