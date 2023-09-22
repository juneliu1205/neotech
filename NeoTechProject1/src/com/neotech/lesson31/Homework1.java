package com.neotech.lesson31;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//Create a Map that will store Employee name and salary. 
//Write a logic to retrieve an employee who gets the highest salary. 
//Output should be in the below format
//	- John Smith=$100000

public class Homework1 {

	public static void main(String[] args) {
	
	Map<String, Integer> employee = new LinkedHashMap<>();
	
	employee.put("John Smith", 100000);
	employee.put("Rober Hank", 90000);
	employee.put("Joyce", 150000);
	employee.put("Jasmine", 110000);
	employee.put("Ryan Mcvine", 80000);
	System.out.println(employee);
	
	String highest=" ";
	Integer highestsalary=0;
	
	for (Entry<String, Integer> entry  : employee.entrySet()) 
	{
		if(entry.getValue()> highestsalary){
			highestsalary=entry.getValue();
			highest=entry.getKey();
		}
	
}
	System.out.println(highest +"=$"+ highestsalary);
}
}