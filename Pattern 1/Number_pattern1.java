package Lecture_Codes;
import java.util.Scanner;
public class Number_pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int i =1;
		while(i<=N)
		{
            int j=1;
			while(j<=i){
			System.out.print(i);
				j++;
				}
			System.out.println();
			i++;
	}
}
}


