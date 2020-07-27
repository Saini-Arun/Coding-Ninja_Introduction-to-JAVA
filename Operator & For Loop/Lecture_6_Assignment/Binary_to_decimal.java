package Lecture_6_Assignment;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rev=1;
		rev=(n%10);
		int q=1;
		int pv=1;
		int ans=0;
		while(q>0) {
			ans=ans+(pv*rev);
		int x;
		x=(int)(n/10);
		q=x;
		rev=(q%10);
		pv=pv*2;
		n=x;

	}
		System.out.println(ans);

	}

}
