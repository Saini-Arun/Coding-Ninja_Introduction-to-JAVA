package Lecture_Codes;
import java.util.Scanner;
public class Char_Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int i =1;
		while(i<=N)
		{
            int j=1;
            char startingchar=(char)('A'+i-1);
			while(j<=i){				
			System.out.print((char)(startingchar+j-1));
				j++;
				}
			System.out.println();
			i++;
	}
}
}
