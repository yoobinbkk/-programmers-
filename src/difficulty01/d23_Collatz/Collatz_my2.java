package difficulty01.d23_Collatz;

public class Collatz_my2 {
	
	public static int solution(int num) {
		long n = (long) num;
		for (int i=0 ; i<500 ; i++) {
			if (n==1) return i;
			n = (n%2==0) ? n/2 : n*3+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		System.out.println(solution(6));
		
	}

}
