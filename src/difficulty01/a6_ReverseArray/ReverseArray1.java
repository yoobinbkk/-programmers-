package difficulty01.a6_ReverseArray;

import java.util.Arrays;

public class ReverseArray1 {

	public static int[] solution(long n) {
		String a = "" + n;
		int[] answer = new int[a.length()];
		int cnt=0;

		while(n>0) {
			answer[cnt]=(int)(n%10);
			n/=10;
			cnt++;
		}
		return answer;
	}

	public static void main(String[] args) {

		int a[] = solution(12345);
		System.out.println(Arrays.toString(a));
        
		int b[] = solution(12345678910L);
		System.out.println(Arrays.toString(b));
		
	}

}
