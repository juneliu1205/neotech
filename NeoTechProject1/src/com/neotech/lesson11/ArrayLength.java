package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		//array:collection of same type data
		
		String[] students=new String[5];
	    students [0] = "Jason";
	    students [1] = "Susan";
	    students [2] = "Abby";
	    students [3] = "Wong";
	    students [4] = "Julia";
	    
	    int arrayLength = students.length;
	    System.out.println("The Length of the students array is " + arrayLength);
	    
	    //Another way of declaring an array
	    
	    int [] scores = {90, 86, 94, 88, 80, 93, 33, 97};
	    System.out.println("The Length of the students array is " + scores.length);
	   
	    
	    System.out.println("Second scores is " + scores[1]);
	    
	    
	    int lastIndex=scores.length - 1;
	    System.out.println("Final scores is " + scores[lastIndex]);
	    
	    
	    
	}

}
