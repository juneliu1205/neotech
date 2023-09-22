package com.neotech.lesson34;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Homework34 {
	// Create a static method that will return a List of Exceptions.
	// Inside your method create objects of 4 exception classes using
	// try and catch blocks and store them inside your list.
	// Call your method inside main and print name and details of all
	// Exception objects.
	
	public static List <Object> ExceptionList() {
		
	List <Object> list= new ArrayList<>();
		try {
		int a = 5; 
		int b = 0;
		
		} catch (ArithmeticException ae) {
			System.out.println("Caught Arithmetic Exception!!!");
			list.add(ae);
		}
		try {
			int[] array = {2,3,4};
			System.out.println(array[5]);
		}catch (ArrayIndexOutOfBoundsException ofb) {
			System.out.println("Caught Array Index Out Of Bounds Exception!!!");
			list.add(ofb);
		}
		String path = "";
		try {
			FileInputStream fis = new FileInputStream(path);
		}catch (FileNotFoundException e) {
			System.out.println("Caught File Not Found Exception!!!");
			list.add(e);
		}
        Scanner scan = new Scanner (System.in);
		String name= "";
		int age;
		
		try {
		System.out.println("Enter your name: ");
		name=scan.next();
		
		System.out.println("Enter your age: ");
		age=scan.nextInt();
		System.out.println("I am "+name+ " and I am "+age + "years old!");
		}
		catch (InputMismatchException ime)
		{
			System.out.println(ime.getMessage());
			ime.printStackTrace();
			System.out.println("Make sure your input type is correct!");
		}	
		System.out.println("End of code!");
		return list;
	}
	
public static void main (String[] args) {
	List <Object> fullList=ExceptionList();
	for (Object obj: fullList) {
		System.out.println(obj);
	}	
}
}
