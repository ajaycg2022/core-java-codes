package edunextallprograms;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of elements you want");
		n = sc.nextInt(); //taking number of elements for array
		int[] array = new int[6];

		System.out.println("enter the values of arrays");

		for (int i = 0; i < n; i++) {

			array[i] = sc.nextInt();
			sum = sum + array[i];
			
		}
		sc.close();
		
		//System.out.println(sum);
	
		if (sum >= 100) 
			System.out.println("HIGH");
		else if (sum >= 70 && sum<100)
			System.out.println("MEDIUM");
		else if (sum < 70)
			System.out.println("LOW");
		else
		    System.out.println("Invalid Option");

		}
	}


