package com.neotech.lesson19;

public class EmployeeWithinPackage {


	public static void main(String[] args) {

		Employee.company = "Neotech";
		
		Employee emp = new Employee();
		
		emp.name = "Yildirim";
		emp.lastName = "Likos";
		emp.salary = 1232545;
		//the field is not visible
	//	emp.ssn = 1234;
		//this does not exist
		//emp.phoneNumber = 12355;
		
		
		
		//can we access methods
		emp.method1();
		emp.method2();
		emp.method3();
		//this error says that it exists but it is not visible from here
//		emp.method4();
		//this error says it is undefined
//		emp.method5();
		
	}
}