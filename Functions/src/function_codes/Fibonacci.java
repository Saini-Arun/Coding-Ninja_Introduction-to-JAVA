package function_codes;
import java.util.Scanner;
public class Fibonacci {
	public static boolean fib(int n) {
		int t1=1;
		int t2=1;
		int t3=0;
		if (n<=1) {
			return true;
		}else {
		
		while (t3<n) {
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
		if (t3==n) {
			return true;
		}else
		{return false;
		
		}
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		System.out.println(fib(n));

	}

}
