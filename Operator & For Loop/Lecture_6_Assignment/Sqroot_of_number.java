package Lecture_6_Assignment;

import java.util.Scanner;

public class Sqroot_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		int ans=0;
		while(ans<=n) {
			ans=i*i;
			if (ans>n) {
				i=i-1;
				System.out.println(i);
				break;
			}
			if (ans==n) {
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
