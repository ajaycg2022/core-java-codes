package com.cg.oopsinjava.inheritance3;

public class Student extends Person {
    int year;
	double fee;
	String studentName;
	String studentAddress;
	
	void readStudentDetails() {
		System.out.println("Enter the Student details........");
		
		System.out.println("Enter the student name.....");
		studentName = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the student year.....");
		year = sc.nextInt();
		System.out.println("Enter the student address.....");
		studentAddress = sc.nextLine();
		System.out.println("Enter the student fee.....");
	    fee  = sc.nextDouble();
}

	void printStudentDetails() {
		System.out.println("Studets details are ........");
		System.out.println("student name = " + studentName);
		System.out.println("student year = " + year);
		System.out.println("student address = "+studentAddress);
		System.out.println("student fee ="+fee);
	}
}
