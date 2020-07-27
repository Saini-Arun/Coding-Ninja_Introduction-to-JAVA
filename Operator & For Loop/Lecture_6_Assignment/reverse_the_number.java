package Lecture_6_Assignment;
import java.util.Scanner;
public class reverse_the_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rev=1;
		rev=(n%10);
		int q=1;
		while(q>0) {
		int x;
		x=(int)(n/10);
		q=x;
		rev=(rev*10)+(q%10);
//		System.out.println(q);
		n=x;

	}
		System.out.println((int)rev/10);
	}

}
