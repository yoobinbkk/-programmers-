package difficulty01.d8_HarshadNum;

import java.util.Arrays;

public class HarshadNum_my {
	
public static boolean solution(int x) {
        
        int a = x;
        int sum = 0;
        
        while (a!=0) {
            sum += a%10;
            a /= 10;
        }
        
        return x%sum==0;
    }

	public static void main(String[] args) {
		
		System.out.println(solution(12));
		System.out.println(solution(11));
		
	}

}
