package com.cg.oopsinjava.inheritance4;

public class BankMain {

	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.readDetails();
		b1.printDetails();
		
		Sbi s1=new Sbi();
		s1.readSbiDetails();
		s1.printSbiDetails();
		
		Icici i1= new Icici();
		i1.readIciciDetails();
		i1.printIciciDetails();
		
		// here we are accessing only bank,sbi,ICICI, but for Axis we did method call direct along with main method
	}

}
