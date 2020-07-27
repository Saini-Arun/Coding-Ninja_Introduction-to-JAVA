package codes;
import java.util.Scanner;

public class Isosceles_triangleNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int r=0;
		while (i<=n){
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			int d=1;
			int x=i;
			while(d<=i) {				
				System.out.print(x);
				r=x;
				x++;
				d++;
			}
			int p=r-1;
			int q=1;
			while(q<=i-1) {
				System.out.print(p);
				p--;
				q++;
			}
			System.out.println();
			i++;

	}
}
}
