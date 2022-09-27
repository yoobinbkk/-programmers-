package difficulty01.b11_ArrayPlus;

import java.util.Arrays;

public class ArrayPlus_my {
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
		long a = Long.valueOf(x);
		long b = a;
		for (int i=0 ; i<n ; i++) {
			if (i==0) {
				answer[i] = a;
			} else {
				a += b;
				answer[i] = a;
			}
		}
		return answer;
    }

	public static void main(String[] args) {
		
		long[] a = solution(-10000000,1000);
		System.out.println(Arrays.toString(a));
		
	}

}
