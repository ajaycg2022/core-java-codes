package arraypractice;

import java.util.Scanner;

public class PositiveNegativeNumberCheck {

	public static void main(String[] args) {
		int countP = 0, countN = 0, countZ = 0, i, countOdd = 0, countEven = 0;
		int[] arr = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for (i = 0; i < 10; i++)

			arr[i] = sc.nextInt();
		for (i = 0; i < 10; i++) {
			if (arr[i] < 0)
				countN++;

			else if (arr[i] > 0)
				countP++;
			else if(arr[i] == 0)

				countZ++;
			
		}
			
			for (i = 0; i < 10; i++) {
			if (arr[i]% 2  == 0)
				countEven++;
			}
			for (i = 0; i < 10; i++) {
			 if (arr[i] % 2 != 0)
				countOdd++;
			}
			

		
		System.out.println("Total positive numbers::" + countP);
		System.out.println("Total negative numbers::" + countN);
		System.out.println("Total even numbers::" + countEven);
		System.out.println("Total odd numbers::" + countOdd);
		System.out.println("Total  zero::" + countZ);
	}

}
