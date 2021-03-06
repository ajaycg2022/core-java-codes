package com.cg.oopsinjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee1 {

	int employeeid;
	String employeename;
	String employeeemailid;
	long employeephoneno;
	Date employeedob;
	Date employeedoj;

	Scanner sc = new Scanner(System.in);

	// methods to access above variables
	void readEmployeeDetails() throws ParseException {
		System.out.println("Enter the Employee data");
		System.out.println("Enter the Employee id");
		employeeid = sc.nextInt();
		System.out.println("Enter the Employee name");
		sc.nextLine();// throw away the newline read by scanner
		employeename = sc.nextLine();

		System.out.println("Enter the Employee Emailid");
		sc.nextLine();// throw away the newline read by scanner
		employeeemailid = sc.nextLine();

		System.out.println("Enter the Employee Phoneno");
		// throw away the newline read by scanner
		employeephoneno = sc.nextLong();

		String employeeephoneno = sc.nextLine();
		
		System.out.println("Enter the employee dob in 'dd/MM/yyyy' ");
		String dob = sc.nextLine();
		sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		employeedob = sdf.parse(dob);
		sc.nextLine();

		System.out.println("Enter the employee doj in 'dd/MM/yyyy' ");
		String doj = sc.nextLine();

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		employeedoj = sdf1.parse(doj);
		sc.nextLine();
	}

	void displayEmployeeDetails() {
		System.out.println("Entered the Student data ...............");
		System.out.println("Student id = " + employeeid);
		System.out.println("Student name = " + employeename);
		System.out.println("Student phoneno = " + employeephoneno);
		System.out.println("Student mailid = " + employeeemailid);

		System.out.println(
				"Student dob = " + employeedob.getDate() + "/" + employeedob.getMonth() + "/" + employeedob.getYear());

		System.out.println(
				"Student doj = " + employeedoj.getDate() + "/" + employeedoj.getMonth() + "/" + employeedoj.getYear());
	}

}
