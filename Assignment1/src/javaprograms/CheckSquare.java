package javaprograms;

import java.util.Scanner;

public class CheckSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		double length = sc.nextDouble();
		System.out.println("Enter the Breadth");
		double breadth = sc.nextDouble();

		if (length == breadth) {
			System.out.println("it is square");

		} else {
			System.out.println("it is not square");
		}

		sc.close();
	}
}
