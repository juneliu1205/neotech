package com.neotech.lesson20;
//Write a java program of Class Students that takes students name and 3 subject grades.
//Inside your class also have a method to Calculate Average Grade. Test Student class for 
//5 different students with different marks. Your program should print an average mark of 
//each students name.


public class Students {

	String name; 
	int grade1,grade2, grade3;
	
	Students(String stuName, int g1, int g2,  int g3){
	
		name=stuName;
		grade1=g1;
		grade2=g2;
		grade3 =g3;
	}
	int average() {
		return (grade1+grade2+grade3)/3;
	}

	public static void main(String[] args) {
		Students st1=new Students ("June", 96,96,94);
		Students st2=new Students ("Joyce", 99,90,92);
		Students st3=new Students ("Andrew", 95,92,100);
		
		System.out.println(st1.name+" has an avg of "+ st1.average());
		System.out.println(st2.name+" has an avg of "+ st2.average());
		System.out.println(st3.name+" has an avg of "+ st3.average());
	}
	
}
