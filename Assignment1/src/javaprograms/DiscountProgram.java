package javaprograms;

import java.util.Scanner;

public class DiscountProgram {

	public static void main(String[] args) {
		int quantity;
		int cost=100;
	    
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the purchase quantity");
		quantity =sc.nextInt();
		
		double totalCost=quantity*cost;
		System.out.println("total cost is "+totalCost);
			
			if(totalCost>1000) {
				
				totalCost=totalCost-(totalCost*0.10);
				System.out.println("Total cost after discount"+totalCost);
		}
			sc.close();
	}

}
