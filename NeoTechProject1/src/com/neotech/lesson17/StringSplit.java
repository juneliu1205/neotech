package com.neotech.lesson17;

public class StringSplit {

	public static void main(String[] args) {
	
			// split()
			String sentence = "Today is Tuesday and we are learning Java!";
			String[] result = sentence.split(" ");
			
			for (String word : result)
			{  
				System.out.print(word + "|");
			}
				
			System.out.println();
			System.out.println("This sentence has " + result.length + " words!");
			
			
			String[] array = sentence.split("e");
			for (int i = 0; i < array.length; i++)
			{
				System.out.print(array[i] + "     ");
			}
			System.out.println();
		
			
			//we can use regex as split criteria
			
			String list = "1Nur2Cihan3Zeynep4Aylin";
			
			String[] arr = list.split("[^a-zA-Z]");
			
			for (int i = 0; i < arr.length; i++)
			{
				System.out.print(arr[i] + "\t"); //print the name and a tab space
			}
			
			//regular expression
			//[0-9] --> any numbers
			//[a-z] --> all lowercase letters
			//[A-Z] --> All uppercase letters
			//[a-zA-Z] --> all letters
			//[0-9a-zA-Z] -- All numbers and letters
			//[^0-9a-zA-Z] --> anything that is not a number or a letter
			
			//[abc] -- same as -- [a-c]
			//[^abc]---not abc
			
			//. --> any character
			//\d --> same as [0-9]
			//\s --> a white space character 
			
			
			//\s+ --> one or more space
			
		}
}
	