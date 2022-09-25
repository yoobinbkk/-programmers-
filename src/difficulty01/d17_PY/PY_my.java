package difficulty01.d17_PY;

public class PY_my {
	
static boolean solution(String s) {
        
        boolean answer = false;
        
        String[] a = s.split("");
        
        int countP = 0;
        int countY = 0;
        
        for (int i=0 ; i<a.length ; i++) {
            if (a[i].equalsIgnoreCase("p"))
                countP++;
            if (a[i].equalsIgnoreCase("y"))
                countY++;
        }
        
        if (countP == countY)
            answer = true;

        return answer;
    }

	public static void main(String[] args) {
		
		System.out.println(solution("popoypyy"));
		System.out.println(solution("oooo"));
		System.out.println(solution("popoypy"));
		
	}

}
