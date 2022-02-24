package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int num, a, reverseNumber = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		num = sc.nextInt();

		for (; num != 0;) {
			a = num % 10;
			reverseNumber = (reverseNumber * 10) + a;
			num = num / 10;

			System.out.println("reverse number is " + reverseNumber);
			sc.close();
		}
		
	}

}
