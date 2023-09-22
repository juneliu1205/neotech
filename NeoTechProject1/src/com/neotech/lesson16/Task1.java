package com.neotech.lesson16;

public class Task1 {
	public static void main(String[] args) {

				/*
				 * Task: Create a String and print it in reverse order (Sunday → yadnuS).
				 * 
				 * Hint: use a decrementing loop - use .length to know where to start - to get
				 * chars in a specific position use charAt(i);
				 */
				
				
				
				String sun = "Sunday";
				
				for (int i = sun.length()-1; i >= 0; i--)
				{
					System.out.print(sun.charAt(i));
				}
			
				
				
				
			}
		}