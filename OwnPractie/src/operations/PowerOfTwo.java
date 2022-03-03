package operations;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		boolean powerOfTwo= isPowerOfTwo(n);
		
       if(powerOfTwo) 
    	   System.out.println("Yes");
    	   
       if(n<0)
    	   System.out.println("numer too small");
       
       if (n>32767)
       
    	   System.out.println("Number too large");
	
       else 
    	   System.out.println("No");
    
       
	}
	
	
	public static boolean isPowerOfTwo(int n) {
		return(n>0)&&((n &(n-1))==0);
	}

}
