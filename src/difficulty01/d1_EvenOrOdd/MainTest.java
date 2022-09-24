package difficulty01.d1_EvenOrOdd;

public class MainTest {

	public static void main(String[] args) {
		
		System.out.println("===== 내 Solution =====");
		
		EvenOrOdd_My a = new EvenOrOdd_My();
		String a1 = a.solution_my(2);
		String a2 = a.solution_my(3);
		
		System.out.println("결과 : " + a1);
		System.out.println("결과 : " + a2);
		
		System.out.println("===== Solution 1 =====");
		
		EvenOrOdd_01 b = new EvenOrOdd_01();
		String b1 = b.solution2(2);
		String b2 = b.solution2(3);
		
		System.out.println("결과 : " + b1);
		System.out.println("결과 : " + b2);

		
	}

}
