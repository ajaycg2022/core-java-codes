package javaprograms;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n1,n2;
		int gcd=0;
		System.out.println("Enter the first number:: ");
		n1=sc.nextInt();
		System.out.println("Enter the Second number:: ");
		n2=sc.nextInt();
		
		for (int i=1;i<=n1 && i<=n2;i++) {
			
			if(n1%i==0 & n2%i==0) {
				gcd=i;
				
				sc.close();
			}
		}
      System.out.println("first number"+n1);
      System.out.println("seconf number"+n2);
      System.out.println("gcd::"+gcd);
	}
}