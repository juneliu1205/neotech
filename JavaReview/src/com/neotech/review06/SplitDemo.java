package com.neotech.review06;

public class SplitDemo {

	public static void main(String[] args) {
		String longStr = "I am very happy today because its a weekend";
				String[] strArray = longStr.split("today");
				
				System.out.println(strArray.length);
				
				
				System.out.println("Printing using enhanced for loop");
				
				for (String element : strArray)
				{
					System.out.println(element);
				}
				
				System.out.println("Printing using the normal for loop");
				
				for (int i = 0; i < strArray.length; i++)
				{
					System.out.println(strArray[i]);
				}
				
				System.out.println("------------------------------------");
				
				longStr = "I like number 5 and 6, because 7 ate 9.";
				
				
//				String[] stringArray = longStr.split("[5-7]"); //looking for numbers 5 through 7 
//				String[] stringArray = longStr.split("[57]"); //looking for numbers 5 and 7	
				//what if we have longStr.split("[5,7]") ???
				//ANS: the , is treated as a delimiter (if there is a coma in the String, it will split on that)
				
				
				String[] stringArray = longStr.split("57"); //looking for number 57
				
				System.out.println(stringArray.length);
				
				for (String str : stringArray)
				{
					System.out.println(str);
				}
			}
		}