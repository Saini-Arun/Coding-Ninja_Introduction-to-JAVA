package Array_codes;
import java.util.Scanner;
public class sumofN_using_array {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int sum(int input[]){
		int sum=0;
		int size=input.length;
		for (int i=0;i<size;i++) {
			sum=sum+input[i];
		}
		return sum;
	}
	
public static void main(String args[]) {
//	int arr[]=takeinput();
//	int sum=sum(arr);
//	System.out.println(sum);
	
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
}
}
