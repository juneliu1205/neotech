package com.neotech.lesson19;

public class Task1 {
	/*
	 * Create a method that will accept an array as parameters and 
	 * will return a sum of all elements from that array. 
	 * Method should be visible only within the same package and accessible 
	 * by creating an instance of the class. Call this
	 * method from inside the class and another class in the same package .
	 */
	
	//return type -- sum is int
	//parameter type -- int[]
	//visible within the same package -- protected/default
	//accessible by creating an instance -- instance method (not a static method)
	
	
	protected int sum(int[] arr)
	{
		int sum = 0;
		
		//using indexed for loop
//		for (int i = 0; i < arr.length; i++)
//		{
//			sum += arr[i];
//		}
		
		//using enhanced for loop
		
		for (int el : arr)
		{
			sum += el;
		}
		
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		
		Task1 obj = new Task1();
		int[] array = {55,26,35,45,11,94,57};
		int sum = obj.sum(array);
		
		System.out.println("The total sum of the array is: " + sum);
		
		
	}
	
}