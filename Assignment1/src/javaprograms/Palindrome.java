package javaprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num=0 ,remainder;
		int reverseNum=0;
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		int orignalNumber=num;
		
		
		while (num!=0) {
			remainder =num% 10;
			reverseNum=reverseNum*10+remainder;
			num /= 10;
			
		}
		if (orignalNumber==reverseNum) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		sc.close();
	}

}