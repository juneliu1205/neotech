package com.neotech.lesson35;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework {

	public static void main(String[] args) {

		/*
		 * Create a static method that will return a List of Exceptions. 
		 * Inside your method create objects of 4 exception classes using 
		 * try and catch blocks and store them inside your list. 
		 * Call your method inside main and print name and
		 * details of all Exception objects.
		 */
		

	List<Exception> exceptionList =	getAllExceptions();
		
	Iterator<Exception> it = exceptionList.iterator();
	
	while(it.hasNext())
	{
//		it.next().printStackTrace();
		//or you can just print the message from each
		System.out.println(it.next().getMessage());
	}
		
		
	}

	public static  List<Exception>  getAllExceptions()
	{
		List<Exception> toReturn = new ArrayList<>();
		
		
		//how would we add to a List<String>
		List<String> ls = new ArrayList<>();
		ls.add("Alban");
		ls.add("Achraf");
		//let us create some Exception situations
		
		//1st Exception - ArrayIndexOutOfBounds
		int[] intArray = {1,2,3,4,5,6};
		
		try 
		{
			System.out.println(intArray[7]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			toReturn.add(ex);
		}
		
		
		//2nd exception - ClassCastException
		try {
			Object obj = new Double(50);
			Integer i = (Integer) obj;
		} catch (ClassCastException ex) {
			toReturn.add(ex);
		}
		
		
		//3rd exception - ArithmeticException
		
		int a = 5;
		int b = 0;
		
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			toReturn.add(ae);
		}
		
		
		//4th exception - NegativeArraySizeException
		
		try {
			int[] negArray = new int[-5];
		} catch (NegativeArraySizeException ex) {
			toReturn.add(ex);
		}
		
		return toReturn;
		
	}
	
}