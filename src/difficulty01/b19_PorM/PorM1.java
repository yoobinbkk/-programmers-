package difficulty01.b19_PorM;

public class PorM1 {
	
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }

	public static void main(String[] args) {
		
		int[] ab = new int[] {4,7,12};
		boolean[] signs = new boolean[] {true,false,true};
		
		PorM1 a = new PorM1();
		System.out.println(a.solution(ab, signs));
		
	}

}
