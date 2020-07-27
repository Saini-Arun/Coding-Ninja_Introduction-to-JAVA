package Assignment;

public class Remove_consecutive_Duplicates {
	public static String RCD(String input) {
		int length=input.length();
		String newstr="";
		newstr=newstr+input.charAt(0);
		for(int i=1;i<length;i++) {
			char previous=input.charAt(i-1);
			char current = input.charAt(i);
			if (previous!=current) {
				newstr=newstr+current;
			}
		}
		return newstr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bbbccchhhhuujjiikklloopp";
		String f=RCD(str);
		System.out.println(f);

	}

}
