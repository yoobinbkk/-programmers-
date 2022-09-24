package difficulty01.d2_Divisor;

public class MainTest {

	public static void main(String[] args) {
		
		System.out.println("===== 내 Solution =====");
		
		Divisor_my a = new Divisor_my();
		System.out.println("결과 : " + a.solution(10));
		System.out.println("결과 : " + a.solution(50));
		System.out.println("결과 : " + a.solution(100));
		System.out.println("결과 : " + a.solution(500));
		System.out.println("결과 : " + a.solution(1000));
		System.out.println("결과 : " + a.solution(3000));
	}

}
