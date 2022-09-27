package difficulty01.b16_PhoneNum;

public class PhoneNum2 {
	
	public String solution(String phone_number) {
	     char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
	  }

	public static void main(String[] args) {
		
		
		
	}

}
