package com.cg.oopsinjava.inheritance3;

public class Staff extends Person {
	String staffName;
	String staffAddress;

	void readStaffDetails() {
		System.out.println("Enter the Staff details........");

		System.out.println("Enter the Staff name.....");
		staffName = sc.nextLine();
		sc.nextLine();

		System.out.println("Enter the Staff address.....");
		staffAddress = sc.nextLine();
		sc.nextLine();

	}

	void printStaffDetails() {
		System.out.println("Entered staff details are ........");

		System.out.println("staff name = " + staffName);
		System.out.println("staff address = " + staffAddress);
	}
}
