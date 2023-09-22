package com.neotech.lesson20;


//Homework 1:
//Write program as a Student class that has instance variables name and address. 
//Create a constructor that will initialize those variables. Print name & address 
//of given student using displayInfo method.
    public class Students2 {

		String name, address;
		
		Students2(String stuName, String stuAddress){
		
			name=stuName;
			address=stuAddress;
		}

		public static void main(String[] args) {
			
			Students2 st1=new Students2 ("June", "41 Main St. St.Charles MO 33031");
			Students2 st2=new Students2 ("Joyce", "42 Main St. St.Charles MO 33031");
			
			System.out.println("Student Name: "+ st1.name+ " Address: "+ st1.address);
			System.out.println("Student Name: "+ st2.name+ " Address: "+ st2.address);
		}
		
	}

    
	
	
	
	
	
	
	
	

