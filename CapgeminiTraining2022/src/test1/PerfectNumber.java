package test1;

import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
	int n,sum=0;
	
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to check::");
        n=sc.nextInt();
        
        for (int i=1;i<n;i++)
        {
        	if(n% i==0)
        	{
        		sum =sum+i;
        	}
        	System.out.println(sum);
        	if(n==sum)
        		
        	{
        		System.out.println("Given number is perfect");
        	}
        	else {
        	
        	
        		System.out.println("Given number is not perfect");
        	}
        	sc.close();
        }
        
	}

}
