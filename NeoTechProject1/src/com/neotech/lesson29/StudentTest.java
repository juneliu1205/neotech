package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

		public static void main(String[] args) {
			
			Set<Student> Stu = new HashSet<>();
			Stu.add(new Student("John","001"));
			Stu.add(new Student("Brian","002"));
			Stu.add(new Student("Cathy","003"));
			Stu.add(new Student("Don","004"));
			Stu.add(new Student("Eliane","005"));
			
			Iterator<Student> it = Stu.iterator();
			while (it.hasNext()) {
				it.next().displayInfo();
			}
	
	}

}
