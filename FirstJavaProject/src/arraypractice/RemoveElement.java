package arraypractice;

import java.util.Arrays;


public class RemoveElement {

	public static void main(String[] args) {
		
		int[] arrayA = {1,2,3,4,5,6,7,8,9};
		
			
			System.out.println("orignal array"+Arrays.toString(arrayA));
			
			int removeIndex=1;
			for(int j=removeIndex;j<arrayA.length-1;j++) {
				arrayA[j]=arrayA[j+1];
				
			}
			System.out.println("array after removing element"+Arrays.toString(arrayA));

		}
		
	}
