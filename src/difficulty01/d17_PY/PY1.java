package difficulty01.d17_PY;

public class PY1 {
	
	static boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }

	public static void main(String[] args) {
		
		System.out.println(solution("popoypyy"));
		System.out.println(solution("oooo"));
		System.out.println(solution("popoypy"));
		
	}

}
