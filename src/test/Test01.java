package test;

public class Test01 {

	public String solution(String phone_number) {
        String back4 = phone_number.substring(phone_number.length()-4);
        String answer = "";
        for (int i=0 ; i<phone_number.length()-4 ; i++) {
            answer += "*";
        }
        return answer + back4;
    }
		
	public static void main(String[] args) {

		

	}
}
