package com.neotech.lesson11;

public class IntroToArrays {

	public static void main(String[] args) {
		
		//declare and assign value
		int num=5;
		
		//first dec;are, than assign value
		int num2;
		num2=5;
		
		//1st way
		int [] array1=new int [5];
		//2nd way
		int[] array2;
		array2= new int[8];
		
		
		//array1: [] [] [] [] [] [] 
		
		//how do we store values in array?
		array1[0]=10;
        //array1: [10]  []   []    []   []
		array1[1]=15;
		//array1: [10] [15]  []    []   []
		array1[2]=20;
		//array1: [10] [15]  [20]  []   []
		array1[3]=25;
		//array1: [10] [15]  [20] [25]  []
		array1[4]=30;
		//array1: [10] [15]  [20] [25]  [30]
		
		array1[0]=5;
		//array1: [5] [15]  [20] [25]  [30]
		
		//Lets create a string array
		String[] strArray = new String[4];
		
		strArray[0] = "New York";
		strArray[1] = "New Jersey";
		strArray[2] = "Atlanta";
		strArray[3] = "Colorado";
		//strArray[4] = "Reno";ERROR
		
		System.out.println("I live in " +strArray[3]);
		
		char [] letters= new char[6];
		letters[3] = 'C';
		letters[5] = 'A';
		letters[0] = 'B';
		letters[1] = 'X';
		System.out.println("I letter at index 5 is:  " + letters[5]);
		letters[5] = 'Y'; //re-assign
		System.out.println("I letter at index 5 is:  " + letters[5]);
		
		System.out.println(letters[0]);
		
	}

}
