package difficulty01.b12_Left1;

public class Left1_my2 {
	
	public int solution4(int n) {
		int answer = 1;
		
		while (true) {
			if (n%answer==1) break;
			answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		
		
		
	}

}
