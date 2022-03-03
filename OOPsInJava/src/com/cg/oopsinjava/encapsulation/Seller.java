package com.cg.oopsinjava.encapsulation;

import java.util.Scanner;

public class Seller {

	int sellerID;
	String sellerName;
	Scanner sc =new Scanner(System.in);
	
	
	void readSellerDetails() {
		System.out.println("enter the seller details");
		System.out.println("enter the seller ID");
		sellerID= sc.nextInt();
		System.out.println("enter the seller Name");
		sc.nextLine();
		sellerName= sc.nextLine();
	}
	
	
	void printSellerDetails() {
		System.out.println("seller ID::"+sellerID);
		System.out.println("seller Name::"+sellerName);
	}
	

	}


