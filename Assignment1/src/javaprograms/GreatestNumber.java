package javaprograms;

import java.util.Scanner;

public class GreatestNumber {
        
	    public static void main(String[] args) {
	    int num1,num2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1= sc.nextInt();
		
		System.out.println("Enter the second number");
		num2= sc.nextInt();
		if(num1<num2) {
			System.out.println(num1+" is greator than"+num2);
		}
		else {
			System.out.println(num2+" is greator than "+num1);
		}
		
sc.close();


	}

}