package difficulty01.d15_RootChecker;

public class RootChecker_my {

	public long solution(long n) {
		
		long answer = -1;

		for (int i=1 ; i<n ; i++) {
			if (n/i==i) {
				answer = (i+1) * (i+1);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		
		RootChecker_my a = new RootChecker_my();
		
		System.out.println(a.solution(25));
		System.out.println(a.solution(3));
		
	}

}
