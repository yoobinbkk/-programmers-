package difficulty01.b11_ArrayPlus;

import java.util.Arrays;

public class ArrayPlus1 {

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;

		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}

		return answer;

	}

	public static void main(String[] args) {

		long[] a = solution(-10000000,1000);
		System.out.println(Arrays.toString(a));

	}

}
