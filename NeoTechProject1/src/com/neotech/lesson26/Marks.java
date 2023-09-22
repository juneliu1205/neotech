package com.neotech.lesson26;

public abstract class Marks {
	//2. We have to calculate the average of marks obtained in three subjects by student A and by student B.
	//Create a class 'Marks' with an abstract method 'getAverage' that will be returning the average of
	//marks. Provide implementation of the abstract method in classes 'StudentA' and 'StudentB'. The
	//constructor of StudentA takes the marks of three subjects as parameters and the constructor of
	//StudentB takes marks of four subjects as parameters. Test your code.

	public abstract double getAverage();
	
	}
	class StudentA extends Marks
	{
		int mark1, mark2, mark3;
		
		
		public StudentA(int mark1, int mark2, int mark3) {
			super();
			this.mark1 = mark1;
			this.mark2 = mark2;
			this.mark3 = mark3;
		}
		
		@Override
		public double getAverage() {
			return (mark1 + mark2 + mark3)/3;
		}
		
	}
	
	class StudentB extends Marks
	{
		int mark1, mark2, mark3, mark4;
		
		public StudentB(int mark1, int mark2, int mark3, int mark4) {
			super();
			this.mark1 = mark1;
			this.mark2 = mark2;
			this.mark3 = mark3;
			this.mark4 = mark4;
		}
		@Override
		public double getAverage() {
			return (mark1 + mark2 + mark3 + mark4)/4;
		}
		
	}