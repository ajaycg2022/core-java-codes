
/*create a class called Employee(employeeId,employeeName,employeeEmail,employeeMobNo,employeeDOB,employeeDOJ)
readEmployeeDetails
displayEmployeeDetails*/


//check the issue where it is wrong
package com.cg.oopsinjava;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Employee {
	int employeeID;
	String employeeName;
	String employeeEmail;
	long employeeMobNo;
	Date employeeDOB;
	Date employeeDOJ;
	
	Scanner sc  = new Scanner(System.in);
	
	 public void readempdatails() throws ParseException{
		System.out.println("Enter the Employee data");
		System.out.println("Enter the employee id");
		employeeID=sc.nextInt();
		System.out.println("Enter the employee name");
		sc.nextLine();
		employeeName=sc.nextLine();
		System.out.println("enter the employee Mobile Number");
		sc.nextLine();
		employeeMobNo=sc.nextLong();
		System.out.println("Enter the employee dob in 'dd/MM/yyyy' ");
		sc.nextLine();
		String dob = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sc.nextLine();
		employeeDOB = sdf.parse(dob);
		System.out.println("Enter the employee doj in 'dd/MM/yyyy' ");
		sc.nextLine();
		String doj = sc.nextLine();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		sc.nextLine();
		employeeDOJ = sdf1.parse(doj);
		
	}
	@SuppressWarnings("deprecation")
	public void displayemployeedatils() {
		System.out.println("Enter employee data..........");
		System.out.println("employee ID::"+employeeID);
		System.out.println("employee name::"+employeeName);
		System.out.println("emploee Mobile Number::"+employeeMobNo);
		System.out.println("Employee dob = " + employeeDOB.getDate()+"/"+employeeDOB.getMonth()+"/"+employeeDOB.getYear());
	}
	

}
