package difficulty01.b14_IntMiddle;

public class IntMiddle1 {
	
	public static long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private static long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

	public static void main(String[] args) {
		
		System.out.println(solution(5,3));
		
	}

}
