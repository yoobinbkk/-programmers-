package difficulty01.b16_PhoneNum;

public class PhoneNum1 {

	public static String solution(String phone_number) {
		String answer = "";

		for (int i = 0; i < phone_number.length() - 4; i++)
			answer += "*";

		answer += phone_number.substring(phone_number.length() - 4);

		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution("01032361393"));


	}

}
