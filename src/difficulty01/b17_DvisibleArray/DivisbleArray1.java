package difficulty01.b17_DvisibleArray;

import java.util.*;

public class DivisbleArray1 {
	
	public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }

	public static void main(String[] args) {
		
		DivisbleArray1 div = new DivisbleArray1();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
		
	}

}
