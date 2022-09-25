package difficulty01.d19_ReverseSort;

public class ReverseSort1 {
	
	String res = "";
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
        
    }

	public static void main(String[] args) {
		
		ReverseSort1 a = new ReverseSort1();
		System.out.println(a.reverseInt(118372));
		
	}

}
