package com.cg.oopsinjavapolymorphism;

public class ContractEmployee extends Employee {
	float salary;
	public ContractEmployee() {
		System.out.println("ContractEmployee class constructor called.. ");
	}
	
	//along with this it will call employee constructor will also get call automatically.
	
	//overriding can happens only in superclass and subclass
	
	@Override   //annotation=>metadata=>information about method to compiler=> already this method is used in parent class to just for information we are giving signature her i.e @override
	void calculateSalary() {  //method is override from super class. methods can only override not a class.
		System.out.println("contract employee salary details are");
	}
	
	// this method is not overridden this is overloaded because method is same but parameter is different
	void printEmployeeDetails(int a) {
		
		
	}

}
