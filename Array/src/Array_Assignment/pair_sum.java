package Array_Assignment;
import java.util.Scanner;
public class pair_sum {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void pairsum(int inpt[], int x) {
		int input[]=inpt;
		int size=input.length;
		for (int i=0;i<size;i++) {
			for(int j=(i+1);j<size;j++) {
				int a=input[i];
				int b=input[j];
				if(x==(a+b)) {
					if (a>b) {
						System.out.println(b+" "+a);
					}else {
						System.out.println(a+" "+b);
					}
					
				}
			}
		}
 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeinput();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		pairsum(arr,x);

	}

}
