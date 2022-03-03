package com.ajay;

import java.util.Scanner;

public class WorkDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age :: ");
		int age = sc.nextInt();

		System.out.println("Enter the Sex M/F :: ");
		char sex = sc.next().charAt(0);

		System.out.println("Marital status Y/N ::");
		char marr = sc.next().charAt(0);

		if (sex == 'F') {
			System.out.println("She will work in urban areas");
		}
		if (sex == 'M') {
			if ((age >= 20) && (age < 40)) {
				System.out.println("He may work anywhere");
			}

			else if (age >= 40 && (age < 60)) {
				System.out.println("He will onlu work in urban areas");
			} else {
				System.out.println("ERROR");
			}
		}
	}

}
