package com.neotech.lesson13;

public class HomeWorkIQ {

	public static void main(String[] args) {
		
		//Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		int [] numbers = {10, 25, 45, 67, 79, 85, 98};
		int temp,size;
		size=numbers.length;
		
		for (int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
			if (numbers[i]> numbers[j]) {
				temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
			}
			}
			}
		System.out.println("The Second Largest number is: " + numbers[size-2]);
		
	}

}
