package test;

public class Test02 {

	public static String solution(String s) {
		String[] a = s.split(" ");

		int min, max, n;
		min = max = Integer.parseInt(a[0]);

		for (int i=1 ; i<a.length ; i++) {
			n = Integer.parseInt(a[i]);
			if (max < n) max = n;
			if (min > n) min = n;
		}

		return min + " " + max ;
	}

	public static void main(String[] args) {

		System.out.println(solution("1 2 3 4"));


	}

}
