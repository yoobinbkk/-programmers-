package difficulty01.d22_Left1;

public class Left1_2 {
	
	public int solution2(int n) {
        int answer = 0;
        for (int i=2; i<n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            } 
        }
        return answer;
    }
	
	public int solution3(int n) {
        int answer = 1;

        while(true) {
            if (n%answer==1) break;
            answer++;
        }

        return answer;
    }

	public static void main(String[] args) {
		
		
		
	}

}
