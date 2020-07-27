package Lecture_codes;

public class PrintSubStrings {
	public static void printsubstrings(String str) {
		for(int i=0;i<str.length();i++) {
		for(int k=i;k<str.length();k++) {
			System.out.println(str.substring(i, k+1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ARUN";
		printsubstrings(str);
		

	}

}
