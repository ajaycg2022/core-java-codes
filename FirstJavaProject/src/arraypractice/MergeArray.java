package arraypractice;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {

		int[] arrayA = new int[5];
		int[] arrayB = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the values of arrayA");

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = sc.nextInt();
		}
		System.out.println("enter the values of arrayB");
			for(int j = 0; j < arrayB.length; j++) {
				arrayB[j] = sc.nextInt();
				
				
			}
			

			 

			}

	private static int[] mergeArray(int[] arrayA, int[] arrayB) {
		// TODO Auto-generated method stub
		int[] mergedArray =mergeArray(arrayA,arrayB);
		System.out.println("mergedArray");
		return null;
		
		
	}
}