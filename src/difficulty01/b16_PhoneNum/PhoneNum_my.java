package difficulty01.b16_PhoneNum;

public class PhoneNum_my {
	
	public static String solution(String phone_number) {
        String back4 = phone_number.substring(phone_number.length()-4, phone_number.length());
        String answer = "";
        for (int i=0 ; i<phone_number.length()-4 ; i++) {
            answer += "*";
        }
        return answer + back4;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution("01032361393"));
		
	}

}
