package codes;

import java.util.Scanner;

public class Diamond_pattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=1;
		int c=(n-1)/2;
		int k=(n+1)/2;
		int g=1;
		
		while (i<=(n+1)/2){
			int j=1;
			while(j<=k-i) {
				System.out.print(" ");
				j++;
			}
			int d=1;
			while(d<=i) {
				System.out.print("*");
				d++;
			}
			int q=1;
			while(q<=i-1) {
				System.out.print("*");
				q++;
			}
			System.out.println();
			i++;
		}
		while(g<=c) {
			int l=1;
			while(l<=1) {
			System.out.print(" ");
			l++;
		}
			int e=1;
			while(e<=c-g+1) {
				System.out.print("*");
				e++;
			}
			int q=1;
			while(q<=c-g) {
				System.out.print("*");
				q++;
			}
			System.out.println();
			int f=1;
			while(f<=g) {
			System.out.print(" ");
			f++;
		}			
			g++;
		}

	}

}
//TA_Solution
//import java.util.Scanner;
//
//public class Solution {
//
//	public static void diamondOfStars(int n) {
//		Scanner sc= new Scanner(System.in);
//		
//		// int n=sc.nextInt();
//		int i=1;
//		int c=(n-1)/2;
//		int k=(n+1)/2;
//		int g=1;
//		
//		while (i<=(n+1)/2){
//			int j=1;
//			while(j<=k-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int d=1;
//			while(d<=i) {
//				System.out.print("*");
//				d++;
//			}
//			int q=1;
//			while(q<=i-1) {
//				System.out.print("*");
//				q++;
//			}
//			System.out.println();
//			i++;
//		}
//		while(g<=c) {
//			int l=1;
//			while(l<=1) {
//			System.out.print(" ");
//			l++;
//		}
//			int e=1;
//			while(e<=c-g+1) {
//				System.out.print("*");
//				e++;
//			}
//			int q=1;
//			while(q<=c-g) {
//				System.out.print("*");
//				q++;
//			}
//			System.out.println();
//			int f=1;
//			while(f<=g) {
//			System.out.print(" ");
//			f++;
//		}			
//			g++;
//		}
//
//	}
//
//}
