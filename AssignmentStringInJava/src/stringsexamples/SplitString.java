package stringsexamples;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		String message;
		// System.out.println("find the index of character");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		message = sc.nextLine();

		String[] s = message.split(" ");
		System.out.println("String devided into two parts::" );
		 System.out.println("===========================");
		   for(String w :s) {
			   System.out.println(w);
			   
		   }
		int count = 0;
		
		 /* for(int i=0;i<s.length;i++) { count=count+1;
		 * 
		 * } //this is normal for loop for count
		 * System.out.println("total number of words ::"+count);
		 */
		for (String S1 : s) {   //this is  for each loop for count
			count = count + 1;
		}
		System.out.println("total number of words ::" + count);

	}

}

