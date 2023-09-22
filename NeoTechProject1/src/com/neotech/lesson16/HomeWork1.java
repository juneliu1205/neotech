package com.neotech.lesson16;

public class HomeWork1 {
	
	public static void main(String[] args) {

//	Homework 1:
//  Create a String that will hold a sentence. Write a program to get a 
//  new String without any spaces.
//

	String sentence = "I dont know what to write.";
	System.out.println(sentence.replace(" ", ""));


			String str = "So sorry that we did not cover replace methods!";
			
			String str2 = str.replace(" ", "");
			
			System.out.println(str2);
			
			System.out.println("old -> " + str + "; length: "+str.length());
			System.out.println("new -> " + str2 + "; length: "+str2.length());
			
	
	
	
	
	 
	
}
	}