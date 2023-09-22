package com.neotech.lesson30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework3 {
	/*
	 * Create a Set collection that will hold Objects of Student Type. In this set
	 * we do not care about the insertion order. Each student object should have
	 * name and studentID. Display name of each student.
	 */
	public static void main(String[] args) {

		Set<Student> students = new HashSet<>();
		Student s1 = new Student("Ahmet", 1);
		students.add(s1);
		students.add(new Student("Yasemin", 2));
		students.add(new Student("Merve", 3));
		students.add(new Student("Ogulcan", 4));

		Iterator<Student> it = students.iterator();

		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student.getName());
		}
	}

}

class Student {
	private String name;
	private int studentId;

	Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	// getter: no argument, returns something
	// setter: arguments, doesn't return anything
	String getName() {
		return name;
	}
}