package arraypractice;

import java.util.Scanner;

public class ArrayUsingForAndForEachLoop {

	public static void main(String[] args) {
		int [] values =new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the values of arrays");
		
		for(int i =0; i<values.length;i++) {
		values[i]=sc.nextInt();
		
		
		}
		
		System.out.println("values of arrays....");
		for(int arrayValues: values) {
			System.out.println(arrayValues);
			
		}
		sc.close();

	}

}
