package com.neotech.lesson19;

public class Homework19 {


		//Homework 1:
		//Create a method that will accept a String as a 
		//parameter and return a new String 
		//that consist only of vowels. 
		//Method should be available inside the class where 
		//it was declared and executed by calling it is name.

		public static String Vowels(String input){
			
		String onlyVowels="";
		
		for (int i=0; i<input.length()-1; i++ ){
			char c= input.charAt(i);
			if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
				onlyVowels+=c;
			}
			}
		return onlyVowels;
		}
		
		
		public static void main(String[] args) {
		String str="The student was practising making a new vowel sound.";
		String onlyVowels= Vowels(str);
		System.out.println("Vowels:"+ onlyVowels);
		
		
}

}
