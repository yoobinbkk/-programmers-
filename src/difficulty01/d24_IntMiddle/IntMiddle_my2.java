package difficulty01.d24_IntMiddle;

public class IntMiddle_my2 {
	
	public static long solution(int a, int b) {
		long answer = 0;

		for (int i=Math.min(a, b) ; i<=Math.max(a, b) ; i++) {
			answer += i;
		}

		return answer;
	}

	public static void main(String[] args) {
		
		System.out.println(solution(1,10));
		
	}

}
