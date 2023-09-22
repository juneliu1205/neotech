package com.neotech.lesson12;

public class Task4 {

	public static void main(String[] args) {
	
//	
//	
//	//find the largest number in array (1D)
//	
//	int [] numbers = {23, 56, -75, 16, 80, 70, -40};
//	
//	
//	int largest= numbers[0]; // let us assume the largest number is the first one
//	
//	//loop thru all number, to compare with my current largest number
//	for (int num:numbers)
//	{
//	if (num> largest) 
//	{
//		largest= num;
//	}
//	}
//	 System.out.println(largest);
//		
//	
//	//Using indexed for loop
//	 
//	 int max=numbers[0];
//	 for (int i=1; i<numbers.length; i++)
//	 {
//		 if (numbers[i] > max)
//		 {
//			 max = numbers[i];
//		 }
//	 }
//	 System.out.println(max);
//	
	

		//find the largest number in array (1D)
		
		int [] number2 = {78, 89, -59, 22, 10, 90, -40};
		int largest= number2[0];
	
	for (int num:number2) 
	{
		if (num>largest)
		{
			largest=num;
		}
	}
		System.out.println(largest);
	

	}

}
