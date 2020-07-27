package for_loops;
import java.util.Scanner;
public class Print_all_Prime_Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int counter=0;
			int j=0;
			for (j=i;j>=1;j--) {
				if(i%j==0) {
					counter=counter+1;
				}
			}
				if(counter==2) {
					System.out.println(i);
				}
			}
	}
}
