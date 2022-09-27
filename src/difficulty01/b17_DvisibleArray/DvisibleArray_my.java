package difficulty01.b17_DvisibleArray;

import java.util.Arrays;

import test.Test02;

public class DvisibleArray_my {
	
public int[] solution(int[] arr, int divisor) {
		
		int[] a;

		int count = 0, temp = 0;
		for (int i=0 ; i<arr.length ; i++) {
			if (arr[i]%divisor==0)
				count++;
		}

		if (count!=0) {
			a = new int[count];
			for (int i=0 ; i<arr.length ; i++) {
				if (arr[i]%divisor==0) {
					a[temp++] = arr[i];
				}
			}
		} else {
			a = new int[] {-1};
		}
		Arrays.sort(a);

		return a;
}

	public static void main(String[] args) {
		
		int[] z = new int[] {5, 9, 7, 10};

		Test02 a = new Test02();
		System.out.println(Arrays.toString(a.solution(z, 5)));
		
	}

}
