package com.neotech.review06;

public class ToCharArray {
	public static void main(String[] args) {
		
		String longStr = "I am very happy today because its a weekend";

		System.out.println("String length ---> " + longStr.length());
		
		char[] charArray = longStr.toCharArray();
		
		System.out.println("char[] length ---> " + charArray.length);
		
		//print the array 
		for (char el : charArray)
		{
			System.out.print(el + "|");
		}
		System.out.println();
		
		for (int i = 0; i < charArray.length; i++)
		{
			System.out.print(charArray[i] + "|");
		}
		System.out.println();
		
		
		//Task: print the whole array, but replace 'a' with 'e'
		//Dont use replace or replaceAll
		
		System.out.println("Print the whole array, but replace \"a\" with \"e\"");
		
		
		//write your code here
		for (char el : charArray)
		{
			
			//if there is only one statement inside the if we can remove the curly brackets
			if (el == 'a')
				System.out.print('e');
			else 
				System.out.print(el);
		}
		
	}

}