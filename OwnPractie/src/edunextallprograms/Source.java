package edunextallprograms;

import java.util.Scanner;

public class Source{
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		double f;
		double cel;
		System.out.println("Enter temperature in Fehrenheit");
		f=sc.nextDouble();
		cel=(f-32)*5/9;
		System.out.println("\n Fahrenheit is :"+f);
		System.out.println("\n celcius is :"+Math.round(cel));
		sc.close();
	}
}

	

