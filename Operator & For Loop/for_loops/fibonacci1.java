package for_loops;
import java.util.Scanner;
public class fibonacci1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1;
		int b=1;
		int c=0;
		if(n==1 | n==2) {
			c=n;			
			System.out.println(c);
		}
		else {
			for(int i=3;i<=n;i++) {
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}
			
	}

}
