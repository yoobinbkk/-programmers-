package difficulty01.a5_RootChecker;

public class RootChecker2 {

	public static long solution(long n) {

		double i = Math.sqrt(n);
		return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
	}

	public static void main(String[] args) {

		System.out.println(solution(25));
		System.out.println(solution(3));

	}

}
