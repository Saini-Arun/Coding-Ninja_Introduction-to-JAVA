package Lecture_6_Assignment;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int remainder;
		int pv=1;
		int ans=0;
		while(n!=0) {
			remainder=n%2;
			ans=ans+(remainder*pv);
			n=(int)n/2;
			pv=pv*10;
		}
		System.out.println(ans);
	}

}
