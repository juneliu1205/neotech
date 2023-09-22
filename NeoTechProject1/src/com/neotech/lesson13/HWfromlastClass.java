package com.neotech.lesson13;

public class HWfromlastClass {

	public static void main(String[] args) {
		String[][] students = {
				{"Omer", "Ahmet", "Ismail", "Olga"},
				{"A", "A", "A", "A"}
		};
		
		//students.lenght ---> number of rows 
		//for the number of columns in a row i
			//students[i].length
		for(int i = 0; i < students[1].length; i++)
		{
			//print name of the students that has A and B grade
			if (students[1][i].equals("A") || students[1][i].equals("B"))
			{
				System.out.println(students[0][i]  + " : " + students[1][i]);
			}
				
		}
 
	}

}