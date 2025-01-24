package com.training.java.assignments;

public class Assignment10_StudentTest {

	public static void main(String[] args) {
		StudentGrades studentGrades = new StudentGrades();

		// Adding some initial students
		studentGrades.addNewStudentGrade("John", 85);
		studentGrades.addNewStudentGrade("Alice", 92);
		studentGrades.addNewStudentGrade("Bob", 78);

		// Removing student
		studentGrades.removeGrade("Alice");
		
		// View student record
		studentGrades.viewGrades("Alice");
		studentGrades.viewGrades("John");
		
		// Display all student records
		studentGrades.studentGrades();
		
	}
}
