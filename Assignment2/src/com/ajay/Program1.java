package com.ajay;

public class Program1 {
//execution of java using command line argument
	public static void main(String[] args) {
		System.out.println("Hello Dear");
		int value1= Integer.parseInt(args[0]);
		int value2= Integer.parseInt(args[1]);
		
		System.out.println("argument passed from cmd line ="+(value1+value2));
	}

}
