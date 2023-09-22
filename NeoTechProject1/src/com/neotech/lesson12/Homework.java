package com.neotech.lesson12;

public class Homework {

	public static void main(String[] args) {
//		1. Create a 2D array where you will store the following values:
//			- Mr, Mrs, Ms, Miss
//			-Smith, Jordan, Jackson, Obama.
//
//			After storing values print the following:
//			Mrs Smith, Mr Obama, Ms Jackson, Miss Jackson.
//
//			* Be careful because they are mixed.

		
		
		String[][]name = { {"Mr", "Mrs", "Ms", "Miss"},
		               {"Smith", "Obama", "Jackson", "Jackson"}};
		
		    System.out.println(
		    		        name[0][1]+" "+ name[1][0]+", " +
		    				name[0][0]+" "+ name[1][1]+", " +
		    				name[0][2]+" "+ name[1][2]+", " +
		    				name[0][3]+" "+ name[1][3]+". ");
	
	}

}
