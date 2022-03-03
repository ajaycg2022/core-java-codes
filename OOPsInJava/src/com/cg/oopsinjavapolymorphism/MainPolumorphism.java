package com.cg.oopsinjavapolymorphism;

public class MainPolumorphism {

	public static void main(String[] args) {
		ContractEmployee ce=new ContractEmployee();
		ce.printEmployeeDetails(); //both are same methods but in second method parameter is different
		ce.printEmployeeDetails(0);
		
		ce.calculateSalary();
		
		Employee emp=new Employee(); //like this only you can access methods of employee class
		emp.calculateSalary();

	}

}


//overloading