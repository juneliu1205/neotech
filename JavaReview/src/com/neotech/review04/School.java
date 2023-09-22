package com.neotech.review04;

public class School {

	public static void main(String[] args) {
		
		// School s = new School();
		
			Student student1 = new Student();
			student1.name = "Ermal";
			student1.studentNr = 295;
			student1.gradeLevel = 12;
			
			Student student2 = new Student();
			student2.gradeLevel = 1;
			student2.studentNr = 452;
			student2.name = "Donald";
				
			Teacher teacher = new Teacher();
			teacher.name = "Sabah";
			teacher.salary = 120000;
			teacher.subject = "Java";
			
			// Re-assigning the subject
			teacher.subject = "Selenium";
			System.out.println("Let's call the methods!");
			
			student2.study();
			student2.sleep();
			student1.sleep();
		teacher.teach();
teacher.yellAtStudent("Olga");
}
}