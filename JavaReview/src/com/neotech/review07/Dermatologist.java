package com.neotech.review07;

public class Dermatologist extends Doctor {
    
	String dermID;
	
	Dermatologist(){
		//super();
		//implicitly it is calling the default constructor
	}
	
	// The constructor are NOT inheritance 
	Dermatologist(String name, int salary, String licenceID, String dermID){
        super(name,salary, licenceID);
		//super.name=name;
		//super.salary=salary;
		//super.licenceID=licenceID;
        
		this.dermID= dermID;
	}
	
	public void applySkinTreatment() {
		System.out.println("Doctor "+ name + " apply skin treatmeant");
	}
	
}
