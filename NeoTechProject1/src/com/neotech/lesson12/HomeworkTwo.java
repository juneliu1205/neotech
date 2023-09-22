package com.neotech.lesson12;

public class HomeworkTwo {

	public static void main(String[] args) {
		// 2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
		//Then you program should print name of the students that has A and B grade


		String[][]arrAy = { {"Mike", "Julia", "John", "Melissa"},
		               {"C", "A", "B", "D"}};
		
		System.out.println(arrAy [0][1]+ " "+ "has grade \""+ arrAy[1][1]+ "\" and "+ arrAy[0][2]+ " "+ "has grade \""+ arrAy[1][2] +"\".");	
		
	}

}
