package difficulty01.b18_RemoveMin;

import java.util.Arrays;

public class RemoveMin_my {

	public int[] solution(int[] arr) {

		int[] answer;
		int min = 1000;
		int temp = 0;

		if (arr.length<=1) {
			answer = new int[] {-1};
		} else {
			answer = new int[arr.length-1];
			for (int i=0 ; i<arr.length ; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}
			for (int i=0 ; i<arr.length ; i++) {
				if (arr[i]!=min) {
					answer[temp++] = arr[i];
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		RemoveMin_my a = new RemoveMin_my();
		int[] arr = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(a.solution(arr)));

	}

}
