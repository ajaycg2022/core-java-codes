package com.cg.oopsinjavapolymorphism;

import java.util.Scanner;

public class Employee {
	
	int employeeID;
	String EmployeeName;
	int employeeAge;
	Scanner sc=new Scanner(System.in);
	
	public Employee() {
		System.out.println("Employee class constructor called.. ");
	}
	
	
	
	void readEmployeeDetails() {
		System.out.println("enter the employee details");
	}
	void printEmployeeDetails() {
		System.out.println("enter the employee details");
	}
	void calculateSalary() {
		System.out.println("calculate the salary");
	}

	
	

}
