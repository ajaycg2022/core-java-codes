package com.cg.oopsinjava.inheritance4;

import java.io.InputStream;

public class Sbi extends Bank {
	

	void readSbiDetails() {
		System.out.println("Enter the SBI bank details");

		System.out.println("Enter the Simple Intrest ");
		simpleIntrest = sc.nextFloat();

		System.out.println("Enter the time in years");
		time = sc.nextFloat();

		System.out.println("Enter the principalAmount ");
		principalAmount = sc.nextFloat();
	}

	void printSbiDetails() {
		System.out.println("Entered SBI bank details are");

		System.out.println("simpleIntrest = " + simpleIntrest);

		System.out.println(" time in years =" + time);

		System.out.println(" principalAmount = " + principalAmount);
		
		rateOfIntrest=(simpleIntrest*100)/(principalAmount*time);
		System.out.println("Rate Of intrest "+rateOfIntrest);

	}

	
}
