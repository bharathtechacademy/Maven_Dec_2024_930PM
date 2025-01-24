package com.training.java.assignments;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
	private Map<String, Integer> studentGrades; // Map to store student's grades

	// Constructor to initialize the student grades map
	public StudentGrades() {
		studentGrades = new HashMap<String, Integer>();
	}

	// Method to display all students and their grades
	public void studentGrades() {
		if (studentGrades.isEmpty()) {
			System.out.println("No student grades available.");
		} else {
			System.out.println("Student Grades:" + studentGrades);
		}
	}

	// Method to add a new student's grade
	public void addNewStudentGrade(String studentName, int grade) {
		studentGrades.put(studentName, grade);
		System.out.println("Grade of " + studentName + " has been added/updated to: " + grade);
	}

	// Method to remove a student's grade
	public void removeGrade(String studentName) {
		if (studentGrades.remove(studentName) != null) {
			System.out.println("Grade of " + studentName + " has been removed.");
		} else {
			System.out.println("Student " + studentName + " not found.");
		}
	}

	// Method to view a specific student's grade
	public void viewGrades(String studentName) {
		Integer grade = studentGrades.get(studentName);
		if (grade != null) {
			System.out.println("Grade of " + studentName + " is: " + grade);
		} else {
			System.out.println("Student " + studentName + " not found.");
		}
	}
}
