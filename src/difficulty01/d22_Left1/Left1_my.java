package difficulty01.d22_Left1;

public class Left1_my {
	
	public int solution(int n) {
        int answer = (n-1);
		
		int odd = 3;
		while (odd<n) {
			if ((n-1)%odd==0) {
				answer = odd;
				break;
			} else {
				odd += 2;
			}
		}
        
        if ((n-1)%2==0)
			answer = 2;

		return answer;
    }

	public static void main(String[] args) {
		
		
		
	}

}
