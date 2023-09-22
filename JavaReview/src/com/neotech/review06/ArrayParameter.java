package com.neotech.review06;

import java.util.Arrays;

public class ArrayParameter {

	
	public static void main(String[] args) {

		
		int[] array = {6,8,4,6,3,7};
		
		System.out.println(array[2]);
		
		//printing using Arrays.toString()
		String str = Arrays.toString(array);
		System.out.println(str);
		
		
		//do I need an object to call largestNumber() method
		ArrayParameter ap = new ArrayParameter();
		int largest = ap.largestNumber(array);
		System.out.println("The largest number in the array is: " + largest);
		
		//calling the method:
		//to java the method looks like this: int arraySum(int[])
		int result = ap.arraySum(array); 
		System.out.println("The sum of the array is: " + result);
		
		//call the method again
		int[] anotherArray = {43,56,235,45675474,235345345,5685678};
		int result2 = ap.arraySum(anotherArray);
		System.out.println("The sum of the array is: " + result2);
		
		
		//you can call the arrayAvg() method here
		double avg = ap.arrayAvg(array);
		System.out.println("The average of the array is: " + avg);
	}

	
	//create a method that gets an int[] as parameter and return the largest 
	//number in the array. Make sure this method is visible from all classes in 
	//the project and that an object needs to be create to access it.
	
	//input ---> int[]
	//logic ---> given the array, find the largest element
	//output ---> int (the largest number)
	//visible everywhere ---> public
	//accessible by an object ---> non-static (instance method)
	
	public int largestNumber(int[] arr)
	{
		int largest = arr[0];
		
		for (int el : arr)
		{
			if (el > largest)
			{
				largest = el;
			}
		}
		
		return largest;
	}
	
	
	
	
	//create a method that gets an int[] as parameter and returns the of the 
	//elements in the array (int). The method should be visible only inside this class
	//and an object must be created to access it.
	
	//input: ---> int[]
	//logic: ---> get the sum of an array
	//output: ----> sum (int)
	//visible only within the same class: ---> private 
	//accessible using an object of the class: ----> instance method
	
	//access modifier    static/nothing		return type 	method name(inputs)
	private int arraySum(int[] myArray)
	{
		int sum = 0;
		
		//calculate sum
		for (int el : myArray)
		{
			sum += el;
		}
		
		//return the calculate sum
		return sum;
	}
	
	
	//Task3
	//Create a method that will get an array of integers as input and 
	//return the average as a double
	//the method should be visible only within the same class and 
	//should be accessed using the ClassName only.
	
	//input: int[]
	//logic: get the average--> get the sum and divide by length
	//output: average (double)
	//visible only within the same class: private
	//accessible using only ClassName: static ---> changed to non static
	
	//method signature: private static double arrayAvg(int[])
	private double arrayAvg(int[] array)
	{
		//how can I get the sum of the array???
	 double sum = arraySum(array); //change method to non static - because I cannot use instance elements
	 double avg = sum/array.length;
	 
	 return avg;	 
	}
	
	
}