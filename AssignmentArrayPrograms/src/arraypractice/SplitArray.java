package arraypractice;

import java.util.Arrays;

public class SplitArray {
	public static void main(String[] args) {

		{
			int[] arrayA = { 1, 2, 3, 4, 5,6 };
			int n = arrayA.length;

			int[] a = new int[(n + 1) / 2];
			int[] b = new int[n - a.length];

			for (int i = 0; i < n; i++) {
				if (i < a.length) {
					a[i] = arrayA[i];
				} else {
					b[i - a.length] = arrayA[i];
				}
			}

			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
		}
	}
}
