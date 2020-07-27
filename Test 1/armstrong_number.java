package Test_codes;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double ans=0;
		int remainder,orgnumber,n1=0;
		orgnumber=n;
		for(;orgnumber!=0;orgnumber=orgnumber/10,++n1) {
			
		}
			
			orgnumber=n;
			for(;orgnumber!=0;orgnumber=orgnumber/10) {
				remainder=(int)orgnumber%10;
				ans=ans+Math.pow(remainder,n1);
			}
			
			if(ans==n) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
	}
}
//int originalNumber, remainder, result = 0, n = 0;
//
//originalNumber = number;
//
//for (;originalNumber != 0; originalNumber /= 10, ++n);
//
//originalNumber = number;
//
//for (;originalNumber != 0; originalNumber /= 10)
//{
//    remainder = originalNumber % 10;
//    result += Math.pow(remainder, n);
//}
//
//if(result == number)
//    System.out.println("true");
//else
//    System.out.println("false");
//
//}
//}
