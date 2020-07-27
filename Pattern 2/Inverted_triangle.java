package codes;
import java.util.Scanner;
public class Inverted_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int x=n;
		while(i<=n) {
			int j=1;
			while(j<=n-i+1) {
				System.out.print(x);
				j++;
			}
			System.out.println();
			x--;
			i++;
		}

	}

}
