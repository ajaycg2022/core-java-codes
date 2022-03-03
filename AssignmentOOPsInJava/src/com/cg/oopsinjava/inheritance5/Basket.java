package com.cg.oopsinjava.inheritance5;
//wrong program...did just for practice
import java.util.Scanner;

public class Basket {

	public static void main(String[] args) {

		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many item do you want to add");
		no = sc.nextInt();
		String[] item = new String[no];

		for (int i = 0; i < item.length; i++) {
			System.out.println("Enter the item you want to purchase" + (i + 1));
			item[i] = sc.next();

		}

		int no1;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the price of an item");

		no1 = sc1.nextInt();
		int[] price = new int[no1];
		for (int i = 0; i < item.length; i++) {
			System.out.println("Enter the price" + (i + 1));
			price[i] = sc.nextInt();

		}
		sc.close();

	}

}
