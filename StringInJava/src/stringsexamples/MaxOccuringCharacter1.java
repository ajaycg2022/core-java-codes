package stringsexamples;

import java.util.Scanner;

public class MaxOccuringCharacter1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str =sc.nextLine();
		char [] ch=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
			
		}
		int count;
		int max_count=0;
		char max_char='a';
		
		for(int i=0;i<ch.length;i++) {
			count =1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]){
					count =count+1;
				}
			}
			if(count>max_count) {
				max_count=count;
				max_char=ch[i];
			}
		}
		System.out.println(max_char);

	}

}
