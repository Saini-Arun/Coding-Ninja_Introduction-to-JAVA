package Array_codes;
import java.util.Scanner;
public class Arrange_no_in_array {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		if(n%2==0) {
			int x=1;
			for (int i=0;i<((n/2));i++) {
				arr[i]=x;
				x+=2;
				
				
			}
			int y=2;
			for(int j=(n-1);j>((n/2)-1);j--) {
				
				arr[j]=y;
				arr[j]=y;
				y+=2;
			}
		}else {
			int x=1;
			for (int i=0;i<((n+1)/2);i++) {	
				arr[i]=x;
				x+=2;
				
				
			}
			int y=2;
			for(int j=(n-1);j>((n-1)/2);j--) {
				
				arr[j]=y;
				y+=2;
			}
		}		
		return arr;
	}
	public static void print(int input[]){
		
		int size=input.length;
		for (int i=0;i<size;i++) {
			System.out.print(input[i]+" ");
		}
	}
	public static void main(String args[]) {
		int arr[]=takeinput();
		print(arr);
		
	}

}
