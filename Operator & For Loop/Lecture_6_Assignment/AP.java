package Lecture_6_Assignment;
import java.util.Scanner;
public class AP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;

		int counter=1;
		int i=1;
		while(counter<=n) {
			num=((3*i)+2);
			i++;
			if (num%4==0) {
				continue;
			}
			System.out.print(num+" ");
			counter=counter+1;
			
		}
		

	}

}
