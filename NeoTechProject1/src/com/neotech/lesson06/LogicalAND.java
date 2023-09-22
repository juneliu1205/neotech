package com.neotech.lesson06;

public class LogicalAND {

	public static void main(String[] args) {

		// declare a number
        //if the number is between 1-10 --> number is small
		//if the number is between 11-100 --> medium
		//if the number is between 101-1000 --> large
		
		int num = 35;
		//if the number is >=1 AND <=10
		
		if (num >=1 && num <=10) //true && false--> false
		{
			System.out.println(num + " is small!");
		}
		else if (num >= 11 && num <= 100) //true && false--> false
		{
			System.out.println(num + " is medium!");
		}	
		else if (num>=101 && num <=1000) //
		{
			System.out.println(num + " is large!");
		}
		else
		{
			System.out.println(num + " is out of range");
		}
		
		
	}

}
