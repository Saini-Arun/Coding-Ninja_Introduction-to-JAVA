package Lecture_Codes;
import java.util.Scanner;
public class Number_pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int i =1;
		while(i<=N)
		{
            int j=1;
            int printelement=i;
			while(j<=i){				
			System.out.print(printelement);
				j++;
				printelement--;
				}
			System.out.println();
			i++;
	}
}
}



