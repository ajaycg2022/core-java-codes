//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.

package com.cg.oopsinjava;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		int roll, s1,s2,s3;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=8;i++) {
			
		
		System.out.println("Enter the Roll number");
		roll=sc.nextInt();
		
		System.out.println("Enter your first subject marks");
		s1=sc.nextInt();
		System.out.println("Enter your second subject marks");
		s2=sc.nextInt();
		System.out.println("Enter your third subject marks");
		s3=sc.nextInt();
		
		float avg =(s1+s2+s3)/3;
		if(s1<=100 && s2<=100 && s3<=100) {
			System.out.println("average mark of roll number "+roll+ " is"+avg);
		}
		else {
			System.out.println("enter the marks below or equal to 100");
		}
		
		
		

	}

}
}
