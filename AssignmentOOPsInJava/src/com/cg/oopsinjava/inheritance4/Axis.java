package com.cg.oopsinjava.inheritance4;

public class Axis extends Bank {
public static void main(String[] args) {
	// alternate way to access methods of bank class by direct method call using object creation
	Axis a1=new Axis();
	a1.readDetails();
	a1.printDetails();
}
}
