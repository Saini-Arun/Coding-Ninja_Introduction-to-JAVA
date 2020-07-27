package codes;
import java.util.Scanner;
public class Isosceles_StarPattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while (i<=n){
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			int d=1;
			while(d<=i) {
				System.out.print("*");
				d++;
			}
			int p=i-1;
			int q=1;
			while(q<=i-1) {
				System.out.print("*");
				p--;
				q++;
			}
			System.out.println();
			i++;
		}

	}

}
