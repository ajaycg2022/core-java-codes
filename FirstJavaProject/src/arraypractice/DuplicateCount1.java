package arraypractice;

public class DuplicateCount1 {

	public static void main(String[] args) {
		int i=0,j,dup_count=0;
		char[] Dup_count_arr= {'a','b','c','a'};
		
		while(i<Dup_count_arr.length) {
			j=i+1;
			while(j<Dup_count_arr.length) {
				if(Dup_count_arr[i]==Dup_count_arr[j]) {
					dup_count++;
					break;
				}
				j++;
				
			}
			i++;
		}
         System.out.println("the tota number of Duplicates="+dup_count);
	}

}
