package Test_codes;

import java.util.Scanner;

public class Zeroes_star_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=((2*n)+1);j++) {
				if(j==(n+1)) {
					System.out.print("*");
				}else if((j==1+i) || j==(((2*n)+1)-i)){
					System.out.print("*");					
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
