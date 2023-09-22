package com.neotech.lesson10;

public class Task3 {


	public static void main(String[] args) {
		 
//	    *
//	   * *
//	  * * *
//	 * * * *
//	* * * * *
			

		for (int i = 0; i < 5; i++)
		{
			//printing spaces
			for (int j=4; j > i; j--)
			{
				System.out.print(" ");
			}
			
			//print stars
			for (int k=0; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
	}

}