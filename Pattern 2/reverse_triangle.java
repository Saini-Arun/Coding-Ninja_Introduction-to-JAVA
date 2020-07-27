package codes;
import java.util.Scanner;
public class reverse_triangle {

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
				System.out.print(d);
				d++;
			}
			System.out.println();
			i++;
		}

	}

}
