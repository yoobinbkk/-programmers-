package difficulty01.b18_RemoveMin;

import java.util.Arrays;

public class RemoveMin1 {
	
	public int[] solution(int[] arr) {
	      if (arr.length <= 1) return new int[]{ -1 };
	      int min = Arrays.stream(arr).min().getAsInt();
	      return Arrays.stream(arr).filter(i -> i != min).toArray();
	  }

	public static void main(String[] args) {
		
		RemoveMin1 a = new RemoveMin1();
		int[] arr = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(a.solution(arr)));
		
	}

}
