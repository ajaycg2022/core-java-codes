package javaprograms;

import java.util.Scanner;

public class Bonus {
	static String Dept;
	static String Dept1="HR";
	static String Dept2="Accounting";
	static String Dept3="IT";
	static String Dept4="Sales";
	static double netBonus;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		double salary = sc.nextDouble();
		
		System.out.println("enter the number of years of experience");
		int yearOfExperience = sc.nextInt();

		/*System.out.println("enter the Department ");
		String Dept = sc.nextLine();*/

		
		
		
		if (yearOfExperience >2 && Dept == Dept1 ) {

			netBonus = salary * 0.02;
			System.out.println("employee Salary is " + salary + "and net bonus is " + netBonus);
		} else if (yearOfExperience > 2 && Dept == Dept2) {

			netBonus = salary * 0.03;
			System.out.println("employee Salary is " + salary + "and net bonus is " + netBonus);
		} else if (yearOfExperience > 2 && Dept == Dept3) {

			netBonus = salary * 0.05;
			System.out.println("employee Salary is " + salary + "and net bonus is " + netBonus);
		} else if (yearOfExperience > 2 && Dept == "Sales") {

			netBonus = salary * 0.08;
			System.out.println("employee Salary is " + salary + "and net bonus is " + netBonus);
		} else {
			netBonus = 0.0;
			System.out.println("Rating is below Average");
			sc.close();
		}
	}

}