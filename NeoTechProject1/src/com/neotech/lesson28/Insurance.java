package com.neotech.lesson28;

//Homework 3:
//    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour 
//    as getQuote() and cancelInsurance().
//    Create 3 subclasses Car, Pet, Health.
//    Car class has its own attribute as carModel and Class Pet has petType attribute.
//    Create 3 objects of the sub classes and store them in ArrayList.
//    Using for loop/advanced for loop/iterator access all methods of the class.
abstract class Insurance {

	String insuranceName;

	Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	abstract void getQuote();
	abstract void cancelInsurance();
}


class Car extends Insurance {
	
	String carModel;

	Car (String insuranceName, String carModel) {
        super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	void getQuote() {
		System.out.println("Get a "+ insuranceName +" insurance quote for " + carModel);
	}
	@Override
    void cancelInsurance() {
		System.out.println("Cancel the " +insuranceName+ " insurance for " + carModel);
	}

}
	
class Pet extends Insurance {	
	
	String petType; 
	
    Pet (String insuranceName, String petType) {
			super(insuranceName);
			this.petType=petType;
			}

			@Override
			public void getQuote() {
				System.out.println("Get a "+ insuranceName + " insurance quote for " + petType);
				
			}

			@Override
			public void cancelInsurance() {
				System.out.println("Cancel the "+ insuranceName+ " insurance for " + petType);
			}
}
class Health extends Insurance {	
	Health (String insuranceName){
		super(insuranceName);
	}
	@Override
	void getQuote() {
		System.out.println("Get a "+ insuranceName+ "insurance quote");
		
	}

	@Override
	void cancelInsurance() {
		System.out.println("Cancel the "+ insuranceName+ "insurance");
	}
	}
	
	
