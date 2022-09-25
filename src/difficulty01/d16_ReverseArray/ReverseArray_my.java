package difficulty01.d16_ReverseArray;

import java.util.Arrays;

public class ReverseArray_my {
	
	// 결과값이 잘못된 코드
	
	public static int[] solution(long n) {

		int[] answer = {};
        long a = n;
        int arraySize = 0;
        
        while (a!=0) {
            arraySize++;
            a /= 10;
        }
        
        answer = new int [arraySize];
        
        for (int i=0 ; i<arraySize ; i++) {
            answer[i] = (int) n%10;
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
