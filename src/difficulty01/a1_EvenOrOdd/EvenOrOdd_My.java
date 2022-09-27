package difficulty01.a1_EvenOrOdd;

public class EvenOrOdd_My {

	public String solution_my(int num) {
		String answer = null;
		if (num%2==0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}
}
