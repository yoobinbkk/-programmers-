package test;

public class Test01 {

public static int solution(int num) {
        
        int count = 0;
        
        while (num!=1) {
            if (num%2==0) {
                num /= 2;
            } else if (num%2==1) {
                num = (num * 3) + 1;
            }
            count++;
        }
        
        return count>500 ? -1 : count;
    }

	public static void main(String[] args) {

		System.out.println(solution(626331));


	}
}
