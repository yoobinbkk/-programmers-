package difficulty01.d22_Left1;

import java.util.stream.IntStream;

public class Left1_1 {
	
	public int solution(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }

	public static void main(String[] args) {
		
		
		
	}

}
