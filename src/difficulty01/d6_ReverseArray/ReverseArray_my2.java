package difficulty01.d6_ReverseArray;

import java.util.Arrays;

public class ReverseArray_my2 {
	
	public static int[] solution(long n) {

//		String aSize = "" + n;
		int aSize = Long.toString(n).length();
		int[] answer = new int[aSize];
        
        for (int i=0 ; i<aSize ; i++) {
            answer[i] = (int) (n%10);
            n /= 10;
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
