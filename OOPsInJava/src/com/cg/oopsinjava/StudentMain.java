package com.cg.oopsinjava;

import java.text.ParseException;

public class StudentMain {

	public static void main(String[] args) throws ParseException {
		
		//following statement creates an object
		Student st = new Student();
		st.readStudentDetails();
		st.displayStudentDetails();
		
		/*
		 * Student st1 = new Student(); st1.readStudentDetails();
		 * st1.displayStudentDetails();
		 */
		
		
		// arrays of student objects
		
		Student[] listOfStudents=new Student[3]; // six times it will create object for student
		Student student;
		
		//creating and adding students object in above array
		
		for(int i=0;i<listOfStudents.length;i++) {
			student =new Student();
			student.readStudentDetails();
			
		}
		for(int i=0;i<listOfStudents.length;i++) {
			listOfStudents[i].displayStudentDetails();
		}
	}

}
