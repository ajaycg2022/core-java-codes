package stringsexamples;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String();
		str = "strings in java"; /// this is one format of defining String

		String str1 = new String("this is string"); // second format
		String str2 = "this is string"; // third format

		char[] city = { 'B', 'A', 'N', 'H', 'L', 'O', 'R', 'E' };
		String myCity = new String(city);
		System.out.println(myCity.charAt(0));
		System.out.println(myCity.substring(5));
		System.out.println(myCity.substring(3, 5));
		System.out.println(myCity.startsWith("a"));
		System.out.println(myCity.endsWith("f"));
		System.out.println(myCity.compareTo("Banglore"));
		System.out.println("Mumbai".compareTo("Chennai"));

		System.out.println(str.concat(" and strings are immutable"));
		System.out.println(str.equals("strings in java"));

		System.out.println(str.equals(str1));// always compare the strings with " equals "
		System.out.println(str1.equals(str2));

		String str4 = "This is a string";
		String[] words = str.split(" ");
		System.out.println("String devided in two words");
		System.out.println("===========================");
		for (String w : words) {
			System.out.println(w);

		}
		String message;
		// System.out.println("find the index of character");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		message = sc.nextLine(); // next() is method to read the string from use but it accepts string without
									// space// so to read next lines after spaces we can use nextLine()
		System.out.println("enter the number to pick a character");

		char index = sc.next().charAt(0);
		int charIndex = message.indexOf(index);
		System.out.println("character at index" + index + "=" + charIndex);

		int charIndex1 = message.lastIndexOf(index);
		System.out.println("character at index" + index + "=" + charIndex1);

		System.out.println("length of the string=" + message.length());

		char[] charsFromString = new char[5];
		message.getChars(2, 5, charsFromString, 0);

		System.out.println(charsFromString.length);
		

		System.out.println("characted extracted from string sing getchar() method ....");
		for (char ch : charsFromString) {
			System.out.println(ch);

		}
		
		System.out.println(message.isEmpty());//string is empty or not
		System.out.println(message.isBlank());// string is blank or not
		System.out.println(message.replace('i', 'e'));// it will replace characters	
		System.out.println(message.replaceAll(" ", "_"));//it will replace all spaces with "_"
		
		System.out.println(message.repeat(3));//number of time string will repeat
		System.out.println(message); // if you enter arunachal pradesh then it will give arunachal only
		System.out.println(message.contentEquals("Hello"));

	}

}
