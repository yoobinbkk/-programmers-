package test;

public class Test01 {

	public static String solution(String s) {
		String[] a = s.split(" ");

		int max = 0;
		int min = 10000;

		for (int i=0 ; i<a.length ; i++) {
			if (Integer.parseInt(a[i]) > max)
				max = Integer.parseInt(a[i]);
			if (Integer.parseInt(a[i]) < min)
				min = Integer.parseInt(a[i]);
		}

		return min + " " + max ;
    }

	public static void main(String[] args) {

		System.out.println(solution("1 2 3 4"));


	}
}
