package com.neotech.lesson08;

public class HomeWork1 {

	public static void main(String[] args) {
		// Write a program using while loop that calculates the sum of the even numbers
		// between 0 and 10.

		//naive way:
		//System.out.println(2+4+6+10);
		
		//first way:
		//count from 0 to 10
		//check if the number is even
		//if yes add it on bucket
	
		int i=0;
		int sum =0;
		while (i<=10)
		{ 
			if (i%2 ==0) //if i is even number
			{
				sum=sum+i; //sum+=1;
			}		
			i++;
		}
		System.out.println("The sum is: " +sum);	
			
			
		//2nd way:	
		//0-10	
		//instead of going through all	number, I want  to travel only:
		//0 2 4 6 8 10
			
		int m=0;
		int sum2=0;
		while (m<=10)
		{
			sum2+=m; //add m to the sum2
			m+=2;
			//typically we put the increment at the end of the while block
			//sometime, base on the logic you are dealing with, it might be reasonable to
			//put it at the begining or even somewhere else within the {} of while
		}
		
		//int num = 0;
		//int sum = 0;
		//while (num <= 10) {
			
		//	sum += num;
		//	num += 2;
		//if 	(num <= 10) {
		//	System.out.println(num + " ");
		//}
			
		//}
		//System.out.println("calculates even numbers between 0 and 10 is : ");
		//System.out.print(sum);

	}
}
