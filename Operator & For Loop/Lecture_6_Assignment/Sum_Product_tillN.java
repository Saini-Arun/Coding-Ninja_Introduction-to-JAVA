package Lecture_6_Assignment;
import java.util.Scanner;
public class Sum_Product_tillN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number.");
		int n=sc.nextInt();
		System.out.println("1 calculate sum. or 2 calculate Product.");
		int c=sc.nextInt();
		if (c==1) {
			int sum=0;
					for(int i=1;i<=n;i++) {
						sum=sum+i;
					}
					System.out.println(sum);						
		}
		if (c==2) {
			int product=1;
						for(int i=1;i<=n;i++) {
							product=product*i;
			}
			System.out.println(product);			
		}
		if (c!=1 && c!=2) {
			System.out.println("-1");
		}


	}

}
