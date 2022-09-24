package difficulty01.d9_ReverseSort;

public class ReverseSort_my {
	
public static long solution(long n) {
        
        int size = (int)(Long.toString(n).length());
        int [] a = new int [size];
        
        int b = (int) n;
        
        for (int i=0 ; b!=0 ; i++) {
            a[i] = b%10;
            b /= 10;
        }
        
        for (int i=size-1 ; i>0 ; i--) {
            for (int j=0 ; j<i ; j++) {
                if (a[j] < a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        String c = "";
        for (long i : a) {
        	c += i;
        }
        
        return Long.parseLong(c);
    }

	public static void main(String[] args) {
		
		System.out.println(solution(118372));
		
	}

}
