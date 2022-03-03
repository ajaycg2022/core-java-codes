package arraypractice;

import java.util.Scanner;

public class ArrayValues {

	public static void main(String[] args) {
		float[] marks =new float[5];
		Scanner sc =new Scanner(System.in);
		//read the values of array from user
		System.out.println("Enter the values of arrays");
		
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextFloat();
		}
		
		// reading the values of array from the array to display in console
			System.out.println("values of array....");
			for(int i=0;i<marks.length;i++) {
				System.out.println(marks[i]);
			
		}
			sc.close();

	}

}
