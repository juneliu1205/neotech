package com.neotech.lesson26;

public class EmployeeTest {

public static void main(String[] args) {
	Employee emp = new Employee();
	
	
	//I cannot access it
	//System.out.println(emp.name);
	
	System.out.println(emp.getName());
	
	//I cannot change it 
	//emp.name = "Aysel";
	
	emp.setName("Aysel");
	System.out.println(emp.getName());
	
	emp.setAge(25);
	System.out.println(emp.getAge());
	
	
	
}
	
}