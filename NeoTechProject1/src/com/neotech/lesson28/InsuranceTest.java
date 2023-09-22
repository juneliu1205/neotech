package com.neotech.lesson28;
import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
	
	Insurance[] InsuranceArray = {new Car("Car", "Rv4"), new Pet("Pet", "Yokipoo"), new Health("Dental ") };

	
	ArrayList<Insurance> InsuranceList = new ArrayList<>();
	
	InsuranceList.add(new Car("Gei", "RV4"));
	InsuranceList.add(new Pet("Pet", "Yokipoo"));
	InsuranceList.add(new Health("Dental "));
	
	System.out.println("--------------------------------");
	
	System.out.println("Enhanced for loop");
	
	for (Insurance in:InsuranceList) {
		in.getQuote();
		in.cancelInsurance();
	}
	
	System.out.println("--------------------------------");
	System.out.println("Normal for loop");
	for (int i=0; i<InsuranceList.size(); i++) {
		InsuranceList.get(i).getQuote(); InsuranceList.get(i).cancelInsurance();
	}
	
	System.out.println("--------------------------------");
	System.out.println("Iterator");
	Iterator<Insurance> it = InsuranceList.iterator();
	
	while (it.hasNext()) {
		Insurance in = it.next();
		in.getQuote();
		in.cancelInsurance();
		
	}
	
	}

}
