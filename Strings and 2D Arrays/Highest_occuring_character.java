package Assignment;

public class Highest_occuring_character {
	public static char HoC(String inputString) {
		int length=inputString.length();
		char freq[]=new char[256];
		int largest=0;
		int n=Integer.MIN_VALUE;
		for(int i=0;i<length;i++) {
			int ascii=(int)inputString.charAt(i);
			freq[ascii]++;			
		}
		
		
		for (int k=0;k<inputString.length();k++) {
            int ascii=(int)inputString.charAt(k);
			
			if (freq[ascii]>largest) {
				largest=freq[ascii];	
				n=ascii;
                
			}
		}
		char ch=(char)n;
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="manisha khattar";
		System.out.println(HoC(str));

	}

}
