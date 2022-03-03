package com.cg.oopsinjava.inheritance3;

import java.util.Scanner;

public class Person {

	
	String personName;
	String personAddress;
	Scanner sc = new Scanner(System.in);
	void readPersonDetails() {
		System.out.println("Enter the Person details........");
		
		System.out.println("Enter the person name.....");
		personName = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter the person address.....");
		personAddress = sc.nextLine();
		sc.nextLine();
		
}

	void printPersonDetails() {
		System.out.println("Entered person details are ........");
		
		System.out.println("Person name = " + personName);
		System.out.println("Person address = "+personAddress);
	}
}
