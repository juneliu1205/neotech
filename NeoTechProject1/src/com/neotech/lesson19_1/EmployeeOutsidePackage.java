package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

public class EmployeeOutsidePackage {

	public static void main(String[] args) {

		
		Employee.company = "Neotech"; //if we want to access this class from here it has to be public
		Employee emp = new Employee();
		emp.name = "Emre";		// we can access this because it is public
//		emp.lastName = "Cinar"; //this is protected, so we cannot access it
//		emp.salary = 123435; //this is default, so we cannot see it
//		emp.ssn = 324325; //this is private so we cannot see this. 
		
		
		//can we access methods
		emp.method1();
		//for any of these methods, if I need to access them I will have to change
		//their access modifier
	//	emp.method2();
	//	emp.method3();
	//	emp.method4();
		
	//	emp.method5(); //this is a totally different issue

	}

}