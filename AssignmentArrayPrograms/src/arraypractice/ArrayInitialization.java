package arraypractice;
import java.util.Arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		char [] word= {'b','c','a','z','e'};
		
		System.out.println("values of aray ");
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
			
		}
		Arrays.sort(word);
		System.out.println("values of array after sort");
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		
		}
		System.out.println("values of arrays in reverse order");
		for (int i=word.length-1;i>=0;i--) {
			System.out.println(word[i]);
		}
	}

}
