package difficulty01.a2_Divisor;

public class Divisor_my {

	int solution(int n) {
		int answer = 0;
		for (int i=1 ; i<=n ; i++) {
			if (n%i==0) {answer += i;}
		}
		return answer;
	}

}
