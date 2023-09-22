package com.neotech.lesson16;

public class Task2 {

	public static void main(String[] args) {
				/*
				 * Create a String and if the String is not empty perform the following: 
				 * - if the String has an odd number of characters 
				 * and has 3 or more characters, 
				 * print the character in the middle of the String.
				 */
				
				String str = "Olga  Belyakova";
				
				//isEmpty()
				if (!str.isEmpty()) //if the String is not empty
				{
					int length = str.length();
					
					if (length % 2 == 1 && length >= 3)
					{
						//if the string has an odd number of characters
						//if the string has 3 or more characters
											//str.charAt(2);
						System.out.println(str.charAt(length/2));
						
					}
					else
					{
						System.out.println("Either the length is even or is less than 3!!!");
					}
					
					
					
				}
				else//string is empty
				{
					System.out.println("The string is empty!!!");
				}
			}
		}
