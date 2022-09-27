package difficulty02.a9_Carpet;

import java.util.Arrays;

import test.Test02;

public class Carpet_my {

	public static int[] solution(int brown, int yellow) {
		int[] a = new int[2];

		int total = brown + yellow;
		int count = 3;

		while (true) {
			if (total%count==0 & yellow%(count-2)==0) {
				if ((total/count-2)*(count-2)==yellow) {
					a[0] = total/count;
					a[1] = count;
					break;
				}
			}
			count++;
		}

		return a;
	}

	public static void main(String[] args) {

		Test02 a = new Test02();
		System.out.println(Arrays.toString(solution(24, 24)));

	}

}
