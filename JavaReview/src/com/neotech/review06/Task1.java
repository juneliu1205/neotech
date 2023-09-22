package com.neotech.review06;

public class Task1 {

	public static void main(String[] args) {

		// Print the whole array, but replace 'a' with 'e'
		// Don't use replace or replace all

		String words = "I am very happy today because its a weekend";
		
		char[] chrr = words.toCharArray();
        
		for (char c: chrr) {
			if (c=='a') {
				c='e';
			}
			System.out.print(c);
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
