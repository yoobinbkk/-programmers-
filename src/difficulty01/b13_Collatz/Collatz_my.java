package difficulty01.b13_Collatz;

public class Collatz_my {

	public int solution(int num) {

		int count = 0;

		while (count<500) {
			if (num == 1) {
				break;
			} else {
				if (num%2==0) {
					num /= 2;
				} else if (num%2==1) {
					num = (num * 3) + 1;
				}
				count++;
			}
		}
		return count==500 ? -1 : count;
	}

	public static void main(String[] args) {



	}

}
