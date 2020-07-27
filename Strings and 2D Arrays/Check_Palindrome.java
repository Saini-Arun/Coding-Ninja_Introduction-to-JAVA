package Lecture_codes;

import java.util.Scanner;

public class Check_Palindrome {
	
	public static boolean palindrome(String str) {
		boolean b=true;
		int x=str.length();
		char ch[]=new char[str.length()];
		for (int i=0;i<=(str.length()/2);i++) {
			ch[i]=str.charAt(i);
			ch[x-1-i]=str.charAt(x-1-i);
			if(ch[i]==ch[x-1-i]) {
			}else {
				return b=false;
			}
		
		}
		return b;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(palindrome(str));

	}

}
