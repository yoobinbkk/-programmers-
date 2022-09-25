package test;

public class Test02 {

	public int solution(int n) {
		int answer = (n-1);
		
		if ((n-1)%2==0)
			answer = 2;
		
		int odd = 3;
		while (odd<n) {
			if ((n-1)%odd==0) {
				answer = odd;
				break;
			} else {
				odd += 2;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Test02 a = new Test02();
		System.out.println(a.solution(351247));

	}

}
