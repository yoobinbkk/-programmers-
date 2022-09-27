package difficulty01.a5_RootChecker;

public class RootChecker_my2 {
	
	public static long solution(long n) {
        long answer = -1;
        
        if (Math.sqrt(n)==(int)Math.sqrt(n))
            answer = (long)((Math.sqrt(n)+1) * (Math.sqrt(n)+1));
            
        return answer;
    }

	public static void main(String[] args) {
		
		System.out.println(solution(25));
		System.out.println(solution(3));
		
	}

}
