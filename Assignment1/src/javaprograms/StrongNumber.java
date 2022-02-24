package javaprograms;

import java.util.Scanner;

public class StrongNumber {

	public static int fac(int num) {
		int f = 1;
		for (int i = 1; i < num; i++)
			f = f * i;
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int num = sc.nextInt();

		int sum = 0, temp = num;
		while (num != 0) {
			int d = num % 10;

			sum = sum + fac(d);
			num = num / 10;
		}
		if (sum == temp)
			System.out.println("Strong number");

		else {
			System.out.println("not a strong number");
		}
		sc.close();

	}

}